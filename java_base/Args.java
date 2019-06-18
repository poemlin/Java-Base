package java_base;

public class Args {
    public static void main(String[] args) {
        System.out.println("Number of args: " + args.length);
        for (String arg : args) {

            System.out.println(arg);

            if("-version".equals(arg)){
                System.out.println("version 1.0");
            }
        }
    }
}

/*

命令行参数由jvm接收用户输入传给main

适当程序解析得到的命令行参数
 */