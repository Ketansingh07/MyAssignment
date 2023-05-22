package Assignment.Assignment.IOA;
import java.util.ArrayList;

class Account {
    int totalDeposits;

    public int getCash() {
        return totalDeposits;
    }
}

class CurrentAccount extends Account {
    int creditLimit;

    @Override
    public int getCash() {
        return totalDeposits + creditLimit;
    }
}

class SavingsAccount extends Account {
    int fixedDepositAmount;

    @Override
    public int getCash() {
        return totalDeposits + fixedDepositAmount;
    }
}

public class Q3 {
    public int totalCashInBank(ArrayList<Account> accounts) {
        int totalCash = 0;
        for (Account account : accounts) {
            totalCash += account.getCash();
        }
        return totalCash;
    }

    public static void main(String[] args) {
        CurrentAccount currentAccount1 = new CurrentAccount();
        currentAccount1.totalDeposits = 50000;
        currentAccount1.creditLimit = 10000;

        CurrentAccount currentAccount2 = new CurrentAccount();
        currentAccount2.totalDeposits = 40000;
        currentAccount2.creditLimit = 5000;

        SavingsAccount savingsAccount1 = new SavingsAccount();
        savingsAccount1.totalDeposits = 30000;
        savingsAccount1.fixedDepositAmount = 20000;

        SavingsAccount savingsAccount2 = new SavingsAccount();
        
        savingsAccount2.totalDeposits = 20000;
        savingsAccount2.fixedDepositAmount = 15000;

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(currentAccount1);
        accounts.add(currentAccount2);
        accounts.add(savingsAccount1);
        accounts.add(savingsAccount2);

        Q3 bank = new Q3();
        int totalCash = bank.totalCashInBank(accounts);
        System.out.println("Total cash in the bank: " + totalCash);
    }
}
