class Solution {
    public int jump(int[] nums) {
     int len = nums.length;
        int dp[] = new int [len];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[len-1]=0;
        
        for(int i=len-2; i>=0 ; i--){
            int min = Integer.MAX_VALUE;
            for( int j= i+1; j<=Math.min(len-1,i+nums[i]); j++){
                min = Math.min(min,dp[j]);
            }
            if(min!=Integer.MAX_VALUE){
                dp[i] = min + 1;
            }
        }
        return dp[0];
    }
}
