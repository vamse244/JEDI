package com.vamsi.StackAndQueues;

import java.util.Scanner;
import java.util.Stack;
//https://www.hackerrank.com/challenges/largest-rectangle/problem
public class LargestRectangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int noOfElements = in.nextInt();
		int[] heightsArray = new int[noOfElements + 1];
		for (int index = 0; index < noOfElements; index++) {
			heightsArray[index] = in.nextInt();
		}

		long maxArea = 0;
		Stack<Integer> stackElemets = new Stack<Integer>();
		for (int i = 0; i < heightsArray.length; i++) {
			while (!stackElemets.empty() && heightsArray[i] <= heightsArray[stackElemets.peek()]) {
				int index = stackElemets.pop();
				long area = 0l;
				if (stackElemets.empty()) {
					area = (long) heightsArray[index] * (i);
				} else {
					area = (long) heightsArray[index] * (i - (stackElemets.peek() + 1));
				}

				maxArea = Math.max(maxArea, area);
			}
			stackElemets.push(i);
		}
		System.out.println(maxArea);

		in.close();
	}
}