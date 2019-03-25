package rocks.zipcode.io.quiz3.fundamentals;

import java.util.*;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String afterCapped = "";

        char [] letters = str.toCharArray();

        for(int i = 0; i < letters.length; i++) {
            if(i == indexToCapitalize) {
                afterCapped += Character.toUpperCase(letters[i]);
            } else {
                afterCapped += letters[i];
            }
        }
        return afterCapped;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char [] letters = baseString.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if(letters[indexOfString] == characterToCheckFor) {
                return true;
            }
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> noDupes = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for(int j = i+1; j <= string.length(); j++) {
                noDupes.add(string.substring(i,j));
            }
        }

        String[] allSubstrings = noDupes.toArray(new String[noDupes.size()]);
        return allSubstrings;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
