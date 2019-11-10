import java.io.IOException;

public class CodeChallenge2Stage1 {

    static public void main(String[] args) {

        for (int nr = 1; nr <= 100; nr++) {
            if ((nr % 3 == 0) || (nr % 5 == 0) || (nr % 7 == 0)) {
                ComputeDivizibil(nr);
                CheckDigit(nr);
                System.out.println(ReplaceZero(nr));
            } else {
                CheckDigit(nr);
                System.out.println(ReplaceZero(nr));
            }
        }
    }

    public static void ComputeDivizibil(int number) {
        String rem1 = null;
        String rem2 = null;
        String rem3 = null;

        if (number % 3 == 0) {
            rem1 = "Foo";
        }
        if (number % 5 == 0) {
            rem2 = "Bar";
        }
        if (number % 7 == 0) {
            rem3 = "Qix";
        }
        if (rem1 == null || rem2 == null || rem3 == null) {
            String toReturn = rem1 + rem2 + rem3;
            String extractFromString = toReturn.replaceAll("null", "");
            System.out.print(extractFromString);
        }
    }

    public static void CheckDigit(int holeNumber) {
        String rem = null;

        while (holeNumber % 10 > 0) {
            int reminder = holeNumber % 10;

            if (reminder == 3) {
                rem += "Foo";
            } else if (reminder == 5) {
                rem += "Bar";
            } else if (reminder == 7) {
                rem += "Qix";
            }

            holeNumber = holeNumber / 10;
        }

        try {
            if (!(rem.equals("null"))) {
                String extractFromString = rem.replaceAll("null", "");
                System.out.print(extractFromString);
            }
        } catch (Exception e) {
            System.out.print("");
        }
    }

    public static String ReplaceZero(int n) {
        String rem = String.valueOf(n);
        rem = rem.replaceAll("0","*");
        return rem;
    }
}
// Question:
// Why return function won't see return statements from if/else?