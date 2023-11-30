package ArrayTest;

public class ArrayTest1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
            sum +=arr[i];
            //i 依次表示数组里面的每一个索引下标
            //arr[i] 依次表示数组里面的每一个元素
        }
        System.out.println(sum);
    }
}
