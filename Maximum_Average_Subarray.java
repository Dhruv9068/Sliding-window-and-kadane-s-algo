//
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int Wsum=0 , Msum= Integer.MIN_VALUE;
        for(int i =0; i<k;i++){
            Wsum+=nums[i];
        }
        Msum= Wsum;
        for (int i =k; i<nums.length;i++){
            Wsum = Wsum -nums[i-k]+ nums[i];
            Msum = Math.max(Msum,Wsum);
        }

        return  (double) Msum / k;
    }
}
