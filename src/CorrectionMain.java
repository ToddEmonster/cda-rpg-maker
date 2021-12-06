import correction.Character;

import java.util.Scanner;

public class CorrectionMain {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        testCharacter();
    }

    private static void testCharacter() {
        Character henri = new Character("Henri le PNJ");
        System.out.println(henri);
    }
}
