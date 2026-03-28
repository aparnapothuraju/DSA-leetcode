class Solution {
    public int removeElement(int[] nums, int val) 
    {
            int start=-1;
            int count=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==val)
                {
                    if(start==-1)
                    start=i;
                    count++;
                }

                else
                {
                     if(start>=0)
                     {
                     nums[start]=nums[i];
                     start++;
                     }
                    
                }
            }
        return nums.length-count;
    }
}