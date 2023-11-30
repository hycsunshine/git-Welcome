package ArrayTest;

//定义一个数组，是偶数变为原来的二分之一，是奇数变为原来的两倍

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            //i:表示数组里面的索引（元素下标）
            //arr[i]:表示数组里面的每个元素
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else {
                arr[i] = arr[i] * 2;
            }
        }
        //注意：尽量在一个循环里面只做一件事情
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
