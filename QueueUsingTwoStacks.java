package com.vamsi.StackAndQueues;

import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/queue-using-two-stacks/problem

public class QueueUsingTwoStacks {

	Stack<Integer> stack1 = new Stack<>();

	Stack<Integer> stack2 = new Stack<>();

	public void enqueue(int ele) {

		stack1.push(ele);

	}

	public int dequeue() {
		exchangeElement();
		return stack2.pop();

	}

	public int peek() {
		exchangeElement();
		int element = stack2.pop();
		stack2.push(element);
		return element;

	}

	private void exchangeElement() {
		if (stack2.empty()) {
			while (!stack1.empty()) {
				stack2.push(stack1.pop());
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int type = sc.nextInt();
			if (type == 1) {
				int x = sc.nextInt();
				queue.enqueue(x);
			} else if (type == 2) {
				queue.dequeue();
			} else if (type == 3) {
				System.out.println(queue.peek());
			}
		}

		sc.close();
	}

}
