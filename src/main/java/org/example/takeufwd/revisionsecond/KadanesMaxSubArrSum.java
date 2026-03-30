public class KadanesMaxSubArrSum{
  public static void main(String[]args) {
    /*
 given array,find largest or max subarray with largest sum for the elements of subarray
 input: nums = [2,3,5,-2,7,4]
output: 15(2+3+5+(-2)+7) for index 0 to 4
    */
    int[] nums = new int[]{2,3,5,-2,7,4};
    int sum =0,maxL=0;
    for(int i=0;i<nums.length();i++) {
     sum = sum +nums[i];
      maxL = Math.max(maxL,sum);
    }
    System.out.println(maxL);
  }
}
