package Interface;

public class Main {

    public static void main(String[] args) {
        // 接口也是类型 可以引用 且支持向上转型
        Shape s1 = new Rect(200, 100);
        Shape s2 = new Circle(80);
        System.out.println(s1.area());
        System.out.println(s2.area());
    }

}
