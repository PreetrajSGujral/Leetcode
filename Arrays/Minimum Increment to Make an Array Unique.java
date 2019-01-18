class Solution {
    public int minIncrementForUnique(int[] a) {
int sum=0;
		HashSet<Integer> set= new HashSet();
		HashSet<Integer> index= new HashSet();
		int min=100000, max=-1111111;
		for(int i=0;i<a.length;i++)
		{
			if(!set.contains(a[i]))
			{
				set.add(a[i]);
			
			}
			else
				index.add(i);
		}
		
		Iterator it= index.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			int k= (int) o;
			int k1=a[k]+1;
			int it1=0;
			while(set.contains(k1))
			{
				k1++;
				it1++; 
			}
			sum+= k1-a[k];
			a[k]=k1;
			set.add(a[k]);
		}
		
		return sum;       }
}
