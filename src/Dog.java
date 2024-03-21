public class Dog extends Animal {
    private static int count = 0;

    public Dog() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.printf("The dog run %d m%n", distance);
        } else {
            System.out.println("A dog can't run so much");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.printf("The dog swim %d m%n", distance);
        } else {
            System.out.println("A dog can't swim so much");
        }
    }
}
