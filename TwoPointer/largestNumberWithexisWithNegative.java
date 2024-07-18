//Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.

//Return the positive integer k. If there is no such integer, return -1.

Input: nums = [-1,2,-3,3]
Output: 3
Explanation: 3 is the only valid k we can find in the array.

//two pointer approch

   int low =0;
   int high = nums.length()-1;
    while(low < high){
        if(-nums[low] == nums[high]){
            return nums[high];
        }
        if(-nums[i]>nums[high]){
            low++;
        }else{
            high--
        }
    }

    //nlogn


    //using hashset
    class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hm = new HashSet<Integer>();
        int max = -1;
        for(int i=0; i< nums.length;i++){
            if(hm.contains(-1* nums[i])){
                 if(max < Math.abs(nums[i])){
                    max = Math.abs(nums[i]);
                 }
            }
            hm.add(nums[i]);
        }
          return max;
    }

}

//o(n)
