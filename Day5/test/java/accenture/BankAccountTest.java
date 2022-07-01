package accenture;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount = new BankAccount(1000.00);

    @Test
    @DisplayName("Deposit 1000")
    void deposit() {
        assertEquals(1500.00, bankAccount.deposit(1000.00));
    }

    @Test
    @DisplayName("Withdraw 500")
    void withdraw() {
        assertEquals(500.00, bankAccount.withdraw(500.00));
    }
}
