package OOPbase;

public class Main {
    public static void main(String[] args){
        Person ming = new Person();
        ming.age = 12;
        ming.name = "小明";

        Book deeplearning = new Book();
        deeplearning.author = "auddhsa";
        deeplearning.name = "深度学习";

        System.out.println(ming.name);
        System.out.println(deeplearning.name);
    }
}

/*

每一个类一个文件，在main类中直接使用

new 类 创建 instance

instance就是一个变量
 */