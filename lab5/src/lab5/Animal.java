package lab5;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sound() {
        // По умолчанию звук не определен
        System.out.println("Unknown sound");
    }
}