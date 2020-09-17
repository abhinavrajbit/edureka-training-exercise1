package com.abhinav.testDemo;
 
import java.util.HashMap;
import java.util.Map;

public class AnagramDetector {
    public Map<Character, Integer> countLetters(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : s.toLowerCase().toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
            // alternative, not reading as nicely, but using one less Map lookup:
            // result.compute(c, (ignored, oldCount) -> oldCount == null ? 1 : oldCount+1);
        }
        return result;
    }

    public boolean isAnagramOf(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("isAnagramOf: arguments must be non-null.");
        }

        if (a.equals(b)) {
            return true;
        }

        return countLetters(a).equals(countLetters(b));
    }
}
			
