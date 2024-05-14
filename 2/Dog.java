public class Dog {
    public int weight;

    public Dog(int w) {
        weight = w;
    }

    public void noise() {
        if (weight < 10) {
            System.out.println("awwawawa awawwaa");
        } else if (weight < 30) {
            System.out.println("woof! woof!");
        } else {
            System.out.println("AROOOOOOOOOOOOOO");
        }
    }
}
