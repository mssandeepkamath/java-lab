package Program6;

public class DemonetizationException extends Exception {

    public DemonetizationException(double amount)
    {
        super("Deposit of Old currency of "+amount+" crosses Rs. 5,000 and cannot be Deposited");
    }

}
