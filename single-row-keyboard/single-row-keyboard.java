class Solution {
    public int calculateTime(String keyboard, String word) {
        int count=0;
        int index=0;
        for(int i=0; i<word.length(); i++)
        {
            for(int j=0; j<keyboard.length(); j++)
            {
                if(keyboard.charAt(j)==word.charAt(i))
                {
                    count+=Math.abs(j-index);
                    index=j;
                }
            }
        }
        return count;
    }
}
