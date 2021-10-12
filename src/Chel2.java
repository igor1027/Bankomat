public class Chel2 extends Thread{
    private int checkIt;
    private Money check;

    public Chel2(int checkIt, Money check) {
        this.checkIt = checkIt;
        this.check = check;
    }

    @Override
    public void run() {
        BankService.TakeOffMoney(check,checkIt);
        System.out.println("Второй человек быстрее снял деньги" + check);;
    }
}
