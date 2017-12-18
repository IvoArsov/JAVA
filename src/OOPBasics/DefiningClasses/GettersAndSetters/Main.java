/*
Create a class BankAccount.
The class should have private fields for:
-Id: Integer
-Balance: Double
The class should also have public methods for:
-setId(): void
-getBalance(): Double
-deposit(Double amount): void
-withdraw(Double amount): void
-Override method toString().
 */

package OOPBasics.DefiningClasses.GettersAndSetters;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setId(23);
        acc.deposit(120);
        acc.withdraw(50);

        System.out.printf("Account %s, balanced %.2f", acc, acc.getBalance());
    }
}
