package basic;

/* Karan: Model class for POJO */
public class Model {
	
	private static String name;
	private static int id=0;
	private static String branch;
	
//	public Model(String name, int id, String branch){
//		this.name = name;
//		this.id = id;
//		this.branch = branch;
//	}
//	
	/**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public static void setID(int id) {
		Model.id = id;
	}
	
	/**
	 * @return the name
	 */
	public static int getID() {
		return id;
	}
	/**
	 * @param name the name to set
	 */
	public static void setName(String name) {
		Model.name = name;
	}
	/**
	 * @return the branch
	 */
	public static String getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public static void setBranch(String branch) {
		Model.branch = branch;
	}
	/**
	 * @return the id
	 */
	public static int getId() {
		return id;
	}
	
	
}
