class Solution {
    
    
    //  IF ONE SERIES OF INDICES IS VISITED, IT WILL COVER ALL THE POSSIBLE INBOUND AND OUTBOUND INDICES... IF A[0], A[2], A[4], A[5] ARE CONNECTED, THEN FROM ANY OF THEM, EACH WILL BE VISITED, WHICH MEANS THAT ALL 4 WILL GIVE THE SAME RESULT.. THIS WAY DIFFRENT RESULTS WILL BE OBTAINED...  IN ABOVE EG-> ORDER CAN BE 0,2,4,5 / 2,4,5,0 / 4,5,0,2 / 5,0,2,4  WHICH GIVES ANSWER STILL AS 4( SIZE 4)
    
    
    public int arrayNesting(int[] a) {
    int count=0, res=0;
		int max= Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			int x=i;
			
			while(a[x]!=max)
			{
				int y=a[x];
				a[x]=max;
				x=y;	
				count++;
			}
			if(count>res)
				res=count;
			count=0;
			
		}
		
	
	        return res;
	}
}
