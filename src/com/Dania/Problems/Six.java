package com.Dania.Problems;
//Given an integer array nums and an integer k,
// return the number of pairs (i, j)
// where i < j such that |nums[i] - nums[j]|
public class Six
{
    public int countKDifference(int[] nums, int k)
    {
        int count=0;
        int v;
        for (int i = 0; i <nums.length ;i++) {
            v= nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(v-nums[j]==k)
                {
                    count++;
                }

            }



        }
        return count;
    }
}
