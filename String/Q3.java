package Assignment.Assignment.String;
public class Q3 {
    public static void main(String[] args) {
        String string = "Java String pool refers to collection of Strings which are stored in heap memory";

        // a. Print the string to console in lowercase
        String lowercaseString = string.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);

        // b. Print the string to console in uppercase
        String uppercaseString = string.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        // c. Replace all 'a' character in the string with $ sign
        String replacedString = string.replace('a', '$');
        System.out.println("Replaced string: " + replacedString);

        // d. Check if the original String contains the word "collection"
        boolean containsCollection = string.contains("collection");
        System.out.println("Contains 'collection': " + containsCollection);

        // e. Check if the given string matches the original string
        String comparisonString = "java string pool refers to collection of strings which are stored in heap memory";
        boolean stringsMatch = string.equals(comparisonString);
        System.out.println("Strings match: " + stringsMatch);

        // f. If the strings don't match, use equalsIgnoreCase() method to check equality
        if (!stringsMatch) {
            boolean stringsEqualIgnoreCase = string.equalsIgnoreCase(comparisonString);
            System.out.println("Strings equal (ignore case): " + stringsEqualIgnoreCase);
        }
    }
}
