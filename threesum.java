//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//Notice that the solution set must not contain duplicate triplets.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>>mpp=new HashSet<>();
        List<List<Integer>>list2=new  ArrayList<>();
        Arrays.sort(nums);
         for(int i=0 ;i<nums.length-2;i++){
            int low =i+1;
            int high = nums.length-1;

            while(low<high){
                if(nums[i]+nums[low]+nums[high] ==0){
                ArrayList<Integer>al = new ArrayList<Integer>();
                al.add(nums[i]);
                al.add(nums[low]);
                al.add(nums[high]);
                mpp.add(al);
                low++;
                high--;
                }else
                if(nums[i]+nums[low]+nums[high]>0){
                    high--;
                }else{
                    low++;
                }
            }
         }
         System.out.println(mpp);
         for(List<Integer>ii:mpp){
            list2.add(ii);
         }
         return list2;
        
    }
}

