package com.itheima.WhileTest;

public class WhileTest2 {
    public static void main(String[] args) {
        int dividend = 33;
        int divisor = 10;
        int count = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("余数是：" + dividend);
        System.out.println("商是：" + count);

        //回文数打印，如121
        int a = 12345;
        int temp = a;
        int num = 0;
        while (a != 0) {
            int ge = a % 10;
            num = num * 10 + ge;
            a = a / 10;
        }
        System.out.println(num);
        System.out.println(num == temp);


    }
}
