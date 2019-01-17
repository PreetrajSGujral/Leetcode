class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet();
        for(int i=0;i<nums2.length;i++)
        {
            set.add(nums2[i]);
        }
        
        ArrayList<Integer> array= new ArrayList();
        for(int j=0;j<nums1.length;j++)
        {
            if(set.contains(nums1[j]))
            {
                if(!array.contains(nums1[j]))
                {
                    array.add(nums1[j]);
                }
            }
        }
        int[] result= new int[array.size()];
        int i=0;
        while(!array.isEmpty())
        {
            result[i]=array.remove(0);
            ++i;
        }
        return result;
    }
}
