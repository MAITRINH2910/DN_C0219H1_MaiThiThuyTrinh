public class Triangle extends Shape{

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    //Phương thức khởi tạo không tham số tạo nên tam giác mặc định

    public Triangle() {
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Các phương thức truy cập cho ba trường dữ liệu

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    public double getArea() {
        double halfPer = getPerimeter() / 2;
        return Math.pow((halfPer) * (halfPer - side3) * (halfPer - side2) * (halfPer - side1), 0.5);
    }

    public String toString() {
        return "Triangle has three side with side 1 = " + getSide1() + " ,side 2 = " + getSide2() + " ,side 3 = " + getSide3() + ".\nArea = " + getArea() + " \nPerimeter = " + getPerimeter();
    }
}
