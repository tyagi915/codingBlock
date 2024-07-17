//Given a 0-indexed integer array nums of length n and an integer target,
// return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
//Input: nums = [-1,1,2,3,1], target = 2
//Output: 3

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int low =0 ;
        int high = nums.length-1;
        int count =0;
         
        while(low < high){
            if(nums[low] + nums[high] == target){
                low++;
                high--;
            }else if(nums[low] + nums[high] > target){
                high--
            }else if(nums[low]+ nums[high] < target){
                count = count + high-low;
            }
        }
        return count;
      
        
    }
}
