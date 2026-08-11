class Solution 
{
    public void sortColors(int[] nums) 
    {
         int low=-1;
         int high=nums.length-1;
         int mid=0;
         int temp=0;

         while(mid<=high)
         {
            if(nums[mid]==1)
            {
                mid++;
            }

            else if(nums[mid]==0)
            {
                temp=nums[low+1];
                nums[low+1]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }

            else
            {
                temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
         }
    }
}