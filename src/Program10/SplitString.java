package Program10;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence=scan.nextLine();
        System.out.println("Enter the regex for splitting");
        String regex=scan.nextLine();
        String[] words=sentence.split(regex);
        System.out.println("The resultant substring are:");
        for (String s:words)
        {
            System.out.print(s + " ");
        }
    }
}
