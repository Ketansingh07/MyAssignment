package Assignment.Assignment.Exception;
public class Q3 {
    public static void main(String[] args) {
        Q3saving savingAcc = new Q3saving(123456789, 2000);

        double withdrawnAmount = savingAcc.withdraw(2100);
        System.out.println("Withdrawn amount: " + withdrawnAmount);

        withdrawnAmount = savingAcc.withdraw(-1000);
        System.out.println("Withdrawn amount: " + withdrawnAmount);

        System.out.println("Current balance: " + savingAcc.getBalance());
    }
}
