// Main class for Banking Account
class Main {
    public static void main(String[] args) {
        BankingAccount obj = new BankingAccount(5000);
      //try/catch block for the custom exception  
      try{
            obj.transaction(7000);
        }
        catch(InsufficientBalanceException e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}
