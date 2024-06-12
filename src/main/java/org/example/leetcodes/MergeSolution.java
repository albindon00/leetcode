package org.example.leetcodes;

import java.util.*;

public class MergeSolution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        Map<Integer,Integer> map1=new TreeMap<>();
        for (int i=0;i<m;i++) {
            if(map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i])+1);
            }else {
                map1.put(nums1[i], 1);
            }
        }
        for (int element:nums2) {
            if(map1.containsKey(element)) {
                map1.put(element, map1.get(element) + 1);
            }
            else {
                map1.put(element, 1);
            }
        }
        for (int i=0;i<n+m;i++){
            nums1[i]=0;
        }
        for (int i=0;i<m+n;i++){
            for (Integer element:map1.keySet()) {
                int countKey = map1.get(element);
                for (int j = 1; j <= countKey; j++) {
                    nums1[i] = element;
                    i++;
                    if (j == countKey) {
                        break;
                    }
                }
            }
        }
        return nums1;
    }
}
