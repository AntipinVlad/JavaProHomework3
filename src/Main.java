public class Main {
    public static void main(String[] args) {
        Dog cooper = new Dog();
        Dog milo = new Dog();
        Cat alvin = new Cat();

        cooper.run(200);
        cooper.swim(8);
        milo.run(800);
        milo.swim(30);
        alvin.run(200);
        alvin.swim(5);

        System.out.println("Number of dogs: " + Dog.getCount());
        System.out.println("Number of cats: " + Cat.getCount());
        System.out.println("Total number of animals: " + (Dog.getCount() + Cat.getCount()));
    }
}