import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;


public class Main {

    public static void main(String[] args) {

        Account savingsAcc = new SavingsAccount(1000);
        Account creditAcc = new CreditAccount(-500);
        Account checkingAcc = new CheckingAccount(500);

        savingsAcc.transfer(creditAcc, 300);
        creditAcc.pay(50);
        creditAcc.addMoney(800);

        System.out.println("----------------");

        savingsAcc.addMoney(100);
        checkingAcc.pay(50);
        checkingAcc.addMoney(500);

        System.out.println("----------------");

        checkingAcc.transfer(creditAcc, 500);
        checkingAcc.pay(80);

    }

}
