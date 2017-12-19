/*
Create a test client that tests your BankAccount class.
Support the following commands:
-Create {Id}
-Deposit {Id} {Amount}
-Withdraw {Id} {Amount}
-Print {Id}
-End
If you try to create an account with existing Id, print "Account already exists".
If you try to perform an operation on non-existing account with existing Id, print "Account does not exist".
If you try to withdraw an amount larger than the balance, print "Insufficient balance".
Print command should print "Account ID{id}, balance {balance}". Round the balance to the second digit after the decimal separator.
 */

package OOPBasics.DefiningClasses.TestClient;


import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer, BankAccount> Accounts = new HashMap<Integer, BankAccount>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            String input = scan.nextLine();

            if(input.equals("End")){
                break;
            }
            String[] area = input.split("\\s+");

            String command = area[0];
            int id = Integer.parseInt(area[1]);

            switch (command) {
                case "Create":
                    createPerson(Accounts, id);
                    break;
                case "Deposit":
                    addDepositMoney(Accounts, id, area);
                    break;
                case "Withdraw":
                    getWithdraw(Accounts, id, area);
                    break;
                case "Print":
                    if (Accounts.containsKey(id)){
                        System.out.printf(Accounts.get(id).toString() + ", Balance %.2f", Accounts.get(id).getBalance());
                    } else {
                        System.out.println("\nAccount does not exist\n");
                    }
                    break;
            }
        }
    }

    private static void createPerson(HashMap<Integer, BankAccount> accounts, int id){
        if(accounts.containsKey(id)){
            System.out.println("\nAccount already exists");
        }else{
            BankAccount account = new BankAccount();
            account.setId(id);
            accounts.put(id, account);
        }
    }

    private static void addDepositMoney(HashMap<Integer, BankAccount> accounts, int id, String[] area){
        if(accounts.containsKey(id)){
            double depositMoney = Double.parseDouble(area[2]);

            accounts.get(id).deposit(depositMoney);
        }else {
            System.out.println("\nAccount does not exist");
        }
    }

    private static void getWithdraw(HashMap<Integer, BankAccount> accounts, int id, String[] area){
        if(accounts.containsKey(id)){
            double withdrawMoney = Double.parseDouble(area[2]);
            double accBalance = accounts.get(id).getBalance();

            if(accBalance > withdrawMoney){
                accounts.get(id).withdraw(withdrawMoney);
            }else{
                System.out.println("\nInsufficient Balance");
            }
        }else{
            System.out.println("\nAccount does not exist");
        }
    }
}
