class Solution {
    public boolean isMonotonic(int[] a) {
       int n=a.length;
	        
        	if(a[n-1]>a[0])
        	{
        		for(int i=1;i<n;i++)
        		{
        			if(a[i]<a[i-1])
        				return false;
        		}
        	}
        	else if(a[n-1]<a[0])
        	{
        		for(int i=1;i<n;i++)
        		{
        			if(a[i]>a[i-1])
        				return false;
        		}
        	}
        	else
        	{
        		for(int i=0;i<n-1;i++)
        		{
        			if(a[i+1]!=a[i])
        				return false;
        		}
        	}
	        return true;

	    }
}
