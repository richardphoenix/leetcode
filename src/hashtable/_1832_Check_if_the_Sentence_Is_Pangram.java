package hashtable;

import java.util.HashSet;

/**
 * @author Richard Phoenix
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */
public class _1832_Check_if_the_Sentence_Is_Pangram {

    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            set.add(c);
        }
        return set.size() == 26;
    }
}
