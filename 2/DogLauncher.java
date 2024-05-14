public class DogLauncher {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(25);
        dogs[2] = new Dog(51);
        dogs[1].noise();
    }
}
