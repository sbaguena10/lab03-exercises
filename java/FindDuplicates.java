import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {

	
	 List<Integer> duplicateNums = new ArrayList<>();

	        for (int i = 0; i < l.size(); i++) {
	            for (int j = i + 1; j < l.size(); j++) {
	                if (l.get(i).equals(l.get(j)) && !duplicateNums.contains(l.get(i))) {
	                    duplicateNums.add(l.get(i));
	                }
	            }
	        }
	        return duplicateNums;
	    }

 public static List<Integer> findDuplicatesMap(List<Integer> l) {
        List<Integer> duplicateNums = new ArrayList<>();
        Map<Integer, Integer> repeats  = new HashMap<>();

        for (int num : l) {
            repeats.put(num, repeats.getOrDefault(num, 0) + 1);
        }

        for (int key : repeats.keySet()) {
            if (repeats.get(key) > 1) {
                duplicateNums.add(key);
            }
        }

        return duplicateNums;
    }    	

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));
	System.out.println("Sample 1 (HashMap): " + findDuplicatesMap(sample1));
        System.out.println("Sample 2 (HashMap): " + findDuplicatesMap(sample2));
        System.out.println("Sample 3 (HashMap): " + findDuplicatesMap(sample3));
        System.out.println("Sample 4 (HashMap): " + findDuplicatesMap(sample4));
    
    }

}
