class Solution {
    public int maxSubArray(int[] nums) 
    {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;

        if(nums.length==1)
         return nums[0];

        for(int i=0;i<nums.length;i++)
        {
             if(sum>=0)
             {
                sum=nums[i]+sum;
             }
             else sum=nums[i];

             if(sum>maxsum)
             {
                maxsum=sum;
             }
        }

        return maxsum;
        
    }
}