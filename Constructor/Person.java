package Constructor;

public class Person {
    private String name;
    private int age;

    // 构造方法没有返回值 也没有void
    // 与类同名；
    // 如果只有这一个构造方法，那么 Person a = new Person()出错
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 可以有多个构造方法
    public Person(String name){
        this.name = name;
    }

    public Person(){
        this.name = "unnamede";
        this.age = 0;

    }


    public void setName(String name){
        this.name = name.trim();
    }

    public String  getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    private int bothyear(){
        return 2019-this.age;
    }

    public int getboth(){
        return bothyear();
    }
}

/*
this-》当前实例

外部代码只能通过public方法操作实例

类内部方法可以操控private 方法

构造方法可以调用其他的构造方法：
public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


public Person(){
        this("unnamede", 0);

    }

 */
