class Solution {
    public void rotate(int[] a, int k) {
    int[] b= new int[a.length];
    k%=a.length;
	
	for(int i=k;i<a.length;i++)
	{
		b[i]=a[i-k];
	}
	for(int j=0;j<k;j++)
	{
		b[j]=a[a.length-k+j];
	}
	for(int k1=0;k1<a.length;k1++)
    {
        a[k1]=b[k1];
    }
    
    }
    
}
