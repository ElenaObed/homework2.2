public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте");
        int initialaccount = 500;
        System.out.println("Начальный счет: " + initialaccount);
        int depositamount = 1500;
        System.out.println("Сумма пополнения: " + depositamount);

        int bonus;
        int x = 100; // 100 - начисляется бонус за каждые 100 руб

        if (depositamount > 1000) {
            bonus = depositamount / x;
        }
        else {
            bonus = 0;
        }

        int balance = initialaccount + depositamount + bonus;
        System.out.println("Ваш итоговый счет: " + balance);
        System.out.println("Ваш бонусный счет: " + bonus);
    }
}
