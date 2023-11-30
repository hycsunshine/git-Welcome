package ArrayDemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int age[] ={18,19,20,21,22};
        String name[] ={"小黄","小何","小红","小兰","小花"};
        double height[]={175.2,168.5,195.8,188.8,170};
        System.out.println(age);  //打印的地址值  [I@776ec8df
        // 拓展:地址值的含义
        // [ 表示当前是一个数组
        // I 表示当前数组里面的元素都是int类型的
        // @ 表示一个间隔符号。（固定格式）
        // 776ec8df 才是数组真正的地址值，（十六进制）
        System.out.println(name);
        System.out.println(height);
        for (int x=0;x<=age.length;x++){
            System.out.println(age[x]);
        }
    }
}
