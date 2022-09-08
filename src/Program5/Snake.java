package Program5;

public class Snake implements TiredAnimal{
    @Override
    public void eat() {
        System.out.println("Eats frog");
    }

    @Override
    public void sound() {
        System.out.println("Does sisss sound");
    }

    @Override
    public void sleep() {
        System.out.println("sleeps when tired");
    }

    public void habitat()
    {
        System.out.println("lives in Anthill");
    }
}
