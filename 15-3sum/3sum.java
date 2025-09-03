class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> arr;
        Arrays.sort(nums);
        int ptr1=1;
        int ptr2=nums.length-1;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
        
           if(i!=0 && nums[i]==nums[i-1])
            continue;

            ptr1=i+1;
            ptr2=nums.length-1;
            sum=nums[i];
            while(ptr1<ptr2)
            {
               sum=sum+nums[ptr1]+nums[ptr2];
               arr=new ArrayList<Integer>();
               if(sum==0)
               {
                arr.add(nums[i]);
                arr.add(nums[ptr1]);
                arr.add(nums[ptr2]);
                li.add(arr);
                while(ptr1<ptr2 && nums[ptr1]==nums[ptr1+1])
                ptr1++;

                while(ptr1<ptr2 && nums[ptr2]==nums[ptr2-1])
                ptr2--;

                ptr1++;
                ptr2--;
               }
               
               else if(sum>0)
               {
                ptr2--;
               }
               else
               ptr1++;

               sum=nums[i];
            }
        }
        
        return li;
        
    }
}