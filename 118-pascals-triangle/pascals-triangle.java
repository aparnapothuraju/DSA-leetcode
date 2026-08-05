class Solution {
    public List<List<Integer>> generate(int numRows) 
    {

          List<List<Integer>> out = new ArrayList<>();

          if(numRows>=2)
          {
            out.add(List.of(1));
            out.add(List.of(1, 1));
          }

          else if(numRows==1)
          {
             out.add(List.of(1));
             return out;
          }

          for(int i=2;i<numRows;i++)
          {
            List<Integer> temp=new ArrayList<>();
            List<Integer> in=new ArrayList<>();
            temp=out.get(i-1);
            int left=0;
            int right=1;
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                in.add(1);
                
                else
                {
                    in.add(temp.get(left)+temp.get(right));
                    left++;
                    right++;
                }
                
            }
            out.add(in);
          }

          return out;        
        
    }
}