class Solution {
    public int search(int arr[], int x) {
        // code here
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==x){
                
                return i;
            }
        }      
         return -1;  
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna