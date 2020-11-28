class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0 || s.length()==1)
            return true;
        s=s.toLowerCase();
        String temp="";
        int start=0;
        int end=s.length()-1;
        for(int i=0; i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
               {
                   temp+=s.charAt(i);
               }
        }
        System.out.println(temp);
        
        for(int i=0; i<temp.length()/2; i++)
        {
            if(temp.charAt(i) != temp.charAt(temp.length()-1-i))
            {
                return false;
            }
        }
        
        return true;
//         while(start<end)
//         {
//             if(Character.isLetter(s.charAt(start)) && Character.isLetter(s.charAt(end)))
//             {
//                 if(s.charAt(start) != s.charAt(end))
//                 {
//                     return false;
//                 }
//                 start++;
//                 end--;
//             }
//             else if(!Character.isLetter(s.charAt(start)))
//             {
//                 start++;
//                 if(start==end)
//                 {
//                     return false;
//                 }
//             }
//             else if(!Character.isLetter(s.charAt(end)))
//             {
//                 end--;
//                 if(start==end)
//                 {
//                     return false;
//                 }
//             }
            
//         }
​
    }
}
