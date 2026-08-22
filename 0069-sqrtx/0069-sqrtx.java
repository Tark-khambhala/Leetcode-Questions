class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int i = 1;
        while ((long) i * i < x) {
            i++;
        }
        if ((long) i * i == x) {
            return i;
        }
        return --i;
    }
}