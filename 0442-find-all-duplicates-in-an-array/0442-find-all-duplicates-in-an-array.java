class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Arrays.sort(nums);
        // ArrayList<Integer> duplicates = new ArrayList<>();

        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         duplicates.add(nums[i]);
        //     }
        // }
        // return duplicates;

        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for(var i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }     

        for(var i:nums){
            if(map.get(i)==2){
                duplicates.add(i);
                map.put(i,0);
            }
        }  
        return duplicates;
    }
}