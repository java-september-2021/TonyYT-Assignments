import java.util.Random;

public class BankAccount {
    // Create a BankAccount class.
    // The class should have the following attributes: (double) checking balance,
    // (double) savings balance.
    public double checkingBalance;
    public double savingBalance;
    public String accountNum;

    // Create a class member (static) that has the number of accounts created thus
    // far.
    public static int howManyAccount;
    // Create a class member (static) that tracks the total amount of money stored
    // in every account created.
    public static double totalAmountMoney;

    // In the constructor, be sure to increment the account count.
    // build constrctor
    public BankAccount(double checkingBalance, double savingBalance) {
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        this.accountNum = accountNum();
        howManyAccount += 1;
        totalAmountMoney = this.checkingBalance + this.savingBalance;
    }

    // Create a getter method for the user's checking account balance.
    public double getCheckAccountBalance() {
        System.out.println(checkingBalance);
        return checkingBalance;
    }

    // Create a getter method for the user's saving account balance.
    public double getSavingAccountBalance() {
        System.out.println(savingBalance);
        return savingBalance;
    }

    // Create a method that will allow a user to deposit money into either the
    // checking or saving, be sure to add to total amount stored.
    public void deposit(double depositAmount) {
        checkingBalance += depositAmount;
        totalAmountMoney += depositAmount;
    }

    // Create a method to withdraw money from one balance. Do not allow them to
    // withdraw money if there are insufficient funds.
    public void withDraw(double withDrawAmount) {
        if (checkingBalance < withDrawAmount) {
            System.out.println("there is not enough moeney to be withdrawn!!!");
        } else {
            checkingBalance -= withDrawAmount;
        }
    }

    // Create a method to see the total money from the checking and saving.
    public void getAvailableMoney() {
        System.out.println(checkingBalance);
        System.out.println(savingBalance);
    }
    // Users should not be able to set any of the attributes from the class.

    // Ninja Bonus (Optional):
    // Add the the following class attribute: account number. The type is up to you,
    // can be a String or a Long or another type.
    // Create a private method that returns a random ten digit account number.
    // In the constructor, call the private method from above so that each user has
    // a random ten digit account.
    private String accountNum() {
        Random rnd = new Random();
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] number = "1234567890".toCharArray();
        StringBuilder accountNum = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            accountNum.append(alphabet[rnd.nextInt(alphabet.length)]);
        }
        for (int k = 0; k < 6; k++) {
            accountNum.append(number[rnd.nextInt(number.length)]);
        }
        return accountNum.toString();
    }

    public void displayAccountInfo() {
        System.out.println("The account number is: " + this.accountNum);
        System.out.println("The Saving account balance is: " + this.savingBalance);
        System.out.println("The chekcing account balance is: " + this.checkingBalance);
        System.out.println("The total balance in the account is: " + totalAmountMoney);
    }

}
