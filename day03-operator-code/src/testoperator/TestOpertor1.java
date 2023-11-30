package testoperator;

import java.util.Scanner;

public class TestOpertor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("我的时髦度是:");
        int myFashion = sc.nextInt();
        System.out.println("她的时髦度是:");
        int girlFashion = sc.nextInt();

        boolean result = myFashion > girlFashion;
        System.out.println(result);
    }
}
