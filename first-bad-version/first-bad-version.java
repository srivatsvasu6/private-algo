/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        if(n == 1)
            return 1;
        
        int first = 0, last= n, mid = 0;
        boolean found = false;
        
        while(first <= last){
            
            mid = first + (last - first)/2;
            
            if(isBadVersion(mid)){
                
                last = mid -1;
           }else{
                
                first = mid +1;
            }
        }
        return first;
        
    }
}