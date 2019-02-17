class Solution {
    public int print(String s, HashMap<Character, Integer>map) {
	if(s.length()==0)
		return 0;
	int i=0, ans=0;
	while(i<s.length()-1)
	{
		char ch=s.charAt(i), next= s.charAt(i+1);
		if(map.get(ch)<map.get(next))
		{
			ans-=map.get(ch);
		}
		else
			ans+=map.get(ch);
		++i;	
	}
	ans+=map.get(s.charAt(i));
	return ans;
}
    public int romanToInt(String s) {
       HashMap<Character, Integer> map= new HashMap();
	map.put('I', 1);
	map.put('V', 5);
	map.put('X', 10);
	map.put('L', 50);
	map.put('C', 100);
	map.put('D', 500);
	map.put('M', 1000);
        return print(s, map);
    }
}
