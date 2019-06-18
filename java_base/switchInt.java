package java_base;

import java.util.Scanner;

public class switchInt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("select 1~4: ");
        int opt = scanner.nextInt();
        switch (opt)
        {
            case 1:
                System.out.println("selected 1");
                break;
            case 2:
                System.out.println("selected 2");
                break;
            case 3:
            case 4:
                System.out.println("selected 3,4");
                break;
            default:
                System.out.println("Not selected");
        }

        System.out.println("end");
    }
}


/*
switch 就是一个多重选择

switch的计算结果必须为整型、字符串或枚举类型

case具有穿透性，所以注意每一个case都要加上break

总是写上default

尽量少用switch
 */