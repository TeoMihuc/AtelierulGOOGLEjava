package Polimorfism;

public class Main {
    public static void main(String[] args) {
        Circle circle =new Circle();
        //lista de ob geometrice
        Shape[] shapes =new Shape[5];
        shapes[0]=new Circle();
        shapes[1]=new Rectangle();
        //se parcurge si se afiseaza


        circle.displayShape();
        circle.displayArea(2);

        Shape circle1 =new Circle(); // circle1 contine doar ce e in clasa de Shape dar va contine valorile din Circle
        System.out.println(((Circle)circle1).PI); // obtin valoarea din subclasa

        dispalyShapes(circle);
        dispalyShapes(circle1);
    }
    public static void dispalyShapes(Shape shape){
        shape.displayShape();
        if(shape instanceof Circle){
            System.out.println(((Circle)shape).PI);
        }
    }
}
