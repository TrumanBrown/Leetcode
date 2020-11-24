class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
        
        // if(nums.length<2)
        //     return false;
        // for(int i=0; i<nums.length-1; i++)
        // {
        //     for(int j=i+1; j<nums.length; j++)
        //     {
        //         if(nums[j]==nums[i])
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
