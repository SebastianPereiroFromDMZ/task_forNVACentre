

public abstract class BankCard {

    private int balance;

    public BankCard() {
        this.balance = 0;
    }

    public void replenish(int quantity) {
        if (quantity < 0) {
            System.out.println("Invalid operation");
        }
        balance = balance + quantity;
        System.out.println("The balance is replenished by " + quantity);
    }

    public boolean toPay(int quantity) {
        if (balance > quantity) {
            balance = balance - quantity;
            System.out.println("Payment made");
            return true;
        }
        System.out.println("Invalid operation");
        return false;
    }

    public void getInformationAboutTheBalance() {
        System.out.println("Available balance: " + balance);
    }
    public abstract void getInformationAboutAvailableFunds();

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
