package com.itheima.whileDemo;

public class WhileDemo2 {
    public static void main(String[] args) {
        int conut = 0;
        double paper = 0.1;
        double height = 8844430;
        //不知道循环的次数也不知道循环的范围，只知道循环的结束条件，所以用while
        while(paper<height){
            paper = paper*2;
            conut++;
        }
        System.out.println(conut);
    }
}
