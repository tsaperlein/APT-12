package first.question;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IntegerSubtractionTest {

	@Test
    void testSubtractAndReturn_Positive() {
		assertEquals("Positive", IntegerSubtraction.subtractAndReturn(5, 3), "5-3 has a positive result");
    }

    @Test
    void testSubtractAndReturn_Negative() {
    	assertEquals("Negative", IntegerSubtraction.subtractAndReturn(3, 5), "3-5 has a negative result");
    }

}