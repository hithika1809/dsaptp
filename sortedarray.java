class Solution {
    public boolean check(int[] nums) {
        int c=0;
        int n = nums.length;

        for(int i=0;i<n;++i){
            c += (nums[i] > nums[(i + 1) % n]) ? 1 : 0;

        }return c<=1;
    }
}
