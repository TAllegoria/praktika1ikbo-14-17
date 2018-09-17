package author;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}
	
	public String toString() {
		if ((this.gender == 'm') || (this.gender == 'M') || (this.gender == 'f') || (this.gender == 'F')) {
			return this.name + " (" + this.gender + ") at " + this.email;
		} else {
			return this.name + " (u) at " + this.email;
		}
	}
}
