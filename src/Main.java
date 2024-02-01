//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int money_start = 100;
    int money_add = 2001;
    int bonus_price = 100;
    int bonus_amount;
    int money_end;
    if (money_add >= 100){
        bonus_amount = money_add / bonus_price;
    }else{
        bonus_amount = 0;
    }
    money_end = money_start + money_add + bonus_amount;
    System.out.println("Начислено бонусных рублей: " + bonus_amount);
    System.out.println("Итого остаток на счете: " + money_end);
    }
}