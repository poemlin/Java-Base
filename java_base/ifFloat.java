package java_base;

public class ifFloat {
    public static void main(String[] args){
        double x = 1 - 9.0/10;

        if(x == 0.1){
            System.out.println("x is 0.1");
        } else{
            System.out.println("x is not 0.1");
        }

        System.out.println("x = " + x);

        if(Math.abs(x - 0.1) < 0.0001){
            System.out.println("use math.abs");
        }
    }
}

/*
浮点数运算存在误差，

浮点数相等不能使用==

浮点数的判断语句需要使用两者误差小于一个比较小的数
 */


