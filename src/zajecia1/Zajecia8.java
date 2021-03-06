package zajecia1;

/**
 * Created by RENT on 2017-04-13.
 */
public class Zajecia8 {
    public static void main(String[] args) {
        charAndStringTest();
        System.out.println(countCharacterIn("Ala ma kota", 'a'));
        String pokemonMessage = "AjhGFhJifFeRy";
        System.out.println(countCapitalLetters(pokemonMessage));
        System.out.println();
        System.out.println(switchCase("Ala ma kota"));
    }

    public static void charAndStringTest() {
        String message = "Ala ma kota";
        char znak = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(znak + ", ");
            znak++;
        }
        char[] charArray = message.toCharArray();
        System.out.println(message.length());
    }

    public static int countCharacterIn(String message, char character) {
        int counter = 0;
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == character){
                counter++;
            }
        }
        return counter;
    }

    public static int countCapitalLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 65 && charArray[i] <= 90){
                counter++;
            }
        }
        return counter;
    }

    public static int sumOfNumbers(String message) {
        char[] charArray = message.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] > 48 && charArray[i] <= 57){
                sum += charArray[i] - 48;
            }
        }
        return sum;
    }

    public static String toLowerCase(String message) {
        char[] charArray = message.toCharArray();
        if(charArray[0] >= 65 && charArray[0] <= 90){
            charArray[0] = (char)(charArray[0] + 32);
        }
        return String.valueOf(charArray);
    }

    public static String toUpperCase(String message){
        char[] charArray = message.toCharArray();
        if(charArray[0] >= 97 && charArray[0] <= 122){
            charArray[0] = (char)(charArray[0] - 32);
        }
        return String.valueOf(charArray);
    }

    public static boolean startsWith(String message, String someValue){
        char[] messageCharacters = message.toCharArray();
        char[] someValueCharacters = someValue.toCharArray();
        boolean flag = true;
        int i = 0;
        while(flag && i < someValueCharacters.length){
            if(someValueCharacters[i] != messageCharacters[i]){
                flag = false;
            }
            i++;
        }
        return flag;
    }

    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        boolean palindrome = true;
        int i = 0;
        while (palindrome && i < charArray.length / 2){
            if(charArray[i] != charArray[charArray.length - i - 1]){
                palindrome = false;
            }
            i++;
        }
        return palindrome;
    }

    public static String ananimOf(String message){
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length/2; i++) {
            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = tmp;
        }
        return String.valueOf(charArray);
    }

    public static int countSmallLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 97 && charArray[i] <= 122){
                counter++;
            }
        }
        return counter;
    }

    public static int countWords(String message){
        char[] charArray = message.toCharArray();
        int counter = 1;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == ' '){
                counter++;
            }
        }
        return counter;
    }

    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 97 && charArray[i] <= 122){
                charArray[i] -= 32;
            } else if (charArray[i] >= 65 && charArray[i] <= 90){
                charArray[i] += 32;
            }
        }
        return String.valueOf(charArray);
    }
}
