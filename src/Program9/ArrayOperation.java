package Program9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Write a Java program to create a new array list, add some colors (string) and perform the following operations:
(i) Add  elements of List to ArrayList (ii) Copy ArrayList to Array
(iii) Reverse ArrayList content        (iv) Get Sub list from an ArrayList.
(v) To sort a given ArrayList          (vi) Clone an ArrayList to another ArrayList
 */
public class ArrayOperation {

    private  ArrayList<String> colors;

    ArrayOperation()
    {
        colors=new ArrayList<>();
    }

    public void addElements(String color)
    {
        colors.add(color);
    }

    public String[] toArray()
    {
        String[] array=new String[colors.size()];
        colors.toArray(array);
        return array;
    }

    public ArrayList<String> reverseArrayList()
    {
        ArrayList<String> colorsDuplicate=new ArrayList<>(colors);
        Collections.reverse(colorsDuplicate);
        return colorsDuplicate;
    }

    public List<String> toSubList(int startIndex, int endIndex)
    {
        return colors.subList(startIndex, endIndex);
    }

    public ArrayList<String> sortArrayList()
    {
        ArrayList<String> colorsDuplicate=new ArrayList<>(colors);
        Collections.sort(colorsDuplicate);
        return colorsDuplicate;
    }

    public ArrayList<String>  cloneArrayList()
    {
     return (ArrayList<String>) colors.clone();

    }



}
