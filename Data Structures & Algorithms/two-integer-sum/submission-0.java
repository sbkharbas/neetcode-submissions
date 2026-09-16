class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> numAndIndexListMap = new HashMap<>();
        int[] answer = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(!numAndIndexListMap.containsKey(Integer.valueOf(nums[i]))){
                numAndIndexListMap.put(nums[i], new ArrayList<>());
            }
            numAndIndexListMap.get(nums[i]).add(i);
        }
        for(int i = 0; i < nums.length; i++){
            if(numAndIndexListMap.get(target - nums[i]) != null)
            for(Integer index : numAndIndexListMap.get(target - nums[i])){
                if(index != i){
                    if(index < i){
                        answer[0] = index;
                        answer[1] = i;
                    }else{
                        answer[0] = i;
                        answer[1] = index;
                    }
                }
            }
        }
        return answer;
    }
}
