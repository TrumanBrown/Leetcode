class Solution {
    public int firstUniqChar(String s) {
        int[] letters= new int[26];
        
        for(int i=0; i<s.length(); i++) //abcb will go to {1,2,1,0,0,0...}
        {
            letters[s.charAt(i)-'a']++;
        }
        
        for(int i=0; i<s.length(); i++)
        {
            if(letters[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        
        return -1;
    }
}
    //     char[] c= s.toCharArray();
    //     boolean repeats=false;
    //     if(c.length==1)
    //     {
    //         return 0;
    //     }
    //     for(int i=0; i<c.length; i++)
    //     {
    //         repeats=false;
    //         for(int j=0; j<c.length; j++)
    //         {
    //             if(c[i]==c[j] && i!=j)
    //             {
    //                 repeats=true;
    //             }
    //         }
    //         if(!repeats)
    //         {
    //             return i;
    //         }
    //     }
    //     return -1;
