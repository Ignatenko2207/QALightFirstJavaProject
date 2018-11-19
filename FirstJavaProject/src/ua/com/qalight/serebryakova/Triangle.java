package ua.com.qalight.serebryakova;

public class Triangle implements  Shape {
    private double height;
    private double base;



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double getArea() {
        return height*base/2
    }
}
