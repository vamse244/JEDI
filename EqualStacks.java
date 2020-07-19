package com.vamsi.StackAndQueues;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/equal-stacks/problem
public class EqualStacks {

private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] n1N2N3 = scanner.nextLine().split(" ");

		int n1 = Integer.parseInt(n1N2N3[0].trim());

		int n2 = Integer.parseInt(n1N2N3[1].trim());

		int n3 = Integer.parseInt(n1N2N3[2].trim());

		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		Stack<Integer> stack3 = new Stack<>();
		int stack1Sum = 0;
		int stack2Sum = 0;
		int stack3Sum = 0;

		String[] h1Items = scanner.nextLine().split(" ");

		for (int h1Itr = n1 - 1; h1Itr >= 0; h1Itr--) {

			int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
			stack1.push(h1Item);
			stack1Sum = stack1Sum + h1Item;
		}

		String[] h2Items = scanner.nextLine().split(" ");

		for (int h2Itr = n2 - 1; h2Itr >= 0; h2Itr--) {
			int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
			stack2.push(h2Item);
			stack2Sum = stack2Sum + h2Item;
		}

		String[] h3Items = scanner.nextLine().split(" ");

		for (int h3Itr = n3 - 1; h3Itr >= 0; h3Itr--) {
			int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
			stack3.push(h3Item);
			stack3Sum = stack3Sum + h3Item;
		}

		int minStackLength = FinMin(stack1Sum, stack2Sum, stack3Sum);

		while (stack1Sum != stack2Sum || stack1Sum != stack3Sum) {

			while (stack1Sum > minStackLength) {
				stack1Sum = stack1Sum - stack1.pop();

			}
			minStackLength = FinMin(stack1Sum, stack2Sum, stack3Sum);

			while (stack2Sum > minStackLength) {
				stack2Sum = stack2Sum - stack2.pop();

			}
			minStackLength = FinMin(stack1Sum, stack2Sum, stack3Sum);

			while (stack3Sum > minStackLength) {
				stack3Sum = stack3Sum - stack3.pop();

			}

			minStackLength = FinMin(stack1Sum, stack2Sum, stack3Sum);
		}

		System.out.println(minStackLength);

	}

    private static int FinMin(int stack1Sum, int stack2Sum, int stack3Sum) {
       
        return Math.min(stack1Sum, Math.min(stack2Sum, stack3Sum));

    }
}
