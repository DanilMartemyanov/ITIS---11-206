package task_2;

public class Lion extends Animal {
    public Lion(double weight, String color) {
        super(weight, color);
    }

    @Override
    public String makeSound(Animal animal) {
        return "AAAAA-ВAAAAA-AAAAAA";
    }

    @Override
    public Lion makeChild(double weight, String color){
        return new Lion(weight,color){
        };
    }


}
