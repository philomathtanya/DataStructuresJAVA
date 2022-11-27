class Solution {
	public List<List<Integer>> permuteUnique(int[] nums) {
		int[] freq = new int[21];

		// Creating the frequency array.
		for (int i : nums)
			freq[i + 10] ++;

		List<List<Integer>> output = new ArrayList<>();
		permuteUniqueHelper(freq, new ArrayList<>(), nums.length, 0, output);
		return output;
	}

	public void permuteUniqueHelper(int[] freq, ArrayList<Integer> res, int tC, int cCount, List<List<Integer>> output) {
		if (cCount == tC) {
			output.add(List.copyOf(res));
			return;
		}

		for (int i = 0; i < freq.length; i ++) {
			if (freq[i] > 0) {
				freq[i] --;

				res.add(i - 10);
				permuteUniqueHelper(freq, res, tC, cCount + 1, output);
				res.remove(cCount);

				freq[i] ++;
			}
		}
	}
}
