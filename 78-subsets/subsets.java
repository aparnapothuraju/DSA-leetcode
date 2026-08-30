class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {

       List<List<Integer>> output = new ArrayList<>();

        backtrack(nums,0,new ArrayList<>(),output);

        return output;
        
    }

    public void backtrack(int[] nums,int index,List<Integer> current, List<List<Integer>> output)
    {
       

        if(index==nums.length)
        {
        output.add(new ArrayList<>(current));
        return;
        }

        current.add(nums[index]);

        backtrack(nums,index+1,current,output);

         current.remove(current.size()-1);
        
        backtrack(nums,index+1,current,output);
    }
}