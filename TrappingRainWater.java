public class TrappingRainWater {
    class Solution {
    public int trap(int[] height) {
        // step -1 : calculate left max boundary
        int leftmax[] = new int[height.length];
        leftmax[0]=height[0];
        for(int i = 1; i< leftmax.length; i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }

        // step-2 : rightmax boundary
        int rightmax[] = new int[height.length];
        rightmax[rightmax.length-1]=height[height.length-1];
        for(int i =rightmax.length-2 ;i>=0 ; i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        
        //step-3 : loop
        int trapwater = 0;
        for(int i=0 ; i<height.length ; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater+=waterlevel-height[i];
        }
        return trapwater;
    }
}
}
