public class SimpleProgram {
	public static void main (String[] args) {
		SimpleObject obj;
		String choice;
		String msg;

		obj = new SimpleObject();

		choice = "e";	//default value
		msg = "Wow! This message is so custom";

		obj.setMessage(msg);

		System.out.println(obj);
	}
}
