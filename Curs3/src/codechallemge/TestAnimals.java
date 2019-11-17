package codechallemge;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        d.setName("Fish name");

        Cat c = new Cat("Fluffy");
        c.setName("Cat name");

        System.out.println(d.getName() + " " + d.legs);
        System.out.println(c.getName() + " " + c.legs);

        d.walk();
        c.walk();

        Animal a = new Fish();
        a.walk();
        ((Fish) a).setName("new Fish name");
        System.out.println(((Fish) a).getName() + " " + ((Fish) a).legs);

        Animal e = new Spider();
        Pet p = new Cat();
        ((Fish) p).walk();
    }

    public static void displayAnimalName(Pet pet) {
        System.out.println(pet.getName());

        if (pet instanceof Cat) {
            System.out.println(pet.getName());
        }
    }

    public static void displayHowItWalks(Animal animal) {
        animal.walk();
    }

    /*
    public static void displayHowItWalks(Cat cat) {
        cat.walk();
    }

    public static void displayHowItWalks(Fish fish) {
        fish.walk();
    }

    public static void displayHowItWalks(Spider spider) {
        spider.walk();
    }*/
    //duplicate
}
