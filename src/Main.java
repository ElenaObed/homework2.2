public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте");
        int initialAccount = 500;
        System.out.println("Начальный счет: " + initialAccount);
        int depositAmount = 1500;
        System.out.println("Сумма пополнения: " + depositAmount);
        int bonus;
        int accrualRate = 100; // 100 - начисляется бонус за каждые 100 руб
        if (depositAmount > 1000) {
            bonus = depositAmount / accrualRate;
        } else {
            bonus = 0;
        }
        int balance = initialAccount + depositAmount + bonus;
        System.out.println("Ваш итоговый счет: " + balance);
        System.out.println("Ваш бонусный счет: " + bonus);
    }
}
