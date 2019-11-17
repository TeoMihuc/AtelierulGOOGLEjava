package oopConcepts;

public class Child extends Parent {
    {
        System.out.println("child regular init block");}
        static{
        System.out.println("child static init block");
    }
    public Child(){
        super();//se apeleaza ce e in clasa superioara, se apeleaza constructorul din super clasa prima data
        System.out.println("child constructor");
    }
}
