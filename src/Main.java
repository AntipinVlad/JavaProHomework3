public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();

        dog1.run(200);
        dog1.swim(8);
        dog2.run(800);
        dog2.swim(30);
        cat1.run(200);
        cat1.swim(5);

        System.out.println("Number of dogs: " + Dog.getCount());
        System.out.println("Number of cats: " + Cat.getCount());
        System.out.println("Total number of animals: " + (Dog.getCount() + Cat.getCount()));
    }
}