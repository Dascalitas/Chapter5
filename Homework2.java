
package homeworkChapter5;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] list = new int[5];
		list[0] = input.nextInt();
		list[1] = input.nextInt();
		list[2] = input.nextInt();
		list[3] = input.nextInt();
		list[4] = input.nextInt();

		for (int number : list) {
			if (number > 30)
				number = 30;
			else if (number < 1)
				number = 1;
			for (int score = 0; score < number; score++)
				System.out.print("*");
			System.out.println();
		}

	}

}


//5.16	(Bar Chart Printing Program) One interesting application of computers is to display
//graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//number that’s read, your program should display the same number of adjacent asterisks. For example, 
//if your program reads the number 7, it should display *******. Display the bars of asterisks after
//you read all five numbers.