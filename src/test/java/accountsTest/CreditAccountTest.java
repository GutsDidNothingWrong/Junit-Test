package accountsTest;

import accounts.CreditAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditAccountTest {
    CreditAccount sut = new CreditAccount(-1000);

    @BeforeEach
    public void initTest() {
        System.out.println("Running test");
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete in: " + System.nanoTime());
    }

    @org.junit.jupiter.api.Test
    public void isTransferableTest() {
        //before
        int amount = 550;
        boolean expected = true;

        //when
        boolean result = sut.isTransferable(amount);

        //then
        assertEquals(expected, result);
    }
}
