class Solution {
	public List<Integer> majorityElement(int[] nums) {
                
                                  

		int thresh = (int) Math.floor(1.0 * nums.length / 3);

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
		HashSet<Integer> set = new HashSet();

		for (int val: nums) {
			map.put(val, map.getOrDefault(val, 0) + 1);
			int freq = map.get(val);
			if (freq > thresh)
				set.add(val);

		}

		ArrayList<Integer> list = new ArrayList<>();

		for (int key: set)
			list.add(key);

		return list;

	}
}
