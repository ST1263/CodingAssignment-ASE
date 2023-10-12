package JavaAssignmentProgram;

import java.util.HashMap;
import java.util.Map;

public class RomantoNumber {
	public static int romanConvertInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanMap.get(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

            if (currentVal < nextVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }
	public static void main(String[] args) {
		String romanNumeral = "IX";
        int result = romanConvertInt(romanNumeral);
        System.out.println(romanNumeral +"=" + result);
	}
}
