package Module3MilestoneContact;

public class Contact {
	// 1.contact id string < 10 (not longer than)
		// not null not updatable
	
	// 2.(DONE)firstName string field < 10
		// not null   
	// (DONE)lastName string < 10
		//not null
	
	// 3.phone string == exactly 10 digits
		// not null
	// 4.address < 30 characters
		//not null
	
	public String ID;
	public String firstName;
	public String lastName;
	public String phone;
	public String address;
	
	public Contact(String firstName,String lastName, String ID, String phone, String address) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
	    }
		if(ID == null || ID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(phone == null || phone.length()!=10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
		this.phone = phone;
		this.address = address;
  }
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getID() {
		return ID;
	}
	public String getphone() {
		return phone;
	}
	public String getaddress() {
		return address;
	}
	
	
	
	}
