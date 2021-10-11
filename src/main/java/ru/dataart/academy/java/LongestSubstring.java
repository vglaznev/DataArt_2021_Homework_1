package ru.dataart.academy.java;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        int[] posOfUsedChars = new int[256];
        Arrays.fill(posOfUsedChars, -1);
        int indOfPrevUsedChar, lengthOfLongestSubstr = 0;
        char currentSymbol;

        for (int begOfSubstr = 0, endOfSubstr = 0; endOfSubstr < checkString.length(); endOfSubstr++) {
            currentSymbol = checkString.charAt(endOfSubstr);
            indOfPrevUsedChar = posOfUsedChars[currentSymbol];

            if (indOfPrevUsedChar != -1 && indOfPrevUsedChar >= begOfSubstr)
                begOfSubstr = indOfPrevUsedChar + 1;

            if (endOfSubstr - begOfSubstr + 1 > lengthOfLongestSubstr)
                lengthOfLongestSubstr = endOfSubstr - begOfSubstr + 1;

            posOfUsedChars[currentSymbol] = endOfSubstr;
        }
        return lengthOfLongestSubstr;
    }
}
