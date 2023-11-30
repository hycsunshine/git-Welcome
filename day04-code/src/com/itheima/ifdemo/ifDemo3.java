package com.itheima.ifdemo;

import java.util.Scanner;

//if第二种格式

public class ifDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("你实际支付了多少钱？");
        int money = sc.nextInt();
        if(money >= 600){
            System.out.println("你已经付款成功了啊！");
        }else{
            System.out.println("抱歉，你的付款失败了！");
        }

    }
}
