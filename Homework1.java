package homeworkChapter5;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int small = input.nextInt();
		int count;

		if (small > 1)
			count = small;
		else
			count = 0;

		for (int x = 1; x < count; x++) {
			int num = input.nextInt();
			if (num < small)
				small = num;
		}

		System.out.println("the smallest number is " + small);
	}
}


//5.11	(Find the Smallest Value) Write an application that finds the smallest of several integers.
//Assume that the first value read specifies the number of values to input from the user.
