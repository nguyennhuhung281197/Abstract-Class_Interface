package amimal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken : cluck - cluck !";
    }

    @Override
    public String howToEat() {
        return "Ăn Được";
    }
}
