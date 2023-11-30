package Test;

import java.util.Scanner;

public class LoopTest3 {
    //键盘录入一个正整数，判断是不是为质数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int x = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            //i以依次表示这个范围之内的每一个数字
            //看x是否能被i整除就欧克
            if (x %i==0){
                flag=false;
                break;
            }/*else{
                System.out.println(x+"是一个质数！");
            }*/
        }
        //只有当循环结束，表示这个范围之内的所有数字都判断完毕
        //此时才能判断x是否为一个质数
        if (flag){
            System.out.println(x+"是一个质数！");
        }else {
            System.out.println(x+"不是一个质数！");
        }
    }
}
