package com.Dania.Problems;
//Given an array of integers nums, return the number of good pairs.

//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
public class Four {
    public int numIdenticalPairs(int[] nums)
    {
            int size=nums.length;
            int tem;
            int count=0;
            for (int i = 0; i <size;i++ )
            {
                tem=nums[i];
                for (int j = i+1; j <size ;j++ )
                {
                    if(tem==nums[j])
                    {

                        count ++;


                    }
                }
            }
            return count;
        }


}
