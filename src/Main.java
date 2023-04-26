public class Main {
    public static void main(String[] args) {
    int initialBalance = 100;
    int replenished = 2999;

    int bonus =  0;
    if (replenished > 1000) {
        bonus = replenished / 100;
        }
    int totalAmount = initialBalance + replenished + bonus;
    System.out.println("Итоговая сумма счёта: " + totalAmount);
    System.out.println("Бонус составляет: " + bonus);
    }
}