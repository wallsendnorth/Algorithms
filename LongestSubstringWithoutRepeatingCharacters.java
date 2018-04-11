import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int i = 0, j = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                j = Math.max(j, map.get(c) + 1);
            }
            map.put(c, i);
            maxLen = Math.max(maxLen, i - j + 1);
        }
        return maxLen;
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int maxLen = lengthOfLongestSubstring(s);
		in.close();
		System.out.println(maxLen);
	}
}
