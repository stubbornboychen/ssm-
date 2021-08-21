package com.stubbornboy.tests.structure;

import java.util.Stack;

public class StackToQueue<T> {

    private Stack<T> in;

    private Stack<T> out;

    public StackToQueue() {
        this.in = new Stack<>();
        this.out = new Stack<>();
    }

    public void push(T t) {
        if (in == null) {
           in = new Stack<>();
        }
        in.push(t);
    }

    public int pop() {
        if (in == null) {
            throw new RuntimeException();
        }
        if (out == null) {
            out = new Stack<T>();
        }
        for (int i = in.size(); i > 0; i--) {
            T t = in.pop();
            out.push(t);
        }
        System.out.println(in);
        System.out.println(out);
        return 1;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        StackToQueue stackToQueue = new StackToQueue();
        stackToQueue.push(6);
        stackToQueue.pop();
    }

    public Stack<T> getIn() {
        return in;
    }

    public void setIn(Stack<T> in) {
        this.in = in;
    }

    public Stack<T> getOut() {
        return out;
    }

    public void setOut(Stack<T> out) {
        this.out = out;
    }
}
