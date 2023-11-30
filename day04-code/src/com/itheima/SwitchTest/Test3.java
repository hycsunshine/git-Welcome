package com.itheima.SwitchTest;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输出你的按键数是：");
        int number = sc.nextInt();
        switch (number) {
            case 1 -> System.out.println("机票查询！");
            case 2 -> System.out.println("机票预订！");
            case 3 -> System.out.println("机票改签！");
            default -> System.out.println("退出服务！");
        }
    }
}
