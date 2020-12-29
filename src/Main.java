public class Main {
    public static void main(String[] args) {
        long initialBalanceKopeck = 100_50;
        long paymentKopeck = 2000_40;
        int conditionKopeck = 1000_00;
        long bonusKopeck;
        if (paymentKopeck <= conditionKopeck) {
            bonusKopeck = 0;
        } else {
            bonusKopeck = paymentKopeck / 100_00 * 100;
        }
        long finalBalance = initialBalanceKopeck + paymentKopeck + bonusKopeck;
        System.out.println (finalBalance);
    }
}

