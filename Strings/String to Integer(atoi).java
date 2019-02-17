class Solution {
    public int myAtoi(String str) {
        boolean start=true;
        long r=0;
        long k=1;
        for (char c:str.toCharArray()){
           if (c==' ' && start)continue;
            else if (c>=48 && c<=57){
                start=false;
                r=r*10+k*(c-48);
                if (r>=Integer.MAX_VALUE)return Integer.MAX_VALUE;
                else if (r<Integer.MIN_VALUE)return Integer.MIN_VALUE;
            }
            else if (c=='+' && start){
                start=false;
                continue;
            }
            else if (c=='-' && start){
                start=false;
                k=-1;
            }
            else return compare(r);
       }
        return compare(r);    
}
    public int compare(long l){
        if (l<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        if (l>Integer.MAX_VALUE)return Integer.MAX_VALUE;
        return (int)l;
        
    } 
}
