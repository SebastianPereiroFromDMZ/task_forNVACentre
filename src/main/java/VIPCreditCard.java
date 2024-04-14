public class VIPCreditCard extends CreditCard{

    private static final int CASHBACKPERCANTAGE = 5;
    private static final int PURCHASEAMOUNT = 5000;

    @Override
    public void replenish(int quantity) {
        super.replenish(quantity);
    }

    @Override
    public boolean toPay(int quantity) {
        if (quantity > PURCHASEAMOUNT){
            int cashBack = (quantity/100) * CASHBACKPERCANTAGE;
            setBalance(super.getBalance() + cashBack);
            System.out.println("Cash back: " + cashBack);
        }
        return super.toPay(quantity);
    }

    @Override
    public void getInformationAboutTheBalance() {
        super.getInformationAboutTheBalance();
    }

    @Override
    public void getInformationAboutAvailableFunds() {
        super.getInformationAboutAvailableFunds();
    }
}
