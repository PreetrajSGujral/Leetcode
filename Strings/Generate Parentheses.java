class Solution {
    public void print(List<String> list, String s, int n, int open, int close)
    {
        if(close==n)
        {
            list.add(s);
            return;
        }
        if(open>close)
        {
            print(list, s+')',n, open, close+1);
        }
        if(open<n)
        {
            print(list, s+'(', n, open+1, close);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list= new ArrayList();
        if(n>0)
            print(list, "", n, 0, 0);
        return list;
    }
}
