package com.itheima.methoddemo;

import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        getSum();
    }

    public static void getSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的第一个数字：");
        int number1 = sc.nextInt();
        System.out.println("请输入你的第二个数字：");
        int number2 = sc.nextInt();
        int sum = 0;
        sum = number1 + number2;
        System.out.println(sum);
    }
}
