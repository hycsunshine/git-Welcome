package com.itheima.iftest;

public class Test2  {
    public static void main(String[] args) {
       // 定义三个灯的状态
        //如何绿灯亮，就可以行驶
        //如何黄灯亮，就可以减速
        //如果红灯亮，就可以停止
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;
        if (isLightGreen){
            System.out.println("gogogo!");
        }
        if (isLightYellow){
            System.out.println("slow!");
        }
        if (isLightRed){
            System.out.println("stop!");
        }
    }
}
