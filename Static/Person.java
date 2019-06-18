package Static;

public class Person {
    private static int number;

    private String name;

    public Person(String name){
        this.name = name;
        // 静态字段和实例无关，仅与类有关
        number++;
    }

    public String getName(){
        return this.name;
    }

    public static int getNumber(){
        return number;
    }
}

/*
静态字段属于class

静态方法不需要实例，无法使用this

静态方法常用于工具类

静态方法可以访问静态字段 及调用其他的静态方法
 */