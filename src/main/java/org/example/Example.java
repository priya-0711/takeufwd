package org.example;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.example.base.i;
@FunctionalInterface
interface interf1 {
    Example absMethod(int i);
}

public class Example  {
    public Example(int i) {
        System.out.println(i);
    }
    public int m1(Integer j) {
        System.out.println("m1 method:"+j);
return j;
    }
    public static void main(String[] args) {

       interf1 iq = Example::new;

       List<Integer> list = Arrays.asList(12,13,134,15);
        System.out.println(list.stream().max((i1,i2) -> -i1.compareTo(i2)).get());
        Integer[] arr = list.stream().toArray(Integer[]::new);

        //study flatmap and reduce functionality
       // and  do some java8 interview ques
        // [[1,1],[2,2],[3,3]] -->flatmap ->[1,1,2,2,3,3]


        }
}




