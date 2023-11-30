package ArrayDemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //利用索引对数组中的元素进行访问
        int array[]={1,2,3,4,5};

        //获取数组中的元素
        // 格式：数组名[索引]
        int number =array[1];
        System.out.println(number);

        //把数据存储到数组当中去
        // 格式： 数组名[索引] = 具体数据/变量
        array[0]=100;
        System.out.println(array[0]);

        double d[] =new double[]{};
    }
}
