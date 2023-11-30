package MethodTest;

public class MethodTest6 {
    public static void main(String[] args) {
        int[] arr = {11, 9, 8, 25, 77, 62, 456, 85, 1};
        int max = getMax(arr);
        System.out.println(max);
    }

    //求数组的最大值
    //需要一个数组
    //需要返回
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

}