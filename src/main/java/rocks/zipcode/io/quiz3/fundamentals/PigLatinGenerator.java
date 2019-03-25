package rocks.zipcode.io.quiz3.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        Pattern firstVowelPattern = Pattern.compile("^([aeiouAEIOU])");
        Matcher matcher = firstVowelPattern.matcher(str);
        if (matcher.find()) return str + "way";
        return str.replaceAll("^([^aeiouAEIOU]*)(.+)", "$2$1ay");
    }
}
