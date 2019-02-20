class Solution {
    
    
    public String find(String s, int beg, int end)
    {
        if(beg<0 || end>=s.length())
            return "";
        while(end<s.length() && beg>=0 && s.charAt(beg)==s.charAt(end))
        {
            beg--;
            end++;
        }
        //System.out.println("beg: "+beg+"  end: "+end+"   pal: "+s.substring(beg+1, end));
        return s.substring(beg+1, end);
    }
    public String longestPalindrome(String s) {
        if(s=="" || s.length()==0)
            return "";
        String palindrome="", result=s.charAt(0)+"";

        for(int i=0;i<s.length()-1;i++)
        {
            String p1=find(s, i,i+1);
            String p2= find(s, i, i);
            if(p1.length()>p2.length())
                palindrome=p1;
            else
                palindrome=p2;
            if(palindrome.length()>result.length())
            {
                result=palindrome;
            }
        } 
        return result;
    }
}
