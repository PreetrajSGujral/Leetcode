class Solution {
    String[] a={"","","abc","def", "ghi","jkl","mno", "pqrs", "tuv","wxyz"};
    
    
    public void print(String s,String str, List<String> list, int n)
	{
		if(str.length()==s.length())
		{
			String s1= str;
			list.add(s1);
			return ;
		}
		int index= s.charAt(n)-'0';
		for(int i=0;i<a[index].length();i++)
		{
			char ch=a[index].charAt(i);
			print(s, str+ch, list, n+1);
		}
	}
    
    
    public List<String> letterCombinations(String digits) {
        		List<String> list= new ArrayList<>();
                if(digits.length()==0)
                    return list;
        print(digits,"", list, 0);
            return list;
    }
}
