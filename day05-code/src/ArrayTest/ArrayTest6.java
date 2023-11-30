package ArrayTest;

public class ArrayTest6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a;
        a = b;
        b = c;
        c = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
