class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] amt = new int[amount + 1];

        // -1 means amount cannot currently be formed
        Arrays.fill(amt, -1);

        // Base case
        amt[0] = 0;

        for (int coin : coins) {

            for (int j = coin; j <= amount; j++) {

                if (amt[j - coin] != -1) {

                    if (amt[j] == -1) {
                        amt[j] = amt[j - coin] + 1;
                    } else {
                        amt[j] = Math.min(
                            amt[j],
                            amt[j - coin] + 1
                        );
                    }
                }
            }
        }

        return amt[amount];
    }
}