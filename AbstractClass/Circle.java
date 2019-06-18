package AbstractClass;

public class Circle extends Shape {
    private final double radio;

    public Circle(double radio){
        this.radio = radio;
    }


    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}




