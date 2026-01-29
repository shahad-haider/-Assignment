package Assignment_2;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment2Solutions {

    // Question 1: Write a function to reverse a string using Stack.
    // فكرة الحل: الـ Stack يعكس الترتيب تلقائياً (Last-In, First-Out).
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    // Question 2: Write a function to sort a stack using only another Stack.
    // فكرة الحل: نستخدم ستك إضافي لترتيب العناصر فيه بشكل تصاعدي.
    public static Stack<Integer> sortStack(Stack<Integer> inputStack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!inputStack.isEmpty()) {
            int current = inputStack.pop();
            // طالما أن العنصر في الستك المؤقت أكبر من العنصر الحالي، نعيده للستك الأصلي
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                inputStack.push(tempStack.pop());
            }
            tempStack.push(current);
        }
        return tempStack;
    }

    // Question 3: Write a function to reverse the order of elements in a queue.
    // فكرة الحل: نستخدم ستك وسيط لعكس العناصر.
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    // Question 5: Write a function to merge two sorted queues into a single sorted queue.
    // فكرة الحل: المقارنة بين رؤوس الطابورين وإضافة الأصغر للطابور المدمج.
    public static Queue<Integer> mergeSortedQueues(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> merged = new LinkedList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                merged.add(q1.poll());
            } else {
                merged.add(q2.poll());
            }
        }
        while (!q1.isEmpty()) merged.add(q1.poll());
        while (!q2.isEmpty()) merged.add(q2.poll());
        return merged;
    }

    // كلاس لتجربة الحلول والتأكد من أنها تعمل بدون أخطاء
    public static void main(String[] args) {
        System.out.println("--- Test Q1: Reverse String ---");
        System.out.println("Reverse 'Java': " + reverseString("Java"));

        System.out.println("\n--- Test Q2: Sort Stack ---");
        Stack<Integer> s = new Stack<>();
        s.push(34); s.push(3); s.push(31); s.push(98);
        System.out.println("Sorted Stack: " + sortStack(s));

        System.out.println("\n--- Test Q3: Reverse Queue ---");
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);

        System.out.println("\n--- Test Q5: Merge Queues ---");
        Queue<Integer> q1 = new LinkedList<>(); q1.add(1); q1.add(3); q1.add(5);
        Queue<Integer> q2 = new LinkedList<>(); q2.add(2); q2.add(4); q2.add(6);
        System.out.println("Merged Queue: " + mergeSortedQueues(q1, q2));
    }
}