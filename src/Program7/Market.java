package Program7;

import java.util.LinkedList;
import java.util.Random;

public class Market {
    LinkedList<String> shop=new LinkedList<>();
    String[] fruits={"banana","apple","grapes","watermelon","butterscotch"};
    Random random=new Random();
    final int capacity = 5;

     public void produce() throws InterruptedException {

        while(true)
        {
            synchronized (this)
            {
                if(shop.size()==capacity)
                {
                    wait();
                }
                else {
                    String fruit=fruits[random.nextInt(5)];
                    shop.add(fruit);
                    System.out.println("Farmer sells "+fruit);
                    notifyAll();
                    Thread.sleep(500);
                }
            }

        }

    }

    synchronized public void consume() throws InterruptedException {

        while(true)
        {

            synchronized (this)
            {
                if(shop.size()==0)
                {
                    wait();
                }
                else {
                    String fruit=shop.removeFirst();
                    System.out.println("Consumer bought "+fruit);
                    notifyAll();
                    Thread.sleep(500);
                }
            }

        }

    }

}
