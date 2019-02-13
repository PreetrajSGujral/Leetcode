class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0)
            return resultList;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;  // don't repeat the loop for the same number (in order to avoid duplicates)

            int firstPointer = i + 1;
            int endPointer = nums.length - 1;

            while (firstPointer < endPointer) {
                if (nums[i] + nums[firstPointer] + nums[endPointer] == 0) {
                    resultList.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[firstPointer], nums[endPointer])));
                    firstPointer++;
                    endPointer--;
                    while (firstPointer < endPointer && nums[firstPointer] == nums[firstPointer - 1]) {   // increment the first pointer till it encounters a different element (in order to avoid duplicates)
                        firstPointer++;
                    }
                    while (endPointer > firstPointer && nums[endPointer] == nums[endPointer + 1]) {  // decrement the end pointer till it encounters a different element (in order to avoid duplicates)
                        endPointer--;
                    }
                } else if (nums[i] + nums[firstPointer] + nums[endPointer] < 0) {
                    firstPointer++;
                    while (firstPointer < endPointer && nums[firstPointer] == nums[firstPointer - 1]) {
                        firstPointer++;
                    }
                } else {
                    endPointer--;
                    while (endPointer > firstPointer && nums[endPointer] == nums[endPointer + 1]) {
                        endPointer--;
                    }
                }
            }
        }
        return resultList;
    }
}
