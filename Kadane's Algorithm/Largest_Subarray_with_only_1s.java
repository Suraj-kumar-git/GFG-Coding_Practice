// Given a binary a Array arr[] of size n. The array contains only 0 and 1.
//   You can perform the following operation atmost once:
//   Select any subarray from the given array and flip all its elements i.e. change 0 to 1 and 1 to 0.
// After the Operation, find the length of the largest subarray containing all 1s.

// Example 1:
// Input: n=5;
// arr={1,0,1,0,0,1}
// Output: 4
//   Explanation: 
// After applying the flip operation on subarray {0,0} the array becomes {1,0,1,1,1,1}

// Example 2:
// Input: n=9:
// arr ={1,0,0,1,0,0,0,0,1}
// Output: 6
//   Explanation:
// After applying the flip operation on subarray {0,0,0,0} the array becomes {1,0,0,1,1,1,1,1,1}

//        <--   SOLUTION    -->

class Solution {
    public static void main(String[] args) {
        int[] arr ={1,0,0,1,0,0,0,0,1};
        int max_end_here=0,total_zero=0,total1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                total1++;
            }
        }
        System.out.println(total1);
        int i=0;
        for(;i<arr.length-1;i++){
            if(arr[i]==0){
                max_end_here++;
            }
            if(total_zero<max_end_here){
                total_zero=max_end_here;
            }
            if(arr[i+1]==1){
                max_end_here=0;
            }
            
        }
        if(i==arr.length-1 && arr[i]==0){
                total_zero++;
            }
        System.out.println(total_zero);
        System.out.println("Total 1's after replacing is: "+(total1+total_zero));
    }
}
