package ootest;

class Alpha{
    static String s = "";
    protected Alpha(){ s += "alpha";}
}

class SubAlpha extends Alpha {
    private SubAlpha(){
        s += "sub ";
    }
}
public class SubSubClass extends Alpha {
    private SubSubClass(){ s+= "subsub "; }

    public static void main(String[] args) {
        new SubSubClass();
        System.out.println(s);
    }
}
