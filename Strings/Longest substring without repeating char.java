class Solution {
    public int lengthOfLongestSubstring(String s) {
      int max=0, size=0, j=0;
		HashSet<Character> set= new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			if(!set.contains(s.charAt(i)))
			{
				set.add(s.charAt(i));
				//System.out.print(s.charAt(i)+" ");
				size++;
				//System.out.println(size);
				if(max<=size)
					max=size;
			}
			else
			{
				while(s.charAt(j)!=s.charAt(i))
				{
					set.remove(s.charAt(j));
					j++;
					size--;
				}
				size--;
				set.remove(s.charAt(j));
				j++;
				i--;
			}	
		}
        return max;
    }
}
