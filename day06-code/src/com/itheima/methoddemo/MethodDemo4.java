package com.itheima.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        //带参数的方法调用
        //形参：形式参数，指在方法定义中的参数
        //实参：实际参数，指在方法调用中的参数
        MethodDemo4.getSum(77,99);

    }
    //方法定义的小技巧
    //1、我要干什么？（方法体）
    //2、我干这件事需要什么才能完成？（形参）
    public static void getSum(int  number1, int number2) {
        int result = number1 + number2;
        System.out.println(result);
    }
}
