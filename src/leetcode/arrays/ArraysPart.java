package leetcode.arrays;

import leetcode.arrays.TwoDimensionalArray;

import java.util.Arrays;

public class ArraysPart {
    public static void main(String[] args) {
        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        tda.insertValueInTheArray(0, 0, 10);
        tda.insertValueInTheArray(0, 1, 20);
        tda.insertValueInTheArray(1, 0, 30);
        tda.insertValueInTheArray(2, 0, 40);

        //tda.accessCell(0, 0);
        //System.out.println(Arrays.deepToString(tda.arr));
        //tda.traverse2DArray();
        //tda.searchingValue(20);

        System.out.println(Arrays.deepToString(tda.arr));
        tda.deleteValueFromArray(0, 0);
        System.out.println(Arrays.deepToString(tda.arr));
    }
}
