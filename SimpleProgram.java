public class SimpleProgram {
	public static void main (String[] args) {
		SimpleObject obj;
		String choice;
		String msg;

		if (!(args[0].equals(""))) {
			obj = new SimpleObject(args[0]);
		}
		
		else
			obj = new SimpleObject();

		System.out.println(obj);
	}
}
