package ternaryoperator;

import java.util.Scanner;

public class TeraryoperatorDemo1 {
    public static void main(String[] args) {
        //三元运算符,从键盘输入两个整数，求两个数的最大值；
        Scanner sc = new Scanner(System.in);
        System.out.println("输入的第一个整数是:");
        int number1 = sc.nextInt();
        System.out.println("输入的第二个整数是:");
        int number2 = sc.nextInt();
        //三元运算符
        int max = number1 > number2 ? number1 : number2;
        System.out.println("输出两个数的最大值为:" + max);

    }
}
