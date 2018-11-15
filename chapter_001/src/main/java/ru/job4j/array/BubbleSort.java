package ru.job4j.array;

public class BubbleSort {

    public int[] sort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int tempVar;
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    tempVar = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tempVar;
                }
            }
        }
        return array;
    }
}