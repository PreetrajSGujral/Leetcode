class Solution {
    
    public int print(int []a, int beg, int end)
    {
        if(beg<=end)
        {
            int mid= (beg+end)/2;
            if(mid<a.length-1 && mid >0 )
            {
                if(a[mid]!=a[mid-1] && a[mid]!=a[mid+1])
                {
                    return a[mid];              
                }
                int x= print(a, beg, mid-1);
                int y= print(a, mid+1, end);
                if(x!=-1)
                    return x;
                return y;
            }              
            
        }
                    return -1;

    }
    
    public int singleNonDuplicate(int[] a) {
        if(a[0]!=a[1])
            return a[0];
        if(a[a.length-1]!=a[a.length-2])
            return a[a.length-1];
        return print(a, 0, a.length-1);
    }
}
