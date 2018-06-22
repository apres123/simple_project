public class SimpleObject {
	private String message;	//contains SimpleObject's message

	/**
	 * <p>This constructor creates the SimpleObject object with
	 * its default message </p>
	 */
	public SimpleObject() {
		message = "This is the default message";
	}
	
	/**
	 * <p> This constructor creates the SimpleObject object with
	 * its message custom set by the user. </p>
	 *
	 * @param _message Sets the SimpleObject's message
	 */
	public SimpleObject(String msg) {
		message = msg;
	}

	/**
	 * <p> This method allows the user to set their own custom message
	 * for the SimpleObject </p>
	 *
	 * @param msg The message the user would like to set
	 */
	public void setMessage(String msg) {
		message = msg;
	}
	@Override
	public String toString() {
		String printed;
		printed = "Your SimpleObject contains the following message:"
			+ "\n" + message;
		return printed;
	}
}
