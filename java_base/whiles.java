package java_base;

public class whiles {
    public static void main(String[] args){
        int sum = 0;
        int n = 1;
        while(n < 10){
            sum += n;
            n++;
        }
        System.out.println(n);
        System.out.println(sum);
    }
}

/*

循环判断条件成立执行，不成立不执行

循环可能一次都不执行

避免死循环

循环逻辑边界需要小心
 */
