package classes;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Boo {
	private int currentNum = 0;

	public static int computersChoice(int current) {
		for(int i = current + 1; true ; i++) {
			if(isPrime(i) == true) {
				return i;
			}
		}
	}
	
	public static boolean isPrime(int n) {
		for(int i = 2; i < n/2 + 1; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean userCheck(int n, int current) {
		int correctChoice = computersChoice(current);
		//System.out.println(correctChoice);
		if(correctChoice == n) {
			return true;
		}
		return false;

	}
	
	public static void game() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the next Prime Number");
		//System.out.println("Com: 2");
		int current = 0;
		boolean correct = true;
		while(correct) {
			current = computersChoice(current);
			System.out.println("Com: " + current );
			System.out.print("You: ");
			int choice = 0;
			try {
				 choice = input.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Please enter a integer type!");
				System.out.println("You Lose!");
				correct = false;
				return;
			}
			if(userCheck(choice,current) == false) {
				correct = false;
				System.out.println("You Lose!");
			}
			current = choice;
		}
	}
		
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welome to Boo!");
		System.out.println("______________");
		boolean play = true;
		while(play == true) {
			System.out.print("Would you like to play(Y/N): ");
			String choice = kb.nextLine();
			if(choice.equals("Y")) {
				play = true;
				game();
			}
			else if(choice.equals("N")) {
				play = false;
			}
		}
	}
}
