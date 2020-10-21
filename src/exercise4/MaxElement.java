package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MaxElement {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    double[] maximum = new double[a];
    for (int index = 0; index < maximum.length; index++) {
      maximum[index] = input.nextDouble();
    }
    for (int count = 0; count < maximum.length; count++) {
      double max = 0;
      if (maximum[count] > max) {
        max = maximum[count];
      }
        System.out.println("Max number: " + max);

    }
  }
}