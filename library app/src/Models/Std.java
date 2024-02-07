package Models;

public class Std {
	private int ID;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	private int gender;
	private String phone;

	public Std(int ID, String fname, String lname, String email, String pass, int gender,
			String phone) {
		this.ID = ID;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.gender = gender;
		this.phone = phone;
	}

	public int getID() {
		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getGender() {
		return this.gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

};
