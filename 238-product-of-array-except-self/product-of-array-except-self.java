class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] prefix=new int[nums.length];
        int[] sufix=new int[nums.length];
        int[] result=new int[nums.length];  
        int pro=1;
        int temp;

        for(int i=0;i<nums.length;i++)
        {
            temp=nums[i];
            prefix[i]=pro;
            pro=temp*pro;
        }
        
        pro=1;
        for(int j=nums.length-1;j>=0;j--)
        {
            temp=nums[j];
            sufix[j]=pro;
            pro=temp*pro;
        }
        


        for(int k=0;k<nums.length;k++)
        {
            result[k]=prefix[k]*sufix[k];
            
        }
        
        return result;
        
    }
}