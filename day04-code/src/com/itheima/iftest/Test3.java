package com.itheima.iftest;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出你的票数为多少:");
        int poll = sc.nextInt();
        if (poll >= 0 && poll <= 100) {
            if (poll % 2 == 0) {
                System.out.println("你的位置是在右边的！");
            } else {
                System.out.println("你的位置是在左边的！");
            }
        }
    }

}
