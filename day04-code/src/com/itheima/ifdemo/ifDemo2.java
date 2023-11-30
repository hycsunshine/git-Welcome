package com.itheima.ifdemo;

import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        //键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请说出你身上还有多少钱？");
        int money = sc.nextInt();
        if (money >= 100){
            System.out.println("去吃网红餐厅！");
        }else {
            System.out.println("只能去吃经济实惠的沙县小吃了！");
        }
    }
}
