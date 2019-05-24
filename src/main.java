
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int userAge = input.nextInt();
		
		int legalVotingAge = 18;
		if (userAge >= legalVotingAge) {
			System.out.println("Hooray, you can vote!");}
		else {
			System.out.println("Sorry, you are too young.");
			
		}
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input1.nextLine();
		System.out.println("Hi," + name);
		}
		
	}

			
		


