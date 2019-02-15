class Solution {
    public int findPeakElement(int[] a) {
        int max= Integer.MIN_VALUE, index=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                index=i;
            }
        }
        return index;
    }
}
