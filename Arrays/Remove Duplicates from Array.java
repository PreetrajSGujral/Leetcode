class Solution {
    public int removeDuplicates(int[] a) {
        int i=0, j=1;
	int pos=1;
	int num=0;
	while(j<a.length)
	{
		if(a[i]==a[j])
		{
			j++;
		}
		if(j<a.length && a[i]!=a[j])
		{
			++num;
			a[pos]=a[j];
			pos++;
			i=j;
			j++;
		}
	}
	return num+1;
    }
}
