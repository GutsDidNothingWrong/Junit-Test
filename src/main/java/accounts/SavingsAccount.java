package accounts;

public class SavingsAccount extends Account{

    public SavingsAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean isTransferable(int amount) {
        if (this.balance - amount >= 0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("Операция недоступна!");
            return false;
        }
    }

    @Override
    public void pay(int amount) {
        System.out.println("С Сберегательного счета нельзя платить!");
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("Вы пополнили баланс Сберегательного счета на " + amount);
        System.out.println("Текущий баланс счета: " + balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        if ((balance - amount >= 0) && (account.isTransferable(amount))) {
            balance -= amount;
            System.out.println("Вы перевели сумму " + amount);
        }
    }

}
