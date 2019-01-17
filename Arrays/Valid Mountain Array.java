class Solution {
    public boolean validMountainArray(int[] a) {
        int index=0;
        
        int i=0;
        
        if(a.length<=2)
            return false;
        while(i<a.length-1)
        {
            if(a[i]<a[i+1])
                ++i;
            else
                break;
        }
        if(a[i]==a[0])
            return false;
        else
            index=i;
        
        while(i<a.length-1)
        {
            if(a[i]>a[i+1])
            {
                ++i;
            }
            else 
                break;
        }
        if(i<a.length-1 || a[index]==a[i])
            return false;
       
    return true;
    }
}
