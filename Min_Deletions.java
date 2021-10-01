class Solution {
    public static int minDeletions(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0, len = str.length(); i < len; ++i) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		Set<Character> keys = map.keySet();
		int arr[] = new int[map.size()];
		int count = -1;
		int max = Integer.MIN_VALUE;

		for (char key : keys) {
			int value = map.get(key);
			arr[++count] = value;
			max = Math.max(max, value);

		}

		count = 0;

		int help[] = new int[max + 1];


		for (int i = 0, len = arr.length; i < len; ++i) {

			int curr = arr[i];

			for (int diff = 0; diff < curr; diff++) {
				if (help[curr - diff] == 1)
					++count;
				else {
					help[curr - diff] = 1;
					break;
				}
			}
		}
		return count;
	}
        
}
