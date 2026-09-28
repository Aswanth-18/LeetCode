class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int ms1 = m - 1, ms2 = n - 1;

        for (int i = m + n - 1; i >= 0; i--) {
            if (ms2 < 0 || ms1 >= 0 && nums1[ms1] > nums2[ms2]) {
                nums1[i] = nums1[ms1--];
            } else {
                nums1[i] = nums2[ms2--];
            }
        }
    }
}