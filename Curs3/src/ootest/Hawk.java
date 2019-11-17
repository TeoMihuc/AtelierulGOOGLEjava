package ootest;

class Bird {
    {System.out.println("b1 "); } //Instance block - code executed whenever an instance of this class is created

    public Bird() {System.out.println("b2 "); }
}

class Raptor extends Bird {
    static { System.out.println("r1 "); } //static block-code executed whenever class is loaded; code for initiaisation

    public Raptor() { System.out.println("r2 "); }

    { System.out.println("r3"); }
    static { System.out.println("r4 "); }
}

public class Hawk extends Raptor{

    public static void main(String[] args) {
        System.out.println("pre ");
        new Hawk();
        System.out.println("hawk ");
    }

}
