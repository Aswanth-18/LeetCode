class Solution {
    int cnt=0;
    public int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int len = left.length + right.length;
        int[] sortedArr = new int[len];

        while( i < left.length && j < right.length && k < len ) {
            if( left[i] <= right[j] ) {
                sortedArr[k++] = left[i++] ;
            }
            else sortedArr[k++] = right[j++] ;
        }
        while( i < left.length ) {
            sortedArr[k++] = left[i++] ;
        }
        while( j < right.length ) {
            sortedArr[k++] = right[j++] ;
        }
        return sortedArr;
    }

    public void getCnt(int[] left,int[] right){
        int i=0;
        int j=0;
        int n1 = left.length;
        int n2 = right.length;

        while(i<n1 && j<n2){
            if(left[i] > (long)right[j]*2){
                cnt += left.length-i;
                j++;
            }
            else{
                i++;
            }
        }
    }

    public int[] mergeSort(int[] nums) {
        if (nums.length <= 1)
            return nums;

        int mid = (int) Math.floor(nums.length / 2);
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        getCnt(left,right);
        return merge(left,right);
    }

    public int reversePairs(int[] nums) {
        mergeSort(nums);
        return cnt;
    }
}
