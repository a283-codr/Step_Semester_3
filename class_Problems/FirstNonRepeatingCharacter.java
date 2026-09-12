public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingChar(String text) {

        for (int i = 0; i < text.length(); i++) {

            char currentCharacter = text.charAt(i);

            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (currentCharacter == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return currentCharacter;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String text = "swiss";

        char result = findFirstNonRepeatingChar(text);

        if (result == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println(
                    "First Non-Repeating Character: '" + result + "'"
            );
        }
    }
}
