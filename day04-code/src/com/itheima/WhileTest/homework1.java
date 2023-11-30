package com.itheima.WhileTest;

//求商和余数，不使用乘法除法和%运算符

public class homework1 {
    public static void main(String[] args) {
        int number1 = 33;
        int number2 = 10;
        int count = 0;
        while(number1>=number2){
            number1 = number1-number2;
            count++;
        }
        System.out.println(number1);
        System.out.println(count);
    }
}
