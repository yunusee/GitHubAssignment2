
 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayAssignment{
  public static void main(String[] args) {
    
  }

  public static int[] createArray(int num){
    int[] array = new int[num];
    Random random = new Random();

    for(int i = 0; i < array.length; i++){
      array[i] = random.nextInt(101);
    } 
    return array;
  }

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
  public static int minimumOfArray( int[] arr )
  {
    int minimum = arr[0];

    for ( int i = 0; i < arr.length; i++ )
    {
      if ( arr[i] < minimum )
        minimum = arr[i];
    }
    return minimum;
  }

  public static int maximumOfArray( int[] arr )
  {
    int maximum = arr[0];

    for ( int i = 0; i < arr.length; i++ )
    {
      if ( arr[i] > maximum )
        maximum = arr[i];
    }
    return maximum;
  }
  

}
