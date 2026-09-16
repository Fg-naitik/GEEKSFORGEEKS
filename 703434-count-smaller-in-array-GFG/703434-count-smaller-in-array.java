
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<=x){
                count++;
            }
        
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna