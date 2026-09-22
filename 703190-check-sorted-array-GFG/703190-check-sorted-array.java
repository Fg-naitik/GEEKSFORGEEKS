class Solution {
    public boolean isSorted(int[] arr) {
        
        for(int i=0;i<arr.length-1 ;i++){
            if(arr[i]>arr[i+1]){
               return false;
            }
        }
        return true;
        
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna