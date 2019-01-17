class Solution {
    public int findPairs(int[] nums, int k) {
      	int count = 0;
		Arrays.sort(nums);
		HashMap<Integer, Integer> map = new HashMap<>();
		//this map will contain unique pairs
        HashMap<Integer, Integer> resultMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int diff = k+nums[i];
			if (map.containsKey(nums[i])) {
               resultMap .put(diff, nums[i]);
				map.put(diff , nums[i]);
				
			} else {
				map.put(diff, nums[i]);
			}
		}
		return resultMap .size();
    }
	
 }
