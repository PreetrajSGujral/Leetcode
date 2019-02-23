class Solution {
    public int strStr(String s, String needle) {
        if(needle.length()>s.length())
            return -1;
       int size=needle.length();
		int i=0;
		while(i+size-1<s.length())
		{
			String s1=s.substring(i,i+size);
			//System.out.println(s1);
			if(s1.equals(needle))
			{
				return i;
			}
			++i;
		}	
		return -1;
	}
}
