class Solution {
    
    public int arrangeCoins(int n) {
    return arrange(n, 1);
  }

private int arrange(int n, int row){
    if(n<row){
        return 0;
    }
    else{
        return 1+arrange(n-row,row+1);
    }
}
}
