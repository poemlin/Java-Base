package java_base;
import java.util.Scanner;

public class input {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.print("Input your age: ");
        int age = scanner.nextInt();
        System.out.println("Hi, "+name+", you are "+age);
    }
}


/*
导入java.util.Scanner 这个类

建立Scanner这个对象，并且传入System.in这个对象

scanner.nextLine() 读取字符串

scanner.nextInt() 读取整数
 */