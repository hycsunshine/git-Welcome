package Test;

//猜数字小游戏

import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {
        //创建对象
        Random r = new Random();
        //生成随机数
        //判断技巧：
        //在随机数范围小括号中，这个范围一定是从开始的
        //到这个数-1才结束
        //口诀：包头不包尾，包左不包右
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(100);//0-99
            System.out.println(number);
        }

    }
}
