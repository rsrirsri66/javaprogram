package my_practice;

import java.util.*;

class Bubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First line is the length of the array, followed by the array elements
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the bubbleSortDesc function to sort the array in descending order
        bubbleSortDesc(arr);

        // Call the helper function to reverse the array
        reverseArray(arr);

        // Output the sorted and reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Bubble Sort function to sort the array in descending order
    private static void bubbleSortDesc(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // Set a flag to check if any swaps occurred during this pass
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {  // Compare adjacent elements in descending order
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred during this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // Helper function to reverse the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

