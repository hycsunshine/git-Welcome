package com.itheima.whileDemo;

public class WhileDemo1 {
    public static void main(String[] args) {
        //while循环，1-100求和
        int sum = 0;
        int i = 1;
        while (i<=100){
            i++;
            sum+=i;
        }
        System.out.println(sum);
    }
}
