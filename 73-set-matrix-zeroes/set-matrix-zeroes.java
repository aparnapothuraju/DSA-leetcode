class Solution 
{
    
    public void setZeroes(int[][] matrix)
    {
        int column=matrix[0].length;
        int row=matrix.length;
        int rowflag=-1;
        int columflag=-1;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(i==0)
                    rowflag=0;
                    
                    if(j==0)
                    columflag=0;
                    
                    else
                    {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                    }
                }
            }
        }

        for(int i=1;i<row;i++)
        {
            if(matrix[i][0]==0)
            {
                for(int j=0;j<column;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
        for(int j=1;j<column;j++)
        {
            if(matrix[0][j]==0)
            {
                for(int i=0;i<row;i++)
                {
                    matrix[i][j]=0;
                }
            }
        }


       if(columflag==0)
       {
        for(int i=0;i<row;i++)
        {
            matrix[i][0]=0;
        }
       }
       
       if(rowflag==0)
       {
           for(int j=0;j<column;j++)
           {
            matrix[0][j]=0;
           }

       }

    }
}