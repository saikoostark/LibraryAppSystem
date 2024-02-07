package Models;

public class Admin {

	private int ID;
	private String name;

	public Admin(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
