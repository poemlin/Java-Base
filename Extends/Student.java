package Extends;



public class Student extends Person {
    private int score;

    // 父类有自定义构造方法，子类必须有super
    public Student(String name){
        super(name);
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScore(){
        return score;
    }

//    子类方法无法直接访问父类的private数据，但是可以访问protected
//    public void hello(){
//        System.out.println("hello " + this.name());
//    }

    public void helloage(){
        System.out.println("hell0 " + this.age);
    }

}
