class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> check= new ArrayList();
        for(int i=0;i<nums.length;i++)
        {
            int val=Math.abs(nums[i]);
            if(nums[val-1]>0)
                nums[val-1]= -nums[val-1];
        }
        
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]>0)
                check.add(j+1);
        }
        
        return check;
    }
}
