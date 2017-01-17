package kim.andy.bankAccountLab;
import java.lang.Math;

/**
 * Created by andykim on 1/17/17.
 */
public class bankAccount {

    public static void main(String[] args) {}

    protected enum accountType {CHECKING, SAVINGS, INVESTMENTS}

    protected static int accountNumber = 0;

    protected static void openNewAccount(String accountType, double accountNumber) {
        accountNumber += 1;
    }

    protected void getBalance() {

    }

    protected void getHolderName() {
    }

    protected void getInterestRate() {
    }

    protected void getStatus() {
    }

    protected void overDraft() {
    }

    protected void record() {
    }



}
