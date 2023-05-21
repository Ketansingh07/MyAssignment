package Assignment.Assignment.String;
public class SDQ1 {
    public static void main(String[] args) {
        String str1 = "StringBuffer";
        String str2 = "is a peer class of String";
        String str3 = "that provides much of ";
        String str4 = "the functionality of strings";
        // Creating a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1)
                .append(" ")
                .append(str2)
                .append(" ")
                .append(str3)
                .append(str4);
        // Converting the StringBuilder object to a string
        String appendedString = stringBuilder.toString();
        System.out.println("Appended string: " + appendedString);
    }
}
