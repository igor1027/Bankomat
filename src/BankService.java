import java.util.Scanner;

public class BankService extends Thread{



    public static synchronized void takeOffAllMoney(Money money){
        int checkIt = money.getCheck();
        int checkInp = checkIt/100;
        if(checkIt < 100){
            System.out.println("На счету не достаточно средств");
        }else {
            for (int i = 0; i <checkInp; i++){
                checkIt -= 100;
                System.out.println(checkIt);
            }
            money.setCheck(checkIt);
        }
    }
    public  static  synchronized  void TakeOffMoney(Money money, int check){
        int checkIt = money.getCheck();
        if(checkIt < check){
            System.out.println("На счету недостаточно средств, введите другую сумму");
        }else {
            checkIt -= check;
            money.setCheck(checkIt);
        }
        System.out.println("Остаток на счете - " + money.getCheck());
    }

    public  static synchronized void addMoney(Money money, int check){
        int checkIt = money.getCheck();
        money.setCheck(checkIt + check);
        System.out.println("На вашем счету - " + money.getCheck());
    }



}
