class Solution {
    public String longestCommonPrefix(String[] a) {
        String res="";
        if(a.length==0)
            return res;
        if(a.length==1)
            return a[0];
        for(int i=0;i<a[0].length();i++)
        {
            char x= a[0].charAt(i);
            for(int j=1;j<a.length;j++)
            {
                if((a[j].length()>i && a[j].charAt(i)!=x)|| a[j].length()<=i)
                {
                   return res;
                }
                
            }
            res+=x;
        }
        return res;
    }
}
