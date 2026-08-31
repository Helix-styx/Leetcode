class Solution {
    public int distMoney(int money, int children) {

        if (money < children) return -1;

        money -= children;

        int eight = Math.min(children, money / 7);
        money -= eight * 7;
        children -= eight;

        if (children == 0) {
            return money == 0 ? eight : eight - 1;
        }

        if (children == 1 && money == 3) {
            return eight - 1;
        }

        return eight;
    }
}