package com.demo.kruti.ds.stack;

import java.util.Stack;

/**
 * Input: n = 5
 * st = {1, 2, 3, 4, 5}
 * Output: 5 4 2 1
 * Explaination: The middle element is 3. If
 * it is deleted and then the values are seen
 * from top, this will be the order.
 */
public class ReverseStack {
  public static void main(String[] ar) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(deleteMid(5, st));
    Stack<Integer> st1 = new Stack<>();
    st1.push(1);
    st1.push(4);
    st1.push(9);
    st1.push(2);
    st1.push(6);
    st1.push(5);
    System.out.println(deleteMid(6, st1));
  }
  static Stack<Integer> deleteMid(int n, Stack<Integer> st) {
    int i = st.size() / 2;
    if (st.size() % 2 == 0) {
      st.remove(i - 1);
    } else {
      st.remove(i);
    }

    Stack<Integer> tempStack = new Stack<>();
    while (!st.isEmpty()) {
      int element = st.pop();
      tempStack.push(element);
    }
    return tempStack;
  }
}
