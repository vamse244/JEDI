package com.vamsi.StackAndQueues;

import java.util.Scanner;
import java.util.Stack;


//https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
public class MaximumElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();

		Stack<Integer> maxStack = new Stack<Integer>();
		int noOfTestCases = sc.nextInt();
		for (int testCase = 1; testCase <= noOfTestCases; testCase++) {

			int type = sc.nextInt();

			if (type == 1) {
				int element = sc.nextInt();
				stack.push(element);
				if (maxStack.isEmpty() || element >= maxStack.peek()) {
					maxStack.push(element);

				}

			} else if (type == 2) {

				int poppedValue = stack.pop();

				if (poppedValue == maxStack.peek()) {
					maxStack.pop();
				}

			} else if (type == 3) {
				int element = maxStack.peek();

				System.out.println(element);
			}

		}

		sc.close();
	}
}


