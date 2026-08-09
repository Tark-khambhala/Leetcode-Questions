class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n;
        while (true) {
            int product = 1,x=temp;
            while (temp != 0) {
                product *= temp % 10;
                temp /= 10;
            }
            temp = x;
            if (product % t == 0) {
                return temp;
            }
            temp++;
        }
    }
}