class Solution {
    public static int largest(int[] arr) {
        
        int max=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna