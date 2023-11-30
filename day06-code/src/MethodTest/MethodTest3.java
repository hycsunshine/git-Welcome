package MethodTest;

public class MethodTest3 {
    public static void main(String[] args) {
        //定义方法，比较两个长方形的面积
        getArea(12, 8);
        double area1 = getArea(12, 8);
        double area2 = getArea(11, 9);
        if (area1 > area2) {
            System.out.println("第一个长方形面积更大");
        } else {
            System.out.println("第二个长方形面积更大");
        }
    }

    //定义一个方法求长方形的面积（完整思路）
    //1、我要干嘛？求长方形的面积
    //2、需要什么？长和宽
    //3、方法的调用处，是否需要继续使用方法的结果。
    //如果要用，那么方法必须有返回值
    //如果不要用，方法可以写返回值也可以不写返回值
    public static double getArea(double length, double wide) {
        double area = length * wide;
        return area;
    }
}
