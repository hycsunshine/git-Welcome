package com.itheima.WhileTest;

//回文数
//核心思路:把倒过来的数字与原来的数字进行比较
public class WhileTest1 {
    public static void main(String[] args) {
        //定义一个数字x
        int x = 123456;
        //定义一个临时变量用于记录x原来的值，用于最后的比较
        int temp = x;
        //记录倒过来之后的结果
        int num = 0;
        //不知道循环的次数和范围，只知道结束条件，所以同while循环
        while (x != 0) {
            //从右往左获取每一位数字
            int ge = x % 10;
            //每次都修改x记录的值
            x = x / 10;
            //把当前获取到的数字拼接到最右边
            num = num * 10 + ge;
        }
        //打印num
        System.out.println(num);
        //打印x会错，因为前面一直在修改
        System.out.println(x);
        //将倒过来的值与临时temp进行比较
        System.out.println(num == temp);
    }
}
