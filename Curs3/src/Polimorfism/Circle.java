package Polimorfism;

public class Circle extends Shape{
    public static final double PI = 3.14;

    public void displayArea(int raza){
        System.out.println(PI*raza*raza);
    }

    @Override
    public void displayShape() {
        //super.displayShape();
        System.out.println("Display circle");
    }
}
