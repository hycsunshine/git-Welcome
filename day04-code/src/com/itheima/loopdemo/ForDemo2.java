package com.itheima.loopdemo;

public class ForDemo2 {
    public static void main(String[] args) {
        //求1-5的和
        int sum = 0;
        for (int i = 1;i<=5;i++){
//            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
        int[] hyc = new int[3];
        hyc[2]=7;
        for (int i = 0; i < hyc.length; i++) {
            System.out.println(hyc[i]);
        }
    }
}
