package accounts;

public class CheckingAccount extends Account {

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean isTransferable(int amount) {
        if (this.balance + amount >= 0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("Операция недоступна!");
            return false;
        }
    }

    @Override
    public void pay(int amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Вы оплатили покупку на сумму " + amount);
            System.out.println("Остаток на Расчетном счете: " + balance);
        }
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("Вы внесли сумму: " + amount);
        System.out.println("Баланс Расчетного счета: " + balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        if ((balance - amount >= 0) && (account.isTransferable(amount))) {
            balance -= amount;
            System.out.println("Вы перевели сумму " + amount);
            System.out.println("Остаток на Расчетном счете: " + balance);
        }
    }

}
