package rikkei.academy;

public class Car {
    private String name;
    private String engine;
    public static int numberOfcars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfcars() {
        return numberOfcars;
    }

    public static void setNumberOfcars(int numberOfcars) {
        Car.numberOfcars = numberOfcars;
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}
