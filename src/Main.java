import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int currentBalance = 550;
        int income = 1010;
        if (income > 1000) {
            int bonus = income / 100;
            int totalBalance = currentBalance + bonus;
            System.out.println("Сумма бонуса:" + bonus);
            System.out.println("Итоговый счет:" + totalBalance);
        } else {
            int bonus = 0;
            int totalBalance = currentBalance + bonus;
            System.out.println("Сумма бонуса:" + bonus);
            System.out.println("Итоговый счет:" + totalBalance);
        }
    }
}
