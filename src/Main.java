public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 1401;

        int bonus = 1;
        if (amount > 1000) {
            bonus = amount / 100;
        }


        else {
            bonus = 0;
        }

        int totalAmount = account + amount + bonus;

        System.out.println("Итоговый счёт: " + totalAmount + "р. " + "(из них бонусов: " + bonus + "р.)");
    }
}
