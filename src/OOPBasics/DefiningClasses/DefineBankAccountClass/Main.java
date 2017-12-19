/*
Create a class named BankAccount.
The class should have public fields for:
-Id: Integer
-Balance: Double
 */

package OOPBasics.DefiningClasses.DefineBankAccountClass;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.Id = 1;
        acc.Balance = 5432.13;

        System.out.printf("Account ID - %d\nBalance - %.2f", acc.Id, acc.Balance);
    }
}
