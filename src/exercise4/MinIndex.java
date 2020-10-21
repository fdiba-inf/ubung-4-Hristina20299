package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class MinIndex {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = 0;
    double[] min = new double [a];
    for (int index = 0; index < min.length; index++) {
      min[index] = input.nextDouble();
    }
    double minimum = 0;
    for (int count = 0; count < min.length; count++) {
      if (minimum > min[count]) {
        minimum = min[count];
      }

    }
    for (int count = 0; count < min.length; count++) {
      if(minimum==min[count]) {
        b = count;
      }

    }
    System.out.println("Min index: " + b);
  }
}