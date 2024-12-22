public class Array {
    int arr[] = null;

    public Array(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

    public void searchInArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    public void deleteValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }

    public static void main(String[] args) {
        Array array = new Array(5);

        array.insert(0, 10);
        array.insert(1, 20);
        array.insert(2, 30);

        System.out.println("Traversing array:");
        array.traverseArray();

        System.out.println("Searching for 20:");
        array.searchInArray(20);

        System.out.println("Deleting value at index 1:");
        array.deleteValue(1);

        System.out.println("Traversing array after deletion:");
        array.traverseArray();
    }
}
