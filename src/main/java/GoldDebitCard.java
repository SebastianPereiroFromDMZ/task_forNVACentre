public class GoldDebitCard extends DebitCard {

    private int bonusPoints;

    public GoldDebitCard() {
        this.bonusPoints = 0;
    }

    @Override
    public boolean toPay(int quantity) {
        if (bonusPoints > quantity){
            payWithBonuses(quantity);
            return true;
        }
        int bonus = quantity / 100;
        bonusPoints = bonusPoints + bonus;
        return super.toPay(quantity);
    }

    @Override
    public void replenish(int quantity) {
        super.replenish(quantity);
    }

    @Override
    public void getInformationAboutTheBalance() {
        super.getInformationAboutTheBalance();
    }

    @Override
    public void getInformationAboutAvailableFunds() {
        System.out.println("Bonus points: " + bonusPoints);
    }

    private void payWithBonuses(int quantity) {
        bonusPoints = bonusPoints - quantity;
        System.out.println("Payment with bonuses");
    }
}
