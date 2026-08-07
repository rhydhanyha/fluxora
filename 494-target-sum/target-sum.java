class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, 0, target);
    }

    int solve(int[] a, int i, int target) {
        if (i == a.length)
            return target == 0 ? 1 : 0;

        return solve(a, i + 1, target - a[i])
             + solve(a, i + 1, target + a[i]);
    }
}