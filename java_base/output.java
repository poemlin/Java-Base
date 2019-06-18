package java_base;

public class output {
    public static void main(String[] args){
        double d = 3.1415926;
        System.out.println(d);
        System.out.printf("PI = %.2f\n", d);
        System.out.printf("PI = %7.2f\n", d);
        // 格式化小数
        double f = 0.123456;
        System.out.printf("%f\n", f); // 0.123456
        System.out.printf("%e\n", f); // 1.234560e-01
        System.out.printf("%.2f\n", f); // 0.12
        System.out.printf("%6.2f\n", f); // <space><space>0.12
        System.out.printf("%+.2f\n", f); // +0.12
        // 调整参数顺序:
        System.out.printf("%s %s %s\n", "A", "B", "C"); //多个同时输出，前面空格后面逗号
        // 1$ 2$选择后面的参数
        System.out.printf("%2$s %1$s %1$s %3$s\n", "A", "B", "C");

        // 参数不够，报错:
        System.out.printf("%s %s %s\n", "A", "B");

    }
}

/*
print 输出不换行
println 输出换行
printf 格式化输出 %xxx占位符
    %d 整数
    %x 十六进制整数
    %f 浮点数
    %s 字符串
    %% %本身
 */
