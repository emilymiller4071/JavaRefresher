package org.example;

public class StringMatch {
    public static void main(String[] args) {

        int matchCount1 = stringMatch("xxcaazz","xxbaaz");
        System.out.println(matchCount1);

        int matchCount2 = stringMatch("abc","abc");
        System.out.println(matchCount2);

        int matchCount3 = stringMatch("abc","axc");
        System.out.println(matchCount3);

    }
    public static int stringMatch(String a, String b) {
        int matchCount = 0;

        // find the shorter of the two strings
        int shorterString = Math.min(a.length(), b.length());

        // loop through length of shorter string (- 1 so no out-of-bounds)
        for (int current = 0; current < shorterString - 1; current++) {
            // set substrings for a and b (index inclusive, index exclusive)
                String substringA = a.substring(current, current + 2);
                String substringB = b.substring(current, current + 2);

                // increment counter if the substrings return a match
                if (substringA.equals(substringB)) {
                    matchCount++;
                }
        }
        return matchCount;
    }
}