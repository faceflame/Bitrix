package utilities;

public class StringUtility {

    public static void VerifyEquals(String expected, String actual){
        if (actual.equals(expected)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
            System.out.println("Expected was: " + expected);
            System.out.println("Actual is: " + actual);
        }
    }
}
