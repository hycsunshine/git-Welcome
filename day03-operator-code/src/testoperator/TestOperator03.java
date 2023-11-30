package testoperator;

public class TestOperator03 {
    public static void main(String[] args) {
        //定义三个人的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        //先比较第一个人和第二个人的身高，再拿着结果与第三个人进行比较
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
    }
}
