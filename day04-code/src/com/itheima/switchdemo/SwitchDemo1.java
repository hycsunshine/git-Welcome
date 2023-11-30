package com.itheima.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        // 定义一个值
        String noodles = "海鲜龙虾面";
        switch (noodles){
            case "兰州拉面":
                System.out.println("那就吃兰州拉面！");
                break;
            case "武汉热干面":
                System.out.println("那就吃武汉热干面！");
                break;
            case "北京炸酱面":
                System.out.println("那就吃北京炸酱面！");
                break;
            case "陕西油泼面":
                System.out.println("那就吃陕西油泼面！");
                break;
            default:
                System.out.println("什么都不行，爬去吃方便面吧！");
                break;
        }
    }
}
