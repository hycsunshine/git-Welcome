package MethodTest;

public class MethodTest4 {
    //使用方法重载，实际比较两整数是否相同的方法
    //兼容全整数类型（byte,short,int,long）

    //方法重载：会把相同功能的方法取一样的名字
    //好处：1、定义方法的时候不需要那么多单词了
    // 2、调用方法的时候也不需要那么麻烦了
    public static void main(String[] args) {
//        compare((byte)10,(byte)20);
        byte b1 = 10;
        byte b2 = 20;
        compare(b1,b2);
    }
    public static void compare(byte b1, byte b2) {
        System.out.println(b1 == b2);
    }

    public static void compare(short s1, short s2) {
        System.out.println(s1 == s2);
    }

    public static void compare(int i1, int i2) {
        System.out.println(i1 == i2);
    }

    public static void compare(long n1, long n2) {
        System.out.println(n1 == n2);
    }
}
