public class DebitCard extends BankCard {


    @Override
    public void replenish(int quantity) {
        super.replenish(quantity);
    }

    @Override
    public boolean toPay(int quantity) {
        return super.toPay(quantity);
    }

    @Override
    public void getInformationAboutTheBalance() {
        super.getInformationAboutTheBalance();
    }

    @Override
    public void getInformationAboutAvailableFunds() {
        System.out.println("No special features");
    }

    @Override
    public int getBalance() {
        return super.getBalance();
    }

    @Override
    public void setBalance(int balance) {
        super.setBalance(balance);
    }
}
