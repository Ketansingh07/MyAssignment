package Assignment.Assignment.String;
public class SDQ2 {
    public static void main(String[] args) {
        String originalString = "It is used to _ at the specified index position";
        String insertString = "insert text";
        int insertionIndex = originalString.indexOf("_");
        StringBuilder stringBuilder = new StringBuilder(originalString);
        stringBuilder.insert(insertionIndex, insertString);
        String modifiedString = stringBuilder.toString();
        System.out.println("Modified string: " + modifiedString);
    }
}
