/**
 * @author Mark Baldwin
 *
 */
public class Friends {
	public Friends(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public Friends() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	/*@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}*/

}
