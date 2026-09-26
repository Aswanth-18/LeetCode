class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int[] ans=new int[nums1.length];
        // Arrays.fill(ans, -1);
        // for(int i=0;i<nums1.length;i++){
        //     boolean isFound=false;
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]) isFound=true;
        //         if(isFound && nums1[i]<nums2[j]){
        //             ans[i]=nums2[j];
        //             break;
        //         }
        //     }
        // }
        // return ans;

        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int ele : nums2){
            while(!st.empty() && st.peek()<ele){
                map.put(st.pop(),ele);
            }
            st.push(ele);
        }
        while(!st.empty()) map.put(st.pop(),-1);

        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
