package ArrayDemo;

//数组动态初始化
//数据类型[] 数组名 = new 数据类型[数组的长度]
//特点：在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值
public class ArrayDemo4 {
    public static void main(String[] args) {
        String[] name =new String[50];
        System.out.println(name[49]);
        for (int i = 0; i < name.length; i++) {
            //添加数组元素
            name[0]="黄银川";
            name[1]="黄银城";
            name[2] ="张纬璐";
            System.out.println(name[i]);
        }
        //数组默认初始化规律：
        //整数类型：默认初始化0
        //小数类型：默认初始化0.0
        //字符类型：默认初始化‘/u0000’ 空格
        //布尔类型：默认初始化 false
        //引用数据类型：默认初始化 null
    }
}
