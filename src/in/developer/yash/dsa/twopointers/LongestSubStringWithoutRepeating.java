package in.developer.yash.dsa.twopointers;

import java.util.HashSet;

public class LongestSubStringWithoutRepeating {
	public int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty()) return 0;

        int i = 0, j = 0;
        HashSet<Character> resultString = new HashSet<>();
        int maxlen = 0;

        while(j < s.length()){
            if(!resultString.contains(s.charAt(j))){                
                resultString.add(s.charAt(j));
                maxlen = Math.max(j-i+1,maxlen);
                j++;
            }else{
                resultString.remove(s.charAt(i));
                i++;
            }
        }
    return maxlen;
    }
}
