package ArrayTest;

//交换数组中的数据

public class ArrayTest7 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int temp = arr[0];
//        arr[0] = arr[5];
//        arr[5] = temp;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //当循环结束后，数组中的数据就实现了头尾交换
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
