class Solution {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = x;
        int res=0;
        while (left<=right) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                res=mid;
                left = mid + 1;
            }
        }
        
        return res;
    }
}
