class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> memo = new HashMap<>();
        return differentWays(nums, 0, target, 0, memo);
    }

    int differentWays(int[] nums, int index, int target, int currentSum, Map<String, Integer> memo){
        if(index == nums.length){
            return target == currentSum ? 1 : 0;
        }
        String key = index + "," + currentSum;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        int ways = differentWays(nums, index+1, target, currentSum-nums[index], memo) + differentWays(nums, index+1, target, currentSum+nums[index], memo);
        memo.put(key, ways);
        return ways;
    }
}