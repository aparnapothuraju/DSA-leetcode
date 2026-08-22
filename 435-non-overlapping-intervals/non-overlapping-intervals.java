class Solution 
{
    public int eraseOverlapIntervals(int[][] intervals)
     {
        int minoverlap=0;
        int latestend=0;
         Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
           
           latestend=intervals[0][1];
           for(int i=1;i<intervals.length;i++)
           {
                if(latestend>intervals[i][0])
                minoverlap++;

                else
                latestend=intervals[i][1];
           }

           return minoverlap;
    }
}