package oopConcepts;

public class Parent {
   private int x,y; //atributele clasei

    {
        System.out.println("Parent regular init block");
    }
    static{
        System.out.println("Parent static regular int block");
    }
    public Parent(){//constructor
        System.out.println("constr");
    }

    //metode
    public void setOrigin(int x,int y){
        this.x=x;//shadowing, cu this ma refer la atributele clasei Parent
    }
}
