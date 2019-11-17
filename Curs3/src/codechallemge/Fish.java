package codechallemge;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish(){
        super(0);
    }
    @Override
    public void eat() {
        System.out.println("Fish "+name+" can eat something.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Fish "+name+" plays.");
    }

    @Override
    public void walk() {
        System.out.println("Fishes can't walk.");
    }
}
