package hw3;

public class Solution05 {
	public int Search(String target, String[] strs) {
		int lo = 0;
		int hi = strs.length - 1;
		int mid = (lo + hi) / 2;
       //the fundamental idea is binary search
		while (lo < hi) {
			//when there is empty string
			
			if (strs[mid].isEmpty()) {
				int l = mid - 1;
				int r = mid + 1;
				while (strs[mid].isEmpty()) {
					//the array is already traversed
					if (l < lo && r > hi)
						return -1;
					//find the nearest string
					if (l >= lo && !(strs[l].isEmpty())) {
						mid = l;
						break;
					}
					if (r <= hi && !(strs[r].isEmpty())) {
						mid = r;
						break;
					}
					l--;
					r++;
				}
			}
			//compare string 
			if (strs[mid].compareTo(target) < 0) {
				lo = mid + 1;
			} else if (strs[mid].compareTo(target) > 0) {
				hi = mid;
			} else {
                return mid; 
			}
			mid=(lo+hi)/2;
		}
		return -1;
	}
	public static void main(String[] args) {
		String[] strs = {"at","","","","ball","","","car","","","dad","",""};
		Solution05 s = new Solution05();
		System.out.println(s.Search("ball", strs));
	}
}
