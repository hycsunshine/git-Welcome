package MethodTest;

public class MethodTest1 {
    public static void main(String[] args) {
        //定义一个方法，求长方形的周长，将其结果在方法中进行打印
        circumFerence(7.7,5.5);
    }
    public static void circumFerence(double length,double wide){
        double girth = length*2 + wide*2;
        System.out.println(girth);
    }
}
