package task_2;

public abstract class  Animal {
    private double weight;
    private String color;

    public Animal(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public abstract String makeSound(Animal animal);

    public abstract Animal makeChild(double weight, String color);

    @Override
    public String toString() {
        return "Lion with weight " + this.weight + " " + "and color " + this.color;
    }
}