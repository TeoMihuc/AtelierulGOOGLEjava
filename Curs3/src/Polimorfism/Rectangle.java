package Polimorfism;

public class Rectangle extends Shape {
    @Override
    public void displayShape() {
        System.out.println("Display rectangle");
    }
    public void displayPerimetru(int lat){
        System.out.println(4*lat);
    }
}
