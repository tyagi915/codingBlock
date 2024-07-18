//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//You can return the answer in any order.

















\
class Solution {
    public int[] twoSum(int[] arr, int target) {
        int low =0;
        int high = arr.length-1;
        int res []=new int[2];
         HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
            for(int i=0;i<arr.length;i++){
                if(hm.containsKey(target-arr[i])){
                    res[0]= hm.get(target-arr[i]);
                    res[1] = i;
                    break;
                }else{
                    hm.put(arr[i],i);
                }
            }
            return res;
        
    }
}

//link:https://leetcode.com/problems/two-sum/description/
