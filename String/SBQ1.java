package Assignment.Assignment.String;
public class SBQ1 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("StringBuffer");
        stringBuffer.append(" is a peer class of String");
        stringBuffer.append(" that provides much of ");
        stringBuffer.append("the functionality of strings");

        String result = stringBuffer.toString();
        System.out.println(result);
    }
}
