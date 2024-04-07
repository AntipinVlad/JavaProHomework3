public class Cat extends Animal {
    private static int count = 0;

    public Cat() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.printf("The can run %d m%n", distance);
        } else {
            System.out.println("A cat can't run so much");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("The cat can't swim");
    }
}
