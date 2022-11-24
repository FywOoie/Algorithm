package com.zarwOo.leetcode.todos;

import java.util.List;
import java.util.ArrayList;

public class MinStack {
    private int min_;
    private List<Integer> stack_;
    public MinStack() {
        this.min_ = -2147483648;
        this.stack_ = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        if(val < this.min_){
            this.min_ = val;
        }
        stack_.add(val);
    }
    
    public void pop() {
        stack_.remove(stack_.size() - 1);
    }
    
    public int top() {
        return stack_.get(stack_.size() - 1);
    }
    
    public int getMin() {
        return this.min_;
    }
}
