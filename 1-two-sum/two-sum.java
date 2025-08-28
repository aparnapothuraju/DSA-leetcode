class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int var=target-nums[i];
            if(var<0)
                Math.abs(var);
            if(hs.containsKey(var))
            {
                result[0]=i;
                result[1]=hs.get(var);
                return result;
            }
            else
                hs.put(nums[i],i);
       }
        return result;
    }
}