package Program9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Write a Java program to create a new array list, add some colors (string) and perform the following operations:
(i) Add  elements of List to ArrayList (ii) Copy ArrayList to Array
(iii) Reverse ArrayList content        (iv) Get Sub list from an ArrayList.
(v) To sort a given ArrayList          (vi) Clone an ArrayList to another ArrayList
 */
public class MainClass {

    public static void main(String[] args) {

        System.out.println("Enter number of colors");
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter "+n+" colors one by one");
        ArrayOperation color=new ArrayOperation();
        for(int i=0;i<n;i++)
        {
            color.addElements(scanner.nextLine());
        }
        while(true)
        {
            System.out.println("Enter the option\n1.Get array\n2.Reverse\n3.Get Sublist\n4.Sort\n5.Clone");
            int opt=Integer.parseInt(scanner.nextLine());
            switch (opt)
            {
                case 1->{
                    String[] array= color.toArray();
                    System.out.println("Array equivalent of ArrayList is: ");
                    for(String s:array)
                    {
                        System.out.println(s+ " ");
                    }
                }
                case 2->
                {
                    ArrayList<String> reverse=color.reverseArrayList();
                    System.out.println("Reverse arraylist is: ");
                    System.out.println(reverse);
                }
                case 3->{
                         int startIndex,endIndex;
                    System.out.println("Enter starting and ending index of the sublist");
                    startIndex=Integer.parseInt(scanner.nextLine());
                    endIndex=Integer.parseInt(scanner.nextLine());
                    List<String> sublist=color.toSubList(startIndex,endIndex);
                    System.out.println("sublist: ");
                    System.out.println(sublist);
                }
                case 4->
                {
                    ArrayList<String> sorted=color.sortArrayList();
                    System.out.println("Sorted arrayList: ");
                    System.out.println(sorted);
                }
                case 5->
                {
                    ArrayList<String> cloned=color.cloneArrayList();
                    System.out.println("Clone: ");
                    System.out.println(cloned);
                }
                default ->
                {
                    System.exit(0);
                }
            }
        }



    }

}
