package ArrayTest;

import java.util.Random;

public class ArrayTest8 {
    public static void main(String[] args) {
        //定义一个数组，存入1-5，要求打乱数组中的所有数据的顺序
        int[]arr={1,2,3,4,5}; //定义数组
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随即索引
            int RandomIndex=r.nextInt(arr.length);
            //拿着随机索引指向的元素跟i指向的元素进行交换
            int temp =arr[i];
            arr[i] = arr[RandomIndex];
            arr[RandomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
