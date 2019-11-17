package codechallemge;

public class Spider extends Animal {

    protected Spider() { //constructor default
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider with" + legs + " legs, eats.");
    }
}
