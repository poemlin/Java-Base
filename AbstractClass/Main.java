package AbstractClass;

public class Main {
    public static void main(String[] args){
        // 可以安全的向上转型
        Shape s1 = new Rect(21, 21);
        Shape s2 = new Circle(23);
        // area方法多态
        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
