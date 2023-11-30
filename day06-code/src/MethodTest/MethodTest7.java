package MethodTest;

public class MethodTest7 {
    public static void main(String[] args) {
        int[] arr ={1,56,78,12,5,7,77,23,37};
        boolean flag =contains(arr,89);
        System.out.println(flag);

    }
    //判断数据是否存在
    //需要一个数组
    //返回
    public static boolean contains(int[]arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (number==arr[i]){
                return true;
            }
        }
        return false;
    }
}
