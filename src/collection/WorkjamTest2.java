package collection;

public class WorkjamTest2 {

	/* xyz() : This method calculates  */
	public String xyz() {

		try {

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return null;
	}

	public static void main(String[] args) {

		WorkjamTest2 obj = new WorkjamTest2();

		/* destroy the object */
		try {
			obj.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
