package Program8;


import java.util.Scanner;

/*
 Write the following methods that return a lambda expression performing a specified action:
(i) PerformOperation isOdd(): The lambda expression must return true if a number is odd
or false if it is even.
(ii) PerformOperation isPrime(): The lambda expression must return true if a number is
prime or false if it is composite.
(iii) PerformOperation isPalindrome(): The lambda expression must return true if a
number is a palindrome or false if it is not.
Write a JAVA program using above lambda expressions to take 2 integers as input where the
first integer specifies the condition to check for (case 1 for Odd/Even, case 2 for
Prime/Composite, or case 3 for Palindrome). The second integer denotes the number to be
checked.
 */
public class MainClass {
    static int number;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PerformOperation isOdd = (number) -> number % 2 != 0;
        PerformOperation isPrime = (number) -> {
            for (int i = 2; i <=number/2; i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        };
        PerformOperation isPallindrome = (number) ->
        {
            int original = number;
            int reverse = 0;
            while (number>0) {
                int d = number % 10;
                reverse = reverse * 10 + d;
                number /= 10;
            }
            return (original == reverse);
        };


        while (true) {
            System.out.println("Enter the input number");
            number = Integer.parseInt(in.nextLine());
            System.out.println("Enter the option\n 1.Check whether a number is odd or not\n2.Check whether a number is prime or not\n3.Check whether a number is palindrome or not\n 4. Exit");
            int opt = Integer.parseInt(in.nextLine());

            switch (opt) {
                case 1 ->
                {
                    if(!isOdd.operate(number))
                    {
                        System.out.println(number + " is not odd number");
                    }
                    else {
                        System.out.println(number + " is odd");
                    }

                }
                case 2 -> {
                    if(!isPrime.operate(number))
                    {
                        System.out.println(number + " is not a prime number");
                    }
                    else {
                        System.out.println(number + " is a prime number");
                    }
                }
                case 3 ->
                {
                    if(!isPallindrome.operate(number))
                    {
                        System.out.println(number + " is not a Palindrome number");
                    }
                    else {
                        System.out.println(number + " is a Palindrome number");
                    }
                }
                default -> {
                    System.exit(0);
                }
            }
        }
    }

}
