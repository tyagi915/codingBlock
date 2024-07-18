//Given an array Arr consisting of N distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

// Input: 
// N = 4 
// arr[] = {1, 5, 3, 2}
// Output: 2 
// Explanation: There are 2 triplets:
//  1 + 2 = 3 and 3 +2 = 5
class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count =0;
        for(int i=n-1;i>=0;i--){
            int j=0;
            int k=i-1;
            while(j<k){
                
                if(arr[j] + arr[k] == arr[i]){
                    count++;
                    k--;
                }else
                if(arr[j]+arr[k] > arr[i]){
                    k--;
                }else{
                    j++;
                }
                
            }
        }
        return count;
    }
}