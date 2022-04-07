package tree;

public class CarSingleton {
    private static CarSingleton instance = new CarSingleton();
    private CarSingleton() {};

    public static CarSingleton getInstance() {
        if (instance == null) {
            instance = new CarSingleton();
        }
        return instance;
    }

    public static String getStringTest() {
        return "TEST22222";
    }
}
