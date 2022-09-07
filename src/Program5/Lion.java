package Program5;

public class Lion implements TiredAnimal{
    @Override
    public void eat() {
        System.out.println("Eats meat");
    }

    @Override
    public void sound() {
        System.out.println("Roars");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps for 10 hrs");
    }

    void action()
    {
        System.out.println("Hunts when hungry");
    }
}
