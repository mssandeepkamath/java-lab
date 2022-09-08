package Program7;



/*
Design and develop a Java program for the fruit market problem. The farmer will be able to
produce different types of fruits (apple, orange, grape, and watermelon), and put them in
the market to sell. The market has limited capacity and farmers have to stand in a queue if
the capacity is exceeded to sell their fruits. Consumers can come to the market any time
and purchase their desired fruits; and if the fruits they want to buy runs out, they are willing
to wait until the supply of that kind is ready. Examine and formulate an approach to address
this problem and implement the same using Java constructs for programming.
 */
public class MainClass {


    public static void main(String[] args) throws InterruptedException {

        Market market=new Market();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    market.produce();
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    market.consume();
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
            }
        });


        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }


}
