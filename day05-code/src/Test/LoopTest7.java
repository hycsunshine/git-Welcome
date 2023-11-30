package Test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    //自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少
    public static void main(String[] args) {
        Random r = new Random();
        int number1 = r.nextInt(100)+1;//范围：1-100
        //如果将随机数放在循环里面，会导致每次都生成一个新的随机数
        //所以不能写在循环里面

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字是:");
            int number2  = sc.nextInt();
            if (number2>number1){
                System.out.println("你猜的数字有点大！");
            }else if (number2<number1){
                System.out.println("你猜的数字有点小！");
            }else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
