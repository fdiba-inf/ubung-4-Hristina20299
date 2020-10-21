package exercise4;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReversal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    char numbers[] = new char[a];
    char count[] = new char[a];
    int c = numbers.length-1;
    for(int index = 0; index < numbers.length; index++) {
      numbers[index] = input.next().charAt(0);
    }
    for (int i = 0; i < count.length; i++) {
      count[i] = numbers[c];
      c--;
    }
    String name = Arrays.toString(count);
    System.out.println("Reversed symbols: " + name);
  }
}