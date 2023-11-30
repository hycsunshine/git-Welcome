package ArrayTest;

//求数组的最值

//拓展问题：
//为什么max要记录arr[0]，默认值不能是0吗?
//  不能写0，max的初始化的值一定要是数组中的值

//循环中的开始条件一定是0吗？
// 循环的开始条件如果是0，那么第一次循环的时候是自己和自己相比较，对结果没有任何影响，但影响效率
// 为了提高效率，减少一次循环的次数，循环的开始条件可以写成1
public class ArrayTest4 {
    public static void main(String[] args) {
        int arr[] = {2,33, 5, 22, 44, 55};
        int max = arr[0];
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
