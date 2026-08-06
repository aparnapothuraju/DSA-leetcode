class Solution {
    public void nextPermutation(int[] nums) 
    {
        int breakpoint=-1;
        int temp=0;
        int left,right;
        boolean flag=true;

        for(int i=nums.length-1;i>=0;i--)
        {
            
            if(i!=0 && nums[i]>nums[i-1])
            {
             breakpoint=i-1; 
             break;
            }

        }

        if(breakpoint!=-1)
        {
           int i=nums.length-1;
        while(i>breakpoint)
        {
            if(nums[breakpoint]<nums[i])
            {
               temp= nums[breakpoint];
               nums[breakpoint]=nums[i];
               nums[i]=temp;
               break;
            }
            i--;
        }

        }
        

        left=breakpoint+1;
        right=nums.length-1;

        while(left<right)
        {
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
        

        
    }
}