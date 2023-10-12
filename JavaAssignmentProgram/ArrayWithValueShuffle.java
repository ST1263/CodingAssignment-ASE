package JavaAssignmentProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayWithValueShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
        Collections.shuffle(arr);
        System.out.println("Shuffle Array is : " + arr);
	}

}
