class Solution {
    

    public int findShortestSubArray(int[] a) {
        if(a.length==0)
            return 0;
        if(a.length==1)
            return 1;
   HashMap<Integer, Integer> map= new HashMap();
	HashMap<Integer, Integer> firstOccurance= new HashMap();
	HashMap<Integer, Integer> lastOccurance= new HashMap();
	int max=0;
	for(int i=0;i<a.length;i++)
	{
		if(!map.containsKey(a[i]))
		{
			map.put(a[i], 1);
			firstOccurance.put(a[i], i);
		}
		else
		{
			int num=map.get(a[i]);
			map.put(a[i], num+1);
			lastOccurance.put(a[i], i);
			if(max<num+1)
			{
				max=num+1;
			}
		}
	}
        if(max==0)
            return 1;
	System.out.println(map);
	int highest=1000000;
	for(int j=0;j<a.length;j++)
	{
		if(map.get(a[j])==max)
		{
			if(highest>( 1+lastOccurance.get(a[j])  - firstOccurance.get(a[j])))
			{
				highest=1+lastOccurance.get(a[j])  - firstOccurance.get(a[j]);
			}
		}
	}
        return highest;
}
}  
