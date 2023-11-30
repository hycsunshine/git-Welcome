package com.operator.demo1;

import java.util.Scanner;

public class OperatorCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("输出一个三位数:" + i);
        System.out.println("个位数为:"+ i % 10);
        System.out.println("十位数为:"+ i / 10 % 10);
        System.out.println("百位数为:"+ i / 100 % 10);
        System.out.println("千位数为:"+ i / 1000 % 10);

    }
}
