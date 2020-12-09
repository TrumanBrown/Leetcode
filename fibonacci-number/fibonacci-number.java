public class Solution {
    public int fib(int N) {
        // if(N==0)
        // {
        //   return 0;
        // }
        // if(N==1)
        // {
        //   return 1;
        // }
        // else
        // {
        //   return fib(N-1)+fib(N-2);
        // }
        
        
        int arr[]=new int[N+1];
        if(N==0 || N==1)
        {
            return N;
        }
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<N+1; i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[N];
        
        
    }
}
