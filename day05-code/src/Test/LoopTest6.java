package Test;

import java.util.Random;

public class LoopTest6 {
    public static void main(String[] args) {
        //用来生成任意数到任意数之间的随机数，如1-10
        //1、让这个范围头尾都减去一个值，让这个范围从0开始，0-9
        //2、尾巴+1 9+1=10
        //3、最终的结果，再加上第一步减去的值
        Random r = new Random();
        int number = r.nextInt(10)+1;
        System.out.println(number);
    }
}
