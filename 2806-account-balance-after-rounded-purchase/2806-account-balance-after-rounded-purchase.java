class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rounded = (int)Math.round(purchaseAmount/10.0)*10;
        return 100-rounded;
    }
}