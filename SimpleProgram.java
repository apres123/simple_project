public class SimpleProgram {
	public static void main (String[] args) {
		SimpleObject obj;
		String choice;
		String msg;
		boolean clarg = true;	//true if arg passed in CL line, false if not

		try {
			String test = args[0];
		}

		catch (ArrayIndexOutOfBoundsException e) {
			clarg = false;
		}

		if (clarg) {
			obj = new SimpleObject(args[0]);
		}
		
		else
			obj = new SimpleObject();

		System.out.println(obj);
	}
}
