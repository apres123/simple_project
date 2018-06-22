import java.util.Scanner;

public class SimpleProgram {
	public static void main (String[] args) {
		SimpleObject obj;
		Scanner scan;
		String choice;
		String msg;

		scan = new Scanner(System.in);
		choice = "e";	//default value
		msg = "";

		System.out.print("Would you like to make a custom message? (y/n) ");
		
		while (!choice.equals("y") && !choice.equals("n")) {
			choice = scan.next();
		}

		if (choice.equals("y")) {
			System.out.println("Wow!\nWow!\nWow!");
			System.out.println("Enter message: ");
			scan.nextLine();
			msg = scan.nextLine();
			obj = new SimpleObject(msg);
		}
		
		else
			obj = new SimpleObject();

		System.out.println(obj);
	}
}
