package com.company.lessom7;

public class task2 {

    public static void main(String[] arg){
        System.out.println(sort(new int[]{1, 4, 2, 7, 9}));

    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
