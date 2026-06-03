class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int i = 0;
        int j = n - 1;
        int k = n - 1;

        while (i <= j) {

            int leftSquare = nums[i] * nums[i];
            int rightSquare = nums[j] * nums[j];

            if (leftSquare > rightSquare) {
                result[k] = leftSquare;
                i++;
            } else {
                result[k] = rightSquare;
                j--;
            }

            k--;
        }

        return result;
    }
}
