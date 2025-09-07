class Solution {
    public int maxProduct(int[] nums) 
    {
        int maxproduct=Integer.MIN_VALUE;
        int product=1;
        int minproduct=1;
        int temp=1;
        if(nums.length==1)
        return nums[0];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                temp=product;
                product=minproduct;
                minproduct=temp;
            }
            product=Math.max(product*nums[i],nums[i]);
            minproduct=Math.min(minproduct*nums[i],nums[i]);
            
            
             maxproduct=Math.max(product,maxproduct);
        }

        return maxproduct;
        
    }
}