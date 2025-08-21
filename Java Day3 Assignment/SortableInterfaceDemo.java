// SortableInterfaceDemo.java
// 28. Sortable Interface
// Problem: Interface Sortable with sort(int[] arr). Implement in BubbleSort and QuickSort.
// Steps:
// 1.	Define interface.
// 2.	Implement sorting in classes.
// 3.	Test sorting arrays.

import java.util.Arrays;

interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted using Bubble Sort: " + Arrays.toString(arr));
    }
}

class QuickSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array sorted using Quick Sort: " + Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

public class SortableInterfaceDemo {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 4, 2};
        int[] arr2 = {10, 7, 8, 9, 1, 5};

        Sortable bubble = new BubbleSort();
        Sortable quick = new QuickSort();

        // Test Bubble Sort
        bubble.sort(arr1);

        // Test Quick Sort
        quick.sort(arr2);
    }
}
