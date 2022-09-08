package Program10;

/*

Write program to replace a string "python" with "java" and "java" with "python" in a given string.

 */

import java.util.Locale;
import java.util.Scanner;

public class Replace {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the sentence (Should contain words like python and java)");
        String sentence=scan.nextLine();
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equalsIgnoreCase("java"))
            {
                words[i]="python";
            }
            else if(words[i].equalsIgnoreCase("python"))
            {
                words[i]="java";
            }
        }

        System.out.println("The sentence after manipulation is:");
        for(String s:words)
        {
            System.out.print(s+" ");
        }
    }


}
