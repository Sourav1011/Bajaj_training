java.util.*;
class Solution {
    static ArrayList<Integer> arrayleader(int arr[]) {
        // code here
        int maxRight=-1;
        int n=arr.length-1;
        ArrayList<Integer> ls=new ArrayList<>();
        
        for(int i=n; i>=0; i--){
            if(arr[i]>=maxRight){
                maxRight=arr[i];
                ls.add(arr[i]);
            }
        }
        Collections.reverse(ls);
        return ls;
    }
}