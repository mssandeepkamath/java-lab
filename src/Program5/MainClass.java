package Program5;

/*
 Create two classes called Lion and Snake that implements all the methods defined in an
        interface Animal. Declare eat()  and sound() method in Animal interface and display eating habits of that
                particular animal.Create an interface called Tired Animal. In Tired Animal interface add
method sleep() and definition to an existing interface by extending Animal interface to verify Extending
                Interface concept in java.
        Note: Lion and Snake implement the required eat( ) and sleep() method and has some of its own
        methods and instance variables
 */
public class MainClass {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Snake snake = new Snake();
        System.out.println("Lions characteristics");
        lion.eat();
        lion.sleep();
        lion.sound();
        lion.action();
        System.out.println("Snakes characteristics");
        snake.eat();
        snake.sleep();
        snake.sound();
        snake.habitat();
    }
}
