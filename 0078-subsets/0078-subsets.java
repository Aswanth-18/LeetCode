class Solution {

    private static void backTrack(List<List<Integer>> res,List<Integer> curr , int[] nums , int start){
        res.add(new ArrayList<>(curr));

        for(int i = start; i<nums.length;i++){
            curr.add(nums[i]);
            backTrack(res,curr,nums,i+1);
            curr.remove(curr.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res,new ArrayList<>(),nums,0);
        return res;
    }
}