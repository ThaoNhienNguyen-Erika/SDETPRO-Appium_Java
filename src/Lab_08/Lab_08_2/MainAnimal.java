package Lab_08.Lab_08_2;

public class MainAnimal {
    public static void main(String[] args) {

        Animal Horse = new Animal("Horse");
        // Horse.setName("Horse");
        Animal Tiger = new Animal("Tiger");
        Animal Dog = new Animal("Dog");
        // Animal Cat = new Animal("Cat");

        int horseSpeed = Horse.speed();
        int tigerSpeed = Tiger.speed();
        int dogSpeed = Dog.speed();
        // int catSpeed = Cat.speed();

        if (horseSpeed > tigerSpeed && horseSpeed > dogSpeed) {
            System.out.println("Winner is " + Horse.getName() + " speed: " + horseSpeed);
        } else if (tigerSpeed > dogSpeed && tigerSpeed > horseSpeed) {
            System.out.println("Winner is " + Tiger.getName() + " speed: " + tigerSpeed);
        } else {
            System.out.println("Winner is " + Dog.getName() + " speed: " + dogSpeed);
        }

    }
}
