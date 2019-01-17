class Solution {
    public  int[] merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
     return arr;
    }
public  int[] mergesort(int[] a, int beg, int end)
{
	
	if(beg<end)
	{
		int mid=beg+end;
		mid/=2; 
		mergesort(a, beg, mid);
		mergesort(a,mid+1, end);
		return merge(a, beg, mid, end);
	}
	else return a;
}
    public int arrayPairSum(int[] a) {
        a=mergesort(a,0,a.length-1);
        int sum=0;
        for(int i=0;i<a.length;i+=2)
        {
            sum+=Math.min(a[i], a[i+1]);
        }
        return sum;
    }
}
