package collection;

public class Workjam {

	/* xyz() : This method calculates */
	public String xyz() {
		
		try {
			
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		Workjam obj = new Workjam();
		obj.xyz();
		
		
		
		/* destroy the object */
		try {
			obj.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
