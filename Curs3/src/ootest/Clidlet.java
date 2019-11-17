package ootest;

class Clidder{
    private final void flipper(){
        System.out.println("Clidder");
    }
}

public class Clidlet extends Clidder {
    public final void flipper(){
        System.out.println("Clidlet");
    }

    public static void main(String[] args) {
        new Clidlet().flipper();
    }
}

//
//override
//overriding methods with inheritance

//a final class can't be extended
//a final method means i can't override it
//A final variable cannot be assigned to after it has been initialized
