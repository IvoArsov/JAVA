/*
Create a Person class.
The class should have private fields for:
-Name: String
-Age: Integer
-Accounts: List<BankAccount>
The class should have constructors:
-Person(String name, int age)
-Person(String name, int age, List<BankAccount> accounts)
The class should also have public methods for:
-getBalance(): void

 */

package OOPBasics.DefiningClasses.DefinePersonClass;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan", 25);
        System.out.println(person.getBalance());
    }
}
