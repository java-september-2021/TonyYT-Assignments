public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(0, 0);
        System.out.println(account1.accountNum);
        account1.displayAccountInfo();

        BankAccount account2 = new BankAccount(5000, 3000);
        System.out.println(account2.accountNum);
        account1.displayAccountInfo();

        BankAccount account3 = new BankAccount(4000, 2000);
        System.out.println(account3.accountNum);
        account1.displayAccountInfo();

        System.out.println(BankAccount.howManyAccount);
    }

}
