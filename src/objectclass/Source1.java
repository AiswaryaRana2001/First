package objectclass;

//6-ANAGRAMS:-


import java.util.ArrayList;
import java.util.List;
public class Source1{
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0 || p.length() > s.length()) {
            return result;
        }
        int[] count = new int[26];
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }
        int start = 0, end = 0, counter = p.length();
        char[] arrS = s.toCharArray();
        while (end < s.length()) {
            if (count[arrS[end++] - 'a']-- > 0) {
                counter--;
            }
            if (counter == 0) {
                result.add(start);
            }
            if (end - start == p.length() && count[arrS[start++] - 'a']++ >= 0) {
                counter++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Source1 source = new Source1();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(source.findAnagrams(s, p)); // Output: [0, 6]
    }
}
