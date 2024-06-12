package org.example;

import org.example.leetcodes.MergeSolution;
import org.example.leetcodes.MinimumCommonValue;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        MinimumCommonValue minimumCommonValue=new MinimumCommonValue();
        System.out.println(minimumCommonValue.getCommon(new int[]{1,2,8,12,32,34,43,52,57,62,64,67,71,71,79,81,86,91,93,94}, new int[]{9,11,12,14,19,25,29,31,38,39,41,42,58,63,66,70,71,73,91,91}));
        MergeSolution mergeSolution=new MergeSolution();
        int[] sol=mergeSolution.merge(new int[]{-1,0,0,3,3,3,0,0,0},6,new int[]{1,2,2},3);
        for (int each:sol) {
            System.out.println(each);
        }
    }
}