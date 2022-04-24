package com.Dania.Problems;

import java.util.Arrays;

//A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
//
//You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
//
//Return the number of indices where heights[i] != expected[i].
public class Nine
{
    public int heightChecker(int[] heights)
    {
        int[] newArr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(newArr);
        int diffNumCount = 0;
        for(int i = 0; i < heights.length / 2; i++){
            if(heights[i] != newArr[i]){
                diffNumCount++;
            }

            if(heights[heights.length -1 -i] != newArr[heights.length -1 -i]){
                diffNumCount++;
            }
        }

        if(heights.length % 2 == 1){
            diffNumCount += heights[heights.length / 2] != newArr[heights.length / 2]?1:0;
        }
        return diffNumCount;
    }


}
