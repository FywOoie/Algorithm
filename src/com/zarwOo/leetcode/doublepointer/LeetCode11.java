package com.zarwOo.leetcode.doublepointer;//给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。

//找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

//返回容器可以储存的最大水量。

public class LeetCode11 {
    public int maxArea(int[] height) {
        // 双指针法，前指针在头，尾指针在尾
        int front = 0;
        int back = height.length - 1;
        int res = 0;
        while(front < back){
            res = Math.max(res, (back - front) * Math.min(height[front], height[back])); // 更新最大面积
            // 当前指针对应值小于后指针对应值，移动前指针，反之亦然
            if(height[front] <= height[back]){
                front++;
            }else{
                back--;
            }
        }
        return res;
    }

    public static void main(String[] args){
        LeetCode11 solution = new LeetCode11();
        int[] heightTest = {1,8,6,2,5,4,8,3,7}; // 测试用例
        System.out.println(solution.maxArea(heightTest));
    }
}
