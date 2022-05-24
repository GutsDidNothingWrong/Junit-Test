package accountsTest;

import accounts.SavingsAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {
    SavingsAccount sut = new SavingsAccount(500);

    @BeforeEach
    public void initTest() {
        System.out.println("Running test");
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete in: " + System.nanoTime());
    }

    @org.junit.jupiter.api.Test
    public void isTransferable() {
        //before
        int amount = 1000;
        boolean expected = false;

        //when
        boolean result = sut.isTransferable(amount);

        //then
        assertEquals(expected, result);
    }
}
