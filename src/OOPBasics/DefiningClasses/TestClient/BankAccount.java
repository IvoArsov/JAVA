package OOPBasics.DefiningClasses.TestClient;

public class BankAccount {
    private int Id;
    private double Balance;

    public void setId(int id){
        this.Id = id;
    }

    public double getBalance(){
        return this.Balance;
    }

    public void deposit(double amount){
        this.Balance += amount;
    }

    public void withdraw(double amount){
        this.Balance -= amount;
    }

    @Override
    public String toString(){
        return "ID" + this.Id;
    }
}
