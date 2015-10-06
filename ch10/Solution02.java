package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution02 {
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0)
			return null;
		List<List<String>> result = new ArrayList<List<String>>();
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		// sort the strings
		// map the string and string lists, if strings are same after sorted put
		// them into same string lists
		for (int i = 0; i < strs.length; i++) {
			char[] str = strs[i].toCharArray();
			// System.out.println("str:"+String.valueOf(str));
			Arrays.sort(str);
			String newStr = String.valueOf(str);
			// System.out.println("newstr:"+strs[i]);
			if (map.containsKey(newStr)) {
				map.get(newStr).add(strs[i]);
			} else {
				ArrayList<String> group = new ArrayList<String>();
				group.add(strs[i]);
				map.put(newStr, group);
			}
		}
		// traverse hashmap
		Iterator<Entry<String, List<String>>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, List<String>> entry = (Entry<String, List<String>>) iter.next();
			List<String> list = (List<String>) entry.getValue();
			result.add(list);
		}

		return result;
	}

	public static void main(String[] args) {
		String[] strs = { "trdf", "sfee", "eat", "tea", "eefs" };
		List<List<String>> result = new ArrayList<List<String>>();
		Solution02 s = new Solution02();
		result = s.groupAnagrams(strs);
		for (int i = 0; i < result.size(); i++) {
			System.out.print("{");
			for (int j = 0; j < result.get(i).size(); j++) {
				System.out.print(result.get(i).get(j) + ", ");
			}
			System.out.println("}");
		}
	}
}
