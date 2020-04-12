class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int p=0; p<nums.length; p++){
            int comp = target - nums[p];
            if(m.containsKey(comp)){
                ans[0] = m.get(comp);
                ans[1] = p;
            } else {
                m.put(nums[p], p);
            }
        }
        return ans;
    }
}
