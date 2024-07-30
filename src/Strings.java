import java.util.Locale;

public class Strings {

    public static void main(String[] args) {

        String firstString = "Test123";
        String secondString = "Test" + 123;
        if (firstString.equals(secondString)) {
            // Both Strings have the same content.
            System.out.println(firstString + " " + secondString);
        }

        String firstString1 = "Test123";
        String secondString1 = "TEST123";
        if (firstString1.equals(secondString1)) {
            // Both Strings have the same content.
            System.out.println(firstString + " " + secondString);
        }

        if (firstString1.equalsIgnoreCase(secondString1)) {
            // Both Strings are equal, ignoring the case of the individual characters.
            System.out.println(firstString1 + " " + secondString1);
        }

        String firstString2 = "Taki";
        String secondString2 = "TAKI";
        System.out.println(firstString2.equalsIgnoreCase(secondString2)); //prints true
        var locale = Locale.forLanguageTag("tr-TR");
        System.out.println(firstString2.toLowerCase(locale).equals(
                secondString2.toLowerCase(locale))); //prints false

        String stringToSwitch = "A";
        switch (stringToSwitch) {
            case "a":
                System.out.println("a");
                break;
            case "A":
                System.out.println("A"); //the code goes here
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                break;
        }

        String strObj = new String("Hello!");
        String str = "Hello!";
// The two string references point two strings that are equal
        if (strObj.equals(str)) {
            System.out.println("The strings are equal");
        }
// The two string references do not point to the same object
        if (strObj != str) {
            System.out.println("The strings are not the same object");
        }
// If we intern a string that is equal to a given literal, the result is
// a string that has the same reference as the literal.
        String internedStr = strObj.intern();
        if (internedStr == str) {
            System.out.println("The interned string and the literal are the same object");
        }


        String code = "code";
        System.out.println(code);
        StringBuilder sb = new StringBuilder(code);
        code = sb.reverse().toString();
        System.out.println(code);


    }
}
