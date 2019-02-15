class Solution {
    public int majorityElement(int[] a) {
        HashMap<Integer, Integer> map= new HashMap();
		
        int max=0, index= 0;
		for(int i=0;i<a.length;i++)
		{
			if(!map.containsKey(a[i]))
			{
				map.put(a[i], 1);
				if(max<0)
					max=1;
			}
			else
			{
				int x= map.get(a[i]);
				if(x+1>max)
				{
					max=x+1;
					index=i;
				}
				map.put(a[i], x+1);
			}
		}
        return a[index];
    }
}
