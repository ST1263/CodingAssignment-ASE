package JavaAssignmentProgram;

import java.util.HashSet;
import java.util.Set;

public class ProgramorNot {
	 public static boolean checkPangram(String sentence) {
	        Set<Character> set = new HashSet<>();
	        for (char c : sentence.toCharArray()) {
	            if (!set.contains(c)) {
	                set.add(c);
	            }
	        }
	        return set.size() == 26;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence1 = "mynameisshreyas";
        boolean pangram = checkPangram(sentence1);
        if(pangram == true)
            System.out.println("is pangram");
        else
            System.out.println("not a pangram");

	}

}
