package java_base;

public class doWhile {
    public static void main(String[] args){
        int sum = 0;
        int n = 1;
        do{
            sum += n;
            n++;
        }while(n<10);

        System.out.println(n);
        System.out.println(sum);
    }
}

/*
dowhile先执行 后判断条件

至少执行一次
 */