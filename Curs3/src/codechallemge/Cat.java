package codechallemge;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String name) {
        super(4);
    }

    protected Cat() {
        this("");//apelez constructorul de mai sus
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat with name" + name + " is playing.");
    }
}
