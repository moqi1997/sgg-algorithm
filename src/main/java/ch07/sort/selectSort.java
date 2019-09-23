package ch07.sort;

import org.junit.Test;

import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int[] arr = {3,2,6,3,7,1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public static void selectSort(int[] arr){
        for (int j = 0; j < arr.length - 1; j++) {
            int minIndex = j;
            int min = arr[j];
            for (int i = 1 + j; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            if (minIndex != j) {
                arr[minIndex] = arr[j];
                arr[j] = min;
            }
            //System.out.println("第" + (j + 1) + "趟排序后的数组");

        }
    }
}
