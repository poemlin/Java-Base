package Exception;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args){
        test("UTF-8");
        test("ABC");
    }

    static void test(String encoding){
        System.out.println("Test encoding " + encoding + "...");

        try {
            "test".getBytes(encoding);
            System.out.println(" ok ");
        } catch (UnsupportedEncodingException e) {
            System.out.println(" failed.");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

/*
使用try catch语句捕获异常，可能发生错误的语句放在try中

error是无需捕获的严重错误

ide会提醒有异常需要捕获


 */