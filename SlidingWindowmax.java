public class SlidingWindowmax {
    
}class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || k<=0) return new int[0];
        int n = nums.length;
        int[] res=new int[n-k+1];
        int resi=0;


        Deque<Integer> q = new ArrayDeque<>();
        for(int i =0 ; i<n ; i++){
            while(!q.isEmpty() && q.peek()<i-k+1) q.remove();
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]) q.removeLast();
            q.offer(i);
            if(i>=k-1) res[resi++]=nums[q.peek()];
        }
        return res;
        
    }
}
