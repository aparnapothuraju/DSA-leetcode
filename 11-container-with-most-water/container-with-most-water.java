class Solution {
    public int maxArea(int[] height) 
    {
        
        int left=0,right=height.length-1;
        int max=0,temp=0;
        while(left<right)
        {
            temp=Math.min(height[left],height[right])*(right-left);
            if(temp>max)
                max=temp;
            if(height[left]>height[right])
                right--;
            else if(height[left]<height[right])
                 left++;
            else
            {
                left++;
                right--;
            }
            
        }
        return max;
    }
}