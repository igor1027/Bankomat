public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        Money money = new Money(1, 1032);
//        BankService.takeOffAllMoney(money);
//        BankService.TakeOffMoney(money, 10);
//        BankService.addMoney(money,150);

        Chel1 chel1 = new Chel1(20,money);
        Chel2 chel2 = new Chel2(31,money);
        chel2.start();
        chel1.start();
    }
}
