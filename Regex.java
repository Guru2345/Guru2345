import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Hello 123 World!";
        String regex = "\\d+"; // Matches one or more digits

        Pattern pattern = Pattern.compile(regex); // Compile regex
        Matcher matcher = pattern.matcher(text);  // Create matcher

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
