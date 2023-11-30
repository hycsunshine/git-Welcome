package ArrayTest;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        int sum = 0;
        int aarrage = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(100) + 1;
            arr[i] = number;
            sum = sum + arr[i];
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n"+"所有数据求和为:" + sum);
        aarrage = sum / 10;
        System.out.println("所有数据的平均值为:" + aarrage);
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
            if (arr[i] < aarrage) {
                count++;
            }
        }
        System.out.println("统计有多少数据比平均值小:" + count);

    }
}
