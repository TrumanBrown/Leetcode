class Solution {
    int[][] dp;
    public int minDifficulty(int[] jobDiff, int d) {
        if(jobDiff.length < d) return -1;
        dp = new int[d+1][jobDiff.length+1];
        return find(jobDiff, d, 0);
    }
    
    
    
    int find(int[] jobDiff, int day, int start){
        if(start >= jobDiff.length) return -1;
        
        if(dp[day][start] > 0) return dp[day][start];
        if(jobDiff.length-start < day) return -1;
        if(start == jobDiff.length-1 ) {
            if(day == 1)
                return jobDiff[start];
            else{
                return -1;
            }
        }
        if(day == 1){
            int mx = jobDiff[start];
            for(int i=start+1; i<jobDiff.length; i++){
                mx = Math.max(mx, jobDiff[i]);
            }
            dp[day][start] = mx;
            return mx;
        }
        
        int first = jobDiff[start];
        int max = Integer.MAX_VALUE;
        for(int i=start; i<jobDiff.length; i++){
            first = Math.max(first, jobDiff[i]);
            int rem = find(jobDiff, day-1, i+1);
            if(rem > 0){
                max = Math.min(max, first + rem);
            }
        }
        dp[day][start] = max;
        return max;
    }
}
