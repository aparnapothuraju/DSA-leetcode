class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
        int length=0,maxlength=0;
        int ptr1=0,ptr2=0;
        if(s.length()==1)
            return 1;
        while(ptr1<s.length())
        {
            if(!hs.containsKey(s.charAt(ptr1)))
            {
                hs.put(s.charAt(ptr1),ptr1);
                length++;
            }
            else
            {
                int index=hs.get(s.charAt(ptr1));
                if(index<ptr2)
                {
                    //System.out.println("hello");
                    hs.put(s.charAt(ptr1),ptr1);
                    length++;
                }
                else
                {
                if(length>maxlength)
                {
                maxlength=length;
                    
                }
                ptr2=index+1;
                length=ptr1-ptr2+1;
                    hs.put(s.charAt(ptr1),ptr1);
                }
            }
            ptr1++;
        }
        //System.out.println(maxlength);
       return maxlength<length?length:maxlength;
    }
}