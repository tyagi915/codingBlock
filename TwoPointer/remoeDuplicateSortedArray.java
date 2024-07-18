class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int k=0;
        int i;
        for( i=1; i<A.length; i++){
            if(A[i]!=A[i-1]){
                A[k++] = A[i-1];
            }
        }
        A[k++] = A[i-1];
        return k;
        
    }
}

//link:
//https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1?page=1&category=two-pointer-algorithm&difficulty=Easy&sortBy=submissions