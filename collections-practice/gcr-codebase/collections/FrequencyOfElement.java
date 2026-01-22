//Problem Statement: Find Frequency of Elements
//Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
//Example:
//Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}

import java.util.*;

class FrequencyOfElement {
   //   2. Find frequency of elements
	public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String item : list) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(findFrequency(list));
    }


}
