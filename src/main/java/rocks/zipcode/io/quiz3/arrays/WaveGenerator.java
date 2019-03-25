package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();

        Set<String> waveList = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                String wave = StringUtils.capitalizeNthCharacter(str, i);
                waveList.add(wave);
            }
        }
        String[] stringArray = waveList.toArray(new String[waveList.size()]);
        return stringArray;
    }
}
