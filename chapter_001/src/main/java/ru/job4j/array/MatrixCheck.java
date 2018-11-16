package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;

//прямая диагональ
        for (int index = 1; (index < data.length) && (index < data[0].length); index++) {
            if (data[index][index] != data[index - 1][index - 1]) {
                result = false;
                break;
            }
        }

        if (!result) {
            return result;
        }

//обратная диагональ
        for (int index = 1; (index < data.length) && (index < data[0].length); index++) {
            if (data[index][data[index].length - index - 1] != data[index - 1][data[index - 1].length - index]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
