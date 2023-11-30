package logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        // &:并且
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);
        System.out.println("-------------------");
        // |:或者
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);
        System.out.println("-------------------");
        // ^:异
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println("-------------------");
        // !:非
        System.out.println(!true);
        System.out.println(!false);

    }
}
