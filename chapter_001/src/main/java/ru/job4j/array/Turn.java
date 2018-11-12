package ru.job4j.array;

public class Turn {

    public int[] back(int[] array) {
        int tempVar;
        int arrayLength = array.length;
        for (int index = 0; index < (arrayLength / 2); index++ ){
            tempVar = array[index];
            array[index] = array[arrayLength - index - 1];
            array[arrayLength - index - 1] = tempVar;
        }
        return array;
    }
}
