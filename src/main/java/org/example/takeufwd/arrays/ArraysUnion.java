package org.example.takeufwd.arrays;

import java.util.*;

public class ArraysUnion {
    public static void main(String[] args) {
        int[] nums1 = new int[]{3,4,6,7,9,9};
        int[] nums2 = new int[]{1,5,7,8,8};
        arrayUnion(nums1,nums2);
    }
    public static int[] arrayUnion(int[]nums1,int[]nums2) {
        //TC:o(n+m log(n+m))
        /*int[] res = new int[nums1.length + nums2.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            res[nums1.length+i] = nums2[i];
        }

        res = Arrays.stream(res).distinct().sorted().toArray();
        return res;*/

        //using set
        //TC:o(n+m log(n+m))
       /* Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }

        int[] res = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            res[idx++] = num;
        }
        return res;*/

        //2-pointer approach
        //TC: o(n+m)--better
        int i=0,j=0;
        List<Integer> list  = new ArrayList<>();

        while(i<nums1.length && j<nums2.length) {
            if (nums1[i] <= nums2[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
            } else {
                if (list.size()==0 || list.get(list.size() - 1) != nums2[j]) {
                    list.add(nums2[j]);
                }
                j++;
            }
        }

        while(i<nums1.length){
            if(list.get(list.size()-1)!=nums1[i]) {
                list.add(nums1[i]);
            }
            i++;
        }

        while(j<nums2.length){
            if(list.get(list.size()-1)!=nums1[j]) {
                list.add(nums2[j]);
            }
            j++;
        }
        System.out.println(list);
        return null;
    }
}
