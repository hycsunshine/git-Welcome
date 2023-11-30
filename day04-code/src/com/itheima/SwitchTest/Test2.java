package com.itheima.SwitchTest;

import java.util.Scanner;

//case穿透

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入今天的星期数是：");
        int week = sc.nextInt();
        switch(week){
            case 1,2,3,4,5:
                System.out.println("这是工作日！");
                break;
            case 6,7:
                System.out.println("这是休息日！");
                break;
            default:
                System.out.println("没有这个星期！");
        }

    }
}
