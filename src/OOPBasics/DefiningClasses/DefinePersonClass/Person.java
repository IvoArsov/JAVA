package OOPBasics.DefiningClasses.DefinePersonClass;

import OOPBasics.DefiningClasses.TestClient.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String Name;
    private int Age;
    private List<BankAccount> Accounts;

    public Person(String name, int age){
        this.Name = name;
        this.Age = age;
        this.Accounts = new ArrayList<>();
    }

    public Person(String name, int age, List<BankAccount>accounts){
        this.Name = name;
        this.Age = age;
        this.Accounts = accounts;
    }

    public double getBalance(){
        return this.Accounts.stream().mapToDouble(BankAccount::getBalance).sum();
    }
}
