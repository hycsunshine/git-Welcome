package com.itheima.ifdemo;

//if的第三种格式

import java.util.Scanner;

public class ifDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩是多少:");
        int result = sc.nextInt();
        if (result >= 0 && result <= 100) {
            if (result >= 95 && result <= 100) {
                System.out.println("奖励自行车一辆！");
            } else if (result >= 90 && result <= 94) {
                System.out.println("奖励去游乐场玩一天！");
            } else if (result >= 80 && result <= 89) {
                System.out.println("奖励玩具变形金刚大黄蜂一个！");
            } else {
                System.out.println("那就只能给你捡两个了！");
            }
        } else {
            System.out.println("当前输出的小明成绩不合法！");
        }
    }
}

