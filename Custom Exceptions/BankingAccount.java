//contains the method that throws the custom exception
public class BankingAccount{
    private int total;

    public BankingAccount(int total){
        this.total = total;
    }

    public void transaction(int withdraw) throws InsufficientBalanceException{ // we have to write throws 'exception name' with the method
        if(withdraw > total){
            throw new InsufficientBalanceException("Not enough money! Balance: " + total); //throwing the exception here
        }
        else{
            total -= withdraw;
            System.out.println("Available balance is: "+ total);
        }
    }

}
