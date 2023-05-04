public class Account {
   private Person owner;
    private String iban;
    private double balance;

    public Account(Person owner, String iban, double balance) {
        this.owner = owner;
        this.iban = iban;
        this.balance = balance;
    }
    // методы доступа к полю balance (геттеры и сеттеры)
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if(balance>0) {
            this.balance = balance;
        }
    }

    @Override
    public String toString() {
        char ch = '\'';
        return "Account{" +
                "owner=" + owner +
                ", iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
