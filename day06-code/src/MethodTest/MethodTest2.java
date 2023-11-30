package MethodTest;

public class MethodTest2 {
    public static void main(String[] args) {
        //定义一个方法，求圆的面积，将结果在方法中进行打印
        getArea(12);

    }
    public static void getArea(double radius){
        //π在java表示：Math.PI

        double area = Math.PI *radius*radius;
        System.out.println(area);
    }
}
