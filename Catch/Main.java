package Catch;

public class Main {
    public static void  main(String[] args){
        process1("abc");
        process2("0");
    }

    static void process1(String s){
        try {
            int n = Integer.parseInt(s);
            int m = 100 / n;
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("Bad input.");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Bad input.");
        } finally {
            System.out.println("end process.");
        }
    }

    static void process2(String s){
        try {
            int n = Integer.parseInt(s);
            int m = 100 / n;
        } catch (NumberFormatException  | ArithmeticException e) {
            System.out.println(e);
            System.out.println("Bad input.");
        } finally {
            System.out.println("end process.");
        }
    }
}


/*
catch子句顺序很重要，子类异常必须放前面
finally有无异常都会执行

catch可以匹配多个非继承关系的异常
 */