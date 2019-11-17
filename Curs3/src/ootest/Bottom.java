package ootest;

public class Bottom extends Top {
    public Bottom(String s) {
        super("D");
    }
    public static void main(String[] args) {
        new Bottom("C");
        System.out.println(" ");
    }
}

