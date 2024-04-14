public class Main {

    public static void main(String[] args) {

        BankCard bankCard = new VIPCreditCard();
        bankCard.getInformationAboutAvailableFunds();
        bankCard.getInformationAboutTheBalance();
        bankCard.replenish(5000);
        bankCard.toPay(5000);
        bankCard.toPay(3000);
        bankCard.replenish(2000);
        bankCard.replenish(2000);
        bankCard.getInformationAboutAvailableFunds();
        bankCard.getInformationAboutTheBalance();
        bankCard.toPay(7000);
        bankCard.toPay(9000);
        bankCard.getInformationAboutAvailableFunds();
        bankCard.getInformationAboutTheBalance();
    }
}
