public class Chel1 extends Thread{
    private int checkIt;
    private Money check;

    public Chel1(int checkIt, Money check) {
        this.checkIt = checkIt;
        this.check = check;
    }

    @Override
    public void run() {
        BankService.takeOffAllMoney(check);
        System.out.println("Первый человек быстрее снял все деньги");
    }
}
