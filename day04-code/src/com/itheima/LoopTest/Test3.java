package com.itheima.LoopTest;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //统计满足条件的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("输出第一个数字是：");
        int a = sc.nextInt();
        System.out.println("输出第二个数字是：");
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                //打印符合要求的数字
                System.out.println(i);
                //统计符合要求的个数
                count++;
            }
        }
        System.out.println(count);
    }
}

