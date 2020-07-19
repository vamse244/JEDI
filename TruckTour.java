package com.vamsi.StackAndQueues;

import java.io.IOException;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/truck-tour/problem
public class TruckTour {

	static int truckTour(int[][] petrolpumps, int arraySize) {

		int surplus = 0;
		int defficent = 0;

		int startPetrolPump = 0;

		for (int i = 0; i < arraySize; i++) {

			int petrol = petrolpumps[i][0];
			int distance = petrolpumps[i][1];
			surplus = surplus + (petrol - distance);
			if (surplus < 0) {
				startPetrolPump = i + 1;
				defficent = defficent + surplus;
				surplus = 0;
			}

		}

		return surplus + defficent > 0 ? startPetrolPump : -1;

	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int startIndex = 0;
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			int petrol = in.nextInt();
			int distance = in.nextInt();
			sum += petrol - distance;
			if (sum < 0) {
				sum = 0;
				startIndex = i + 1;
			}
		}
		System.out.println(startIndex);
		in.close();
	}
}
