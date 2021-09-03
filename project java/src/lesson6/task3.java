package lesson6;

import java.util.Arrays;

public class task3 {
    public static void main(String... ar) {
        String[][] array = new String[3][6];
        char symb = 'a';
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = symb + "" + j;
            }
            symb++;

        }

        System.out.println(Arrays.deepToString(array));
    }
}
