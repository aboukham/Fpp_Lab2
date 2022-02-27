package lab2;

final public class Triangle {
    final private double  height;
    final private double  base;

    public Triangle(double base, double height) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double computeArea(){
        return base * height / 2;
    }
}
