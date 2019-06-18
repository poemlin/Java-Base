package Extends;

public class Main {
    public static void main(String[] args){
        Person p = new Person("xiaoming");
        Student s = new Student("xiaohong");


        p.run();
        s.run();
    }
}

/*
继承是oop的一种代码复用的方式

protected允许子类访问父类的字段和方法

子类的构造方法可以通过super()调用父类的构造方法

可以安全地向上转型为更抽象的类型
 */