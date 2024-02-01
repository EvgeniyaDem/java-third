//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int moneyStart = 100;
        int moneyAdd = 2001;
        int bonusPrice = 100;
        int bonusAmount;
        int moneyEnd;
        if (moneyAdd >= 100) {
            bonusAmount = moneyAdd / bonusPrice;
        } else {
            bonusAmount = 0;
        }
        moneyEnd = moneyStart + moneyAdd + bonusAmount;
        System.out.println("Начислено бонусных рублей: " + bonusAmount);
        System.out.println("Итого остаток на счете: " + moneyEnd);
    }
}