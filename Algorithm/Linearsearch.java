public class LinearSearch {
    // Function for linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // element found, return index
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50};
        int key = 30;

        int result = linearSearch(numbers, key);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element " + key + " found at index: " + result);
        }
    }
}
