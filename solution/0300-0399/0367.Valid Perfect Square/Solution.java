class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num;
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (num / mid <= mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left * left == num;
    }
}