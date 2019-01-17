public int print(int[] a, int beg, int end) {
         if( beg<= end)
         {
        	 int mid =(beg+end)/2;
        	 if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
        		 return mid;
        	 if(a[mid]<a[mid+1])
        	 {
        		return print(a, mid+1, end);
        	 }
        	 if(a[mid]>a[mid+1])
        	 {
        		 return print(a, beg, mid-1);
        	 }
        	 
         }
         return -1;

	 }
    public int peakIndexInMountainArray(int[] A) {
        return print(A, 0, A.length-1);
    }
}
