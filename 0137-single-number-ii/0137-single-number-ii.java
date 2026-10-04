class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();

        for(var i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(var i : map.keySet()){
            if(map.get(i)==1){
                return i;
            }
        }
        return 0;
    }
}