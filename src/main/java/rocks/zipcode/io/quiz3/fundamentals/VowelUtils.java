package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static final Character[] VOWELS = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o' ,'u'};

    public static Boolean hasVowels(String word) {
        char[] letters = word.toCharArray();
        for(Character letter : letters) {
            for(Character vowel : VOWELS)
            if(letter.equals(vowel)) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] letters = word.toCharArray();

        for(int i = 0; i < letters.length; i++) {
            if(isVowel(letters[i])) {
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        return hasVowels(character.toString());
    }
}
