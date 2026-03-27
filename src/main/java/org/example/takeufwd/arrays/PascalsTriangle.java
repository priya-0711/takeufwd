package org.example.takeufwd.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        pascalTriangle(5);
    }
    public static void pascalTriangle(int numRows) {

        List<List<Long>> triangle = new ArrayList<>();

        for(int i=0;i< numRows;i++) {
            List<Long> row = new ArrayList<>();
            long val = 1;
            row.add(val);

            for (int k = 1; k <= i; k++) {
                val = val * (i - k + 1) / k;
                row.add(val);
            }
            triangle.add(row);
        }
        System.out.println(triangle);
    }
}
