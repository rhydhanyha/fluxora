import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(int n : nums1) set1.add(n);
        
        Set<Integer> res = new HashSet<>();
        for(int n : nums2) if(set1.contains(n)) res.add(n);
        
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}