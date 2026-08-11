class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        String s = "123456789", current = "";
        int temp = low, lengthOfCurrent = 0, num;
        while (temp != 0) {
            lengthOfCurrent++;
            temp /= 10;
        }
        int start = 0;
        int end = start + lengthOfCurrent;
        do {
            if (lengthOfCurrent == 10) {
                ans.add(0);
                break;
            }
            current = s.substring(start, end);
            num = Integer.valueOf(current);
            if (num >= low) {
                ans.add(num);
            }
            if (end == s.length()) {
                start = 0;
                lengthOfCurrent++;
                end = start + lengthOfCurrent;
            } else {
                start++;
                end++;
            }
        } while (num <= high);
        ans.remove(ans.getLast());
        return ans;
    }
}