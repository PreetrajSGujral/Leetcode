import java.lang.*;
import java.util.*;
class Solution {
    public int[] sortArrayByParity(int[] a) {
        Queue<Integer> even= new LinkedList();
        Queue<Integer> odd= new LinkedList();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even.add(a[i]);
            }
            else
            odd.add(a[i]);
        }
       int i=0;
        while(!even.isEmpty())
        {
            a[i]=even.remove();
            ++i;
        }
        while(!odd.isEmpty())
        {
            a[i]=odd.remove();
            ++i;
        }
        return a;
    }
}
