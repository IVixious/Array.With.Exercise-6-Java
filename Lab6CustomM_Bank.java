public class Lab6CustomM_Bank {
    public static void main(String[] args){
        BankAccount acc = new BankAccount(987654, "Alice Smith", 1000.00);

        acc.displayAccountDetails();
        acc.deposit(250.00);
        acc.withdraw(100.00);
        acc.displayAccountDetails();
    }
}
