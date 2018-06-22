import java.util.Scanner;

public class SimpleObject {
	private String message;	//contains SimpleObject's message
	private Scanner scan;

	/**
	 * <p>This constructor creates the SimpleObject object with
	 * its default message </p>
	 */
	public SimpleObject() {
		message = "This is the default message";
		scan = new Scanner(System.in);
	}
	
	/**
	 * <p> This constructor creates the SimpleObject object with
	 * its message custom set by the user. </p>
	 *
	 * @param _message Sets the SimpleObject's message
	 */
	public SimpleObject(String _message) {
		message = _message;
		scan = new Scanner(System.in);
	}

	/**
	 * <p> This method allows the user to set their own custom message
	 * for the SimpleObject </p>
	 */

	public void setMessage() {
		System.out.print("Type custom message here: ");
		message = scan.next();
		System.out.println("\nYour new message is: " + message);
	}
	@Override
	public String toString() {
		String printed;
		printed = "Your SimpleObject contains the following message:"
			+ "\n" + message;
		return printed;
	}
}
