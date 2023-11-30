package com.itheima.ifdemo;

import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        //大于两斤，给出回应，反之不回应
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        if(i>2){
            System.out.println("你小子酒量不错耶！");
        }
       else{
            System.out.println("离我女儿远点好吧！");
        }
    }
}
