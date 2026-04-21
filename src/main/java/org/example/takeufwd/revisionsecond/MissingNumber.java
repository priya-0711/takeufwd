package org.example.takeufwd.revisionsecond;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,7,8};
        int n = nums.length+1; //7
      //sum of n natural nos  (1 to n)
        // this approach will work only if array is of range [1-n]
        // it will not work if array contains 0 as an element

        int TOTAL_SUM = n * (n+1) / 2;  //28
        int sum=0;
       for(int i=0;i<nums.length;i++) {    //1 to n-1
            sum = sum+nums[i];  // 22
        }
       /* for(int nu :nums) {
            sum+=nu;
        }*/
        System.out.println(TOTAL_SUM);
        System.out.println(sum);
        System.out.println(TOTAL_SUM-sum); //6


       /* int[] numss = new int[]{8, 2, 4, 5, 3, 7, 1,0};
        int n1 = numss.length; //8
         int summ =0;
        int TOTAL_SUMM = n1* (n1+1) / 2; //36
        for(int i=0;i<numss.length;i++) {
            summ = summ+numss[i];  // 30
        }
        System.out.println(TOTAL_SUMM-summ); //6
*/

    }
}
