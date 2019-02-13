class Solution {
    public int[] twoSum(int[] a, int target) {
        HashMap<Integer, Integer> map= new HashMap();
        int[] result= new int[2];
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],i);
        }
        for(int i=0;i<a.length;i++)
        {
            int x= a[i];
            if((target-x)==x)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[j]==a[i])
                    {
                         result[0]=i;
                        result[1]=j;
                    }
                }
            }
            if((target-x)!= x && map.containsKey(target-x))
            {
                result[0]=i;
	            result[1]=map.get(target-x);
                return result;
            }
        }
        return result;
    }
}
