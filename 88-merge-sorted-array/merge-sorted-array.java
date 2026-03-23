class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int k=m;
        int ptr1=0;
        int ptr2=0;
        int counter=0;

        int[] arr=new int[k];

        for(int i=0;i<k;i++)
        {
            arr[i]=nums1[i];
        }

        while(ptr1<k && ptr2<nums2.length)
        {
            if(arr[ptr1]<nums2[ptr2])
            {
                nums1[counter++]=arr[ptr1++];
            }

            else if(arr[ptr1]>nums2[ptr2])
            {
                nums1[counter++]=nums2[ptr2++];
            }

            else
            {
                nums1[counter++]=arr[ptr1++];
                nums1[counter++]=nums2[ptr2++];
            }
        }

        while(ptr1<k)
        {
            nums1[counter++]=arr[ptr1++];
        }

        while(ptr2<nums2.length)
        {
            nums1[counter++]=nums2[ptr2++];

        }

        
    }
}