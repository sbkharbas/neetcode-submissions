class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complementIndexMap = new HashMap<>();
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(complementIndexMap.get(Integer.valueOf(nums[i])) !=  null){
                answer[0] = complementIndexMap.get(Integer.valueOf(nums[i]));
                answer[1] = i;
            }
            complementIndexMap.put(Integer.valueOf(target - nums[i]), i);
        }
        return answer;
    }
}
