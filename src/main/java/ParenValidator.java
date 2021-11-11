import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class ParenValidator {

    public static void main(String[] args) {
        boolean isValid = validate(args[0]);
        System.out.println("I am "+ isValid);

    }

    public static boolean validate(String s) {
        CharacterIterator characterIterator = new StringCharacterIterator(s);
        if (s.isEmpty()) {
            return true;
        }

        int openPar = 0;
        int closePar = 0;
        while (characterIterator.current() != CharacterIterator.DONE) {
            if (characterIterator.current() == '(') {
                openPar++;
            } else if (characterIterator.current() == ')') {
                closePar++;
            }
            if (closePar > openPar) {
                return false;

            }
            characterIterator.next();


        }
        return openPar == closePar;

    }
}
