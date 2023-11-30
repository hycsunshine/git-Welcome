package ArrayDemo;

//获取数组里面所有的元素
//进行遍历
public class ArrayDemo3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,5,8,9,6,7,8,5};
        //在Java中，数组有一个长度属性。
        //调用方法：数组名.length
        //自动生成：数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
