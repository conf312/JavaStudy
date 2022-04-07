package tree;

public class TestSingleton {

    public static void main(String[] args) {
        CarSingleton instance = CarSingleton.getInstance();
        System.out.println(instance);
    }
}
