package ch07.sort;

import org.junit.Test;

import java.util.Arrays;

public class BuubleSort {
    @Test
    public static void main(String[] args) {
        int[] arr = {3,2,6,3,7,1};
        int temp = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
            System.out.println("第" + (j + 1) + "趟排序后的数组");
            System.out.println(Arrays.toString(arr));
        }


    }
}
