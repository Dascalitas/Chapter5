package homeworkChapter5;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int ID;
		double price = 0;
		int quant = 0;
		double total = 0;

		System.out.printf("%s%n   %s%n   %s%n",

				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> D then press Enter", "On Windows type <Ctrl> Z then press Enter");

		while (input.hasNext()) {

			ID = input.nextInt();

			switch (ID) {
			case 1:
				price = 2.98;
				break;
			case 2:
				price = 4.50;
				break;
			case 3:
				price = 9.98;
				break;
			case 4:
				price = 4.49;
				break;
			case 5:
				price = 6.87;
				break;
			default:
				System.out.println("you enter wrong ID");
				continue;
			}

			System.out.println("enter quatity of product:");
			quant = input.nextInt();
			System.out.println("Enter the ID of product. (1 to 5)");
			total += price * quant;
		}
		System.out.printf("in total, you paid %.2f%n $", total);
	}
}

//5.17	(Calculating Sales) An online retailer sells five products whose retail prices are as follows:
//Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
//Write an application that reads a series of pairs of numbers as follows:
//a) product number
//b) quantity sold
//Your program should use a switch statement to determine the retail price for each product. It
//should calculate and display the total retail value of all products sold. Use a sentinel-controlled
//loop to determine when the program should stop looping and display the final results.