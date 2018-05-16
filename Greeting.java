import java.util.Scanner;

public class Greeting {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// program code
		System.out.print("What is your name? ");
		String name = reader.nextLine(); // Reads a line of input from the user and assigns it
										 //     to the variable called name
		System.out.println("Hi, " + name);
	}
}
