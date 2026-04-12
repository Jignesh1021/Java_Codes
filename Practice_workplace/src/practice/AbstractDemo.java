package practice;

// Abstract class
abstract class Shape {

    abstract void draw();
}

// Child class
class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {

        Shape s = new Circle();
        s.draw();
    }
}