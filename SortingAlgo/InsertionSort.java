package SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 5, 1, 9};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }

    static int[] insertionSort(int[] arr){
        for (int i=0; i < arr.length - 1; i++){
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j);
                }else {
                    break;
                }
                
            }
        }
        return arr;
    }

    static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}