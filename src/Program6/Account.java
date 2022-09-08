package Program6;

public class Account {

    double balance=500;

    void deposit(double amount,String currencyType) throws DemonetizationException
    {
        if(currencyType.equals("old") && amount>5000)
        {
            throw new DemonetizationException(amount);
        }
        else {
            balance+=amount;
        }
    }

    public double currBalance()
    {
        return this.balance;
    }

    public void withDraw(double amount)
    {
        if(balance-amount>=500)
        {
            balance-=amount;
            System.out.println(amount+" withdrew from account XYZ. Current balance is "+ currBalance());
        }
        else
        {
            System.out.println("Withdraw failed. Minimum amount in the account should be 500. Current balance "+ currBalance());
        }
    }

}
