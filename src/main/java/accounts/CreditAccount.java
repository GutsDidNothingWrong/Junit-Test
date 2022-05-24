package accounts;

public class CreditAccount extends Account{

    public CreditAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean isTransferable(int amount) {
        if (this.balance + amount <= 0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("Операция недоступна!");
            return false;
        }
    }

    @Override
    public void pay(int amount) {
        balance -= amount;
        System.out.println("Вы оплатили покупку на сумму: " + amount);
        System.out.println("Баланс Кредитного счета: " + balance);
    }

    @Override
    public void addMoney(int amount) {
        if (isTransferable(amount)) {
            balance += amount;
            System.out.println("Вы внесли сумму: " + amount);
            System.out.println("Баланс кредитного счета: " + balance);
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (account.isTransferable(amount)) {
            balance -= amount;
            System.out.println("Вы перевели сумму " + amount);
            System.out.println("Баланс кредитного счета: " + balance);
        }
    }

}
