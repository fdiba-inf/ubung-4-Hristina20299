package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayOutput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = input.nextInt();
    int[] numbers = new int [count];
    String empty = " ";
    for (int index = 0; index < numbers.length; index++) {
      numbers[index] = input.nextInt();
    }
    for (int index = 0; index < numbers.length; index++) {
    System.out.println(numbers[index]);
    empty = empty + " ";
    System.out.print(empty);
    }
  }
}