public class Bank
{
    private int Account_Number;
    private String Account_Holder_Name;
    private double Balance;
    Bank(int Account_Number,String Account_Holder_Name)
    {
        this.Account_Number=Account_Number;
        this.Account_Holder_Name=Account_Holder_Name;
    }
    public void Deposite(double amount)
    {
        Balance+=amount;
        System.out.println(amount+" RS Deposited Successfully");
    }
    public void balance() {
        System.out.println("Available Amount: " + Balance);
    }
    public void withdraw(double amount)
        {
            if(Balance<amount)
            {
                System.out.println("Insufcient Amount..!");
                return;
            }
            double cash =Balance-amount;
            Balance-=amount;
            System.out.println("Withdrawal Successfull: "+cash);
            System.out.println("Remaining Balance: " + Balance);
        }
        public static void main(String[]args)
        {
            Bank a1=new Bank(876526278,"Tamilselvan S");
            a1.Deposite(1000);
            a1.balance();
            a1.withdraw(500);
            a1.balance();
        }

}
