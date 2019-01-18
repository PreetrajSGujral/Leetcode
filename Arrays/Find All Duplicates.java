class Solution {
    public List<Integer> findDuplicates(int[] a) {
      HashMap<Integer, Integer> map= new HashMap();
	List<Integer> list= new ArrayList();
	for(int i=0;i<a.length;i++)
	{
		if(!map.containsKey(a[i]))
		{
			map.put(a[i], 1);
		}
		else
		{
			map.put(a[i],2);
			list.add(a[i]);
		}
	}
        return list;
        
    }
}
