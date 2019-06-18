package Extends;

public class Person {
    private String name;
    protected int age;

    // 自定义构造方法
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void run(){
        System.out.println(this.name + " is running!");
    }
}
