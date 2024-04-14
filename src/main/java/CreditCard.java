public class CreditCard extends BankCard {

    private int creditLimit;
    private static final int MAXCREDITLIMIT = 10000;


    public CreditCard() {
        this.creditLimit = 10000;
    }

    @Override
    public void replenish(int quantity) {
        if (creditLimit < MAXCREDITLIMIT) {
            if (creditLimit + quantity > MAXCREDITLIMIT) {
                int balanceCalculation = quantity - (MAXCREDITLIMIT - creditLimit);
                creditLimit = MAXCREDITLIMIT;
                super.replenish(balanceCalculation);
                System.out.println("Credit limit :" + creditLimit);
            } else {
                creditLimit = creditLimit + quantity;
                System.out.println("Credit limit :" + creditLimit);
            }
        } else {
            super.replenish(quantity);
        }
    }

    @Override
    public boolean toPay(int quantity) {
        if (super.getBalance() > quantity) {
            return super.toPay(quantity);
        } else if (super.getBalance() + creditLimit > quantity) {
            int balanceCalculation = quantity - super.getBalance();
            super.setBalance(0);
            creditLimit = creditLimit - balanceCalculation;
            return true;
        }
        System.out.println("Invalid operation");
        return false;
    }

    @Override
    public void getInformationAboutTheBalance() {
        super.getInformationAboutTheBalance();
    }

    @Override
    public void getInformationAboutAvailableFunds() {
        System.out.println("Credit balance: " + creditLimit);
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
}
