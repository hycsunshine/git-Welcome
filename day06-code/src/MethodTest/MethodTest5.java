package MethodTest;

public class MethodTest5 {
    //设计一个方法用于数组遍历，要求打印在一行上
    public static void main(String[] args) {
        int []arr = {11,22,33,44,55,66};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("]");
    }
}
