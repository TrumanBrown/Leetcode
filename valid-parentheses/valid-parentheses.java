class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackCount = new Stack<>();
        if(s.length()==1)
        {
            return false;
        }
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                stackCount.push(s.charAt(i));
            }
            else if(stackCount.empty())
            {
                return false;
            }
            else if(s.charAt(i)==')')
            {
                char top=stackCount.pop();
                if(top!='(')
                {
                    return false;
                }
            }
            else if(s.charAt(i)==']')
            {
                char top=stackCount.pop();
                if(top!='[')
                {
                    return false;
                }
            }
            else if(s.charAt(i)=='}')
            {
                char top=stackCount.pop();
                if(top!='{')
                {
                    return false;
                }
            }
        }
        return stackCount.empty();
    }
}
