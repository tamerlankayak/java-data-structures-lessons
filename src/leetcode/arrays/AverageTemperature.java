package leetcode.arrays;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many days' temperatures? ");
        int numDays = console.nextInt();
        int[] temps = new int[numDays];

        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "' high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        double average = sum / numDays;
        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println(above + " days above average");
    }
}
