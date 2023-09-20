
/**
 * alp_main
 */

import java.util.Arrays;

public class alp_main {

    public static double[] difference_average(int[] array_input) {

        double sum = 0;
        for (double i : array_input) {
            sum += i;
        }
        double average = sum / array_input.length;

        double[] result_array = new double[array_input.length];

        for (int i = 0; i < result_array.length; i++) {
            result_array[i] = array_input[i] - average;
        }
        return result_array;

    }



}