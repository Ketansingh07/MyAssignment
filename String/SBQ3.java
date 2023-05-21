package Assignment.Assignment.String;
public class SBQ3 {
    public static void main(String[] args) {
        String originalString = "This method returns the reversed object on which it was called";
        //obj of string buffer
        StringBuffer stringBuffer = new StringBuffer(originalString);
        stringBuffer.reverse();
        // Converting the obj back to a string
        String reversedString = stringBuffer.toString();
        System.out.println("Reversed string: " + reversedString);
    }
}
