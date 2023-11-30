package skiploop;

//跳过某一次循环

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                //结束本次循环，进行跳转继续执行下次循环
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
