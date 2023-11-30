package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        //定义一个方法，求一家商场每个季度的销售额，根据方法结果在计算出全年的销售额

        //1、直接调用  : 一般用于没有返回值的情况
//        getSum(10,20,30);
        //2、赋值调用
//        double sum = getSum(10,20,30);
//        System.out.println(sum);
//        //3、输出调用
//        System.out.println(getSum(10,20,30));

        double sum1 = getSum(100,200,300);
        double sum2 = getSum(400,500,600);
        double sum3 = getSum(700,800,900);
        double sum4 =getSum(1000,1100,1200);
        double sum = sum1+sum2+sum3+sum4;
        System.out.println(sum);
    }
    public static double getSum(double num1,double num2,double num3){
        double result = num1 + num2 +num3;
        return result;
    }
}
