package Module3MilestoneContact;

public class ContactService {
	//add contacts with unique id
	//delete contacts per contact
	//update contact fields per contact ID
	//UPDATEABLE: firstame, lastname, number, address
	
	public String firstName;
	public String lastName;
	public String phone;
	public String address;
	public String uniqueFirstName;
	private Object add;
	private Object delete;
	
	
	public ContactService(String firstName,String lastName, String phone, String address) {
		if(firstName == null) {
			System.out.println("Write Special First Name!!!");
		}
		if(lastName == null) {
			System.out.println("Write Special Last Name!!!!");
		}
		
	
		add = firstName;
		add = lastName;
		add = phone;
		add = address;
		delete = firstName;
		delete = lastName;
		delete = phone;
		delete = address;
		
		
	}
	
	
	public String firstName() {
		return firstName;
	}
	public String lastName() {
		return lastName;
	}
	
	
}
