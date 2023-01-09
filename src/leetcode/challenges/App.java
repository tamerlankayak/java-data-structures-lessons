package leetcode.challenges;

import java.util.Arrays;

public class App {
    public static void missingNumber(int[] intArray) {
        int lastNumber = intArray[intArray.length - 1];
        int sum = (lastNumber * (lastNumber + 1)) / 2;
        int sumOfArr = 0;
        for (int j : intArray) {
            sumOfArr += j;
        }
        int missingNumber = sum - sumOfArr;
        System.out.println(missingNumber);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static int searchInArray(int[] array, int valueToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToSearch) {
                return i;
            }
        }
        throw new IllegalArgumentException("Value not founded");
    }

    public static String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProduct) {
                    maxProduct = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }

    public static boolean isUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return false;
        }
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last = offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        App app = new App();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//output

        System.out.println(Arrays.deepToString(matrix));
    }
}
