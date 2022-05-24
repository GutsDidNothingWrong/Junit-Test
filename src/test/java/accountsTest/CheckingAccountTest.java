package accountsTest;

import accounts.CheckingAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckingAccountTest {

    @BeforeEach
    public void initTest() {
        System.out.println("Running test");
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete in: " + System.nanoTime());
    }

    CheckingAccount sut = new CheckingAccount(0);

    @org.junit.jupiter.api.Test
    public void isTransferableTest() {
        //before
        int amount = 500;
        boolean expected = true;

        //when
        boolean result = sut.isTransferable(amount);

        //then
        assertEquals(expected, result);
    }

}
