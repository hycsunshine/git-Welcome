package com.itheima.WhileTest;

//给我一个整数x
//如果x是一个回文整数，打印true，否则，打印false，比如123是回文数

public class homework {
    public static void main(String[] args) {
        //核心思想：吧数字倒过来与原来的进行比较
        int x = 211;
        int temp = x;
        int num = 0;
        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
//            System.out.println(x);
        }
        System.out.println(num);
        System.out.println(num == temp);
    }
}
