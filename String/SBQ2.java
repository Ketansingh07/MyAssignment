package Assignment.Assignment.String;
public class SBQ2 {
    public static void main(String[] args) {
        String originalString = "It is used to _ at the specified index position";
        String insertString = "insert text";
        int insertionIndex = originalString.indexOf("_");
        StringBuffer stringBuffer = new StringBuffer(originalString);
        stringBuffer.insert(insertionIndex, insertString);
        String modifiedString = stringBuffer.toString();
        System.out.println("Modified string: " + modifiedString);
    }
}
