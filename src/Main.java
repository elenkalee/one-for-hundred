public class Main {
    public static void main(String[] args) {
        long initialBalance = 100_50;
        long payment = 2000_40;
        int condition = 1000_00;
        long bonus;
        if (payment <= condition) {
            bonus = 0;
        } else {
            bonus = payment / 100_00 * 100;
        }
        long finalBalanceKopeck = initialBalance + payment + bonus;
        System.out.println (finalBalanceKopeck);
    }
}

