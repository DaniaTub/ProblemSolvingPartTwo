package com.Dania.Problems;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

//Given an integer array nums of length n,
// you want to create an array ans of length 2n where ans[i] == nums[i] and
// ans[i + n] == nums[i] for 0 <= i < n
public class One {
    public int[] getConcatenation(int[] nums)
    {
        int size =nums.length;

        int[] ans = new int[2*size];
        int j=0;

        for(int i=0;i<size;i++)
        {
            ans[j] = nums[i];
            j++;
        }

        for(int i=0;i<size;i++)
        {
            ans[j]=nums[i];
            j++;
        }

        return ans;
    }

}
