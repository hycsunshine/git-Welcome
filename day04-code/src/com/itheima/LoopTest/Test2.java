package com.itheima.LoopTest;

public class Test2 {
    public static void main(String[] args) {
        // 求1-100的偶数和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // 对1-100进行求和
//            sum = sum + i;
            // 对1-100进行偶数求和
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
