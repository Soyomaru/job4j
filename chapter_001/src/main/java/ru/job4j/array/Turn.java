package ru.job4j.array;

public class Turn {

    public int[] back(int[] array) {
        int tempVar;
        for (int index = 0; index < (array.length / 2); index++ ){
            tempVar = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = tempVar;
        }
        return array;
    }
}
