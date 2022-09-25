import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
	public static Scanner input = new Scanner(System.in);
	public static int choose = 1;
	public static int score = 20;
	public static double total = 0;

	public void question() {
		// header
		System.out.println("\t\t\t\t+===================================+");
		System.out.println("\t\t\t\t           Welcome To Quiz Game      ");
		System.out.println("\t\t\t\t+====================================+");
		System.out.println("\t\t\t\t");
		System.out.println("\t\t\t\t");

		// Using MultiDimensional Array For Questions
		String[][] quizQuestion = {
				{ "1. Who is first president of United State Of America ?", "1.John Adams", "2.George Washington","3.Abraham Lincoln", "4.Franklin D. Roosevelt" },
				{ "2.What is height of Mount Everest?", "1.8848", "2.7848", "3.8088", "4.9000 " },
				{ "3.Which is the longest river of the world?", "1.The River Nile", "2.Yangtze River", "3.Yellow River","4.Amazon River" },
				{ "4.Who is tallest person in the world", "1.John Rogan", "Robert Joe", "3.Robert Wadlow","Sammy ALbert" },
				{"5.Who is shortest person in the world height","1.Chandra Bahadur Dangi","2.Pasang Lama","3.Chu Chu","4.Dave kim"},
				};

		// conditions for quiz
		System.out.println(Arrays.deepToString(quizQuestion[0]));
		System.out.println("Choose Answer: ");
		choose = input.nextInt();
		if (choose == 2) {
			total = total + score;
			System.out.println(".....................................................");
			System.out.println("Correct Answer");
			System.out.println(".....................................................");
		} else {
			System.out.println(".....................................................");
			System.out.println("Wrong Answer");
			System.out.println(".....................................................");
		}
		System.out.println(Arrays.deepToString(quizQuestion[1]));
		System.out.println("Choose Answer: ");
		choose = input.nextInt();
		if (choose == 1) {
			total = total + score;
			System.out.println(".....................................................");
			System.out.println("Correct Answer");
			System.out.println(".....................................................");
		} else {
			System.out.println(".....................................................");
			System.out.println("Wrong Answer");
			System.out.println(".....................................................");
		}
		System.out.println(Arrays.deepToString(quizQuestion[2]));
		System.out.println("Choose Answer: ");
		choose = input.nextInt();
		if (choose == 4) {
			total = total + score;
			System.out.println(".....................................................");
			System.out.println("Correct Answer");
			System.out.println(".....................................................");

		} else {
			System.out.println(".....................................................");
			System.out.println("Wrong Answer");
			System.out.println(".....................................................");

		}

		System.out.println(Arrays.deepToString(quizQuestion[3]));
		System.out.println("Choose Answer: ");
		choose = input.nextInt();
		if (choose == 3) {
			total = total + score;
			System.out.println(".....................................................");
			System.out.println("Correct Answer");
			System.out.println(".....................................................");

		} else {
			System.out.println(".....................................................");
			System.out.println("Wrong Answer");
			System.out.println(".....................................................");

		}
		System.out.println(Arrays.deepToString(quizQuestion[4]));
		System.out.println("Choose Answer: ");
		choose = input.nextInt();
		if (choose == 1) {
			total = total + score;
			System.out.println("You Score " + total);
			System.out.println(".....................................................");
			System.out.println("Correct Answer");
			System.out.println(".....................................................");

		} else {
			System.out.println("You Score " + total);
			System.out.println(".....................................................");
			System.out.println("Wrong Answer");
			System.out.println(".....................................................");

		}
	}
}