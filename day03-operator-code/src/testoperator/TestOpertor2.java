package testoperator;

import java.util.Scanner;

public class TestOpertor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        boolean result = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(result);

        int a = 10;
        int b = 20;
        int s= a > b ? a : b;
        System.out.println(s);
    }
}
