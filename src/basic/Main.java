package basic;

/* Karan: Main class for the class*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		/* Karan: Setting all parameters */
		
		Model.setName("Karan");
		Model.setBranch("Software Engineering");
		Model.setID(27731671);
		
		/* Karan: Retreive information */
		
		System.out.println("Name: " +Model.getName());
		System.out.println("ID: " +Model.getID());
		System.out.println("Branch: " +Model.getBranch());
				
	}

}
