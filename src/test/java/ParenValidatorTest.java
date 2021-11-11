import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParenValidatorTest {


    @Test
    public void isValidWithEqualOpenCloseParen() {
        String s = "((()()))";
        assertTrue(ParenValidator.validate(s));
    }

    @Test
    public void isValidWhenStringHasMatchingParens() {
        String s = "(x (abc))";
        assertTrue(ParenValidator.validate(s));
    }

    @Test
    public void isInvalidWhenStringHasExtraOpenParen() {
        String s = "(foo (bar)";
        assertFalse(ParenValidator.validate(s));
    }

    @Test
    public void isInvalidWhenStringHasExtraCloseParen() {
        String s = "(foo x))";
        assertFalse(ParenValidator.validate(s));
    }

    @Test
    public void isInvalidWhenStringHasOutOfOrderParen() {
        String s = ")(foo x)(";
        assertFalse(ParenValidator.validate(s));
    }


}
