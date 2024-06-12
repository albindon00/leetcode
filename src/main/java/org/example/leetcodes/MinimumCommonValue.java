package org.example.leetcodes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public  class MinimumCommonValue {
    public int getCommonNotEfficient(int[] nums1, int[] nums2) {
        for(Integer number:nums1){
            for(Integer numberIn:nums2){
                if(number.equals( numberIn)){
                    return number;
                }
            }
        }
        return -1;
    }
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for (Integer number1:nums1){
            set1.add(number1);
        }
        for (Integer number2:nums2){
            set2.add(number2);
        }
        set1.retainAll(set2);
        if(set1.isEmpty()){
            return -1;
        }else {
            return Collections.min(set1);
        }
    }
}
