package Program6;

/*
Design and implement a Java program for the following requirements:
a) An Exception class called Demonetization Exception which returns the statement that
says “Deposit of Old currency of (Rs_____) crosses Rs. 5,000 and cannot be Deposited”.
b) A class called ‘Account’ that creates account with 500 Rs minimum balance with
following methods.
i. deposit(amount, currencyType) method to deposit amount. This class should handle
“Demonetization Exception” and print the message defined in this Exception class.
If a currency type is “OLD” and the amount is greater than 5,000 then throw the
Demonetization Exception, otherwise update the balance.
ii. currBalance() method that displays balance amount in the account.
iii. withdraw(amount) method to withdraw amount and update the balance. Use proper
control structure to check Balance should not go less than 500.
A ‘Customer’ class that creates Account object and call the methods deposit(), withdraw()
and currBalance() based on the user choice.
 */

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Account account = new Account();

        while (true) {
            System.out.println("Enter the option\n 1.deposit 2.balance 3.withdraw 4.exit portal");
            Scanner in = new Scanner(System.in);
            int opt = Integer.parseInt(in.nextLine());
            switch (opt) {
                case 1 -> {
                    System.out.println("Enter the amount");
                    double amount = Double.parseDouble(in.nextLine());
                    System.out.println("Enter the type of currency (new/old)");
                    String type = in.nextLine();
                    try {
                        account.deposit(amount, type);
                    } catch (DemonetizationException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("Current balance " + account.currBalance());
                }
                case 3 -> {
                    System.out.println("Enter the amount to be withdrawn");
                    double amount=Double.parseDouble(in.nextLine());
                    account.withDraw(amount);
                }
                default -> {
                    System.exit(0);
                }
            }

        }

    }


}
