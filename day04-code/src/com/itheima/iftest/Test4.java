package com.itheima.iftest;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的会员等级为:");
        int vip = sc.nextInt();
        if (vip == 1){
            System.out.println("实际支付的价格为："+1000*0.9);
        }else if (vip == 2){
            System.out.println("实际支付的价格为："+1000*0.8);
        } else if (vip == 3) {
            System.out.println("实际支付的价格为："+1000*0.7);
        }else {
            System.out.println("没有打折，要打也是打骨折！");
            System.out.println("支付的价格为：1000");
        }
    }
}
