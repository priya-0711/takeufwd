package org.example.takeufwd.revisionsecond;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewQues {
    public static void main(String[] args) {
        // Find longest word and index
        String[]  s = new String[] {"Happy", "birthday", "to", "you"};
        //java 8 for longest string
   //     System.out.println(Arrays.stream(s).reduce( (s1,s2) -> (s1.length() > s2.length()) ? s1 : s2).get());

        int index=-1; String longest="";
       for(int i=0;i<s.length;i++) {
           if(s[i].length()>longest.length()) {
               longest = s[i];
               index = i;
           }
       }
        System.out.println(longest+" "+index);

     //   Sort by element length
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(3, 1, 2, 6),
                Arrays.asList(6),
                Arrays.asList(9, 3, 7),
                Arrays.asList(2, 1, 6, 9, 7),
                Arrays.asList(9, 2),
                Arrays.asList(0)
        );
        System.out.println(list);
        //without using sort() function
        for(int i=0;i<list.size();i++) {
            for(int j =i+1;j<list.size();j++) {
                if(list.get(i).size() > list.get(j).size()) {
                    List<Integer> temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println(list);

        //soln1
        list.sort((a,b)->Integer.compare(a.size(),b.size()));
        //soln3
        list.sort(Comparator.comparingInt(List::size));
        //soln2
        list.sort((a,b )-> a.size()-b.size());

    //    System.out.println(list);

    }
}
