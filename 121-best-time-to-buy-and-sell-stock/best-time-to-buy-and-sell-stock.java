class Solution {
    public int maxProfit(int[] prices)
    {
        int maxprofit=0;
        int buyingprice=Integer.MAX_VALUE;
        int temp=0;

        for(int i=0;i<prices.length;i++)
        {
               if(prices[i]<buyingprice)
               {
                buyingprice=prices[i];
               }

               else if(prices[i]>buyingprice)
               {
                   temp=prices[i]-buyingprice;

                   if(temp>maxprofit)
                   maxprofit=temp;
               }

        }

        return maxprofit;
        
    }
}