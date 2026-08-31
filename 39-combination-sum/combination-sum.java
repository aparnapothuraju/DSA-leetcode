class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> output=new ArrayList<>();
      
      backtrack(candidates,0,target,target,new ArrayList<>(),0,output);

      return output;

        
    }

    public void backtrack(int[] candidates,int index, int remaining,int target,ArrayList<Integer> current,int sum,List<List<Integer>> output)
    {
           if(index == candidates.length || remaining < 0)
           return ;

            if(remaining ==0)
            {
                if(sum==target)
                output.add(new ArrayList<>(current));
                return;

            }

            sum=sum+candidates[index];
            current.add(candidates[index]);
            

            backtrack(candidates,index,target-sum,target,current,sum,output);

             sum=sum-candidates[index];
             current.remove(current.size()-1);

             backtrack(candidates,index+1,remaining,target,current,sum,output);
    }


}