package Program10;

/*
 Write a Java program to find the penultimate (next to last) word of a sentence
 */

import java.util.Scanner;

public class Penultimate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Penultimate word of the sentence is: " + words[words.length - 2]);
    }
}
