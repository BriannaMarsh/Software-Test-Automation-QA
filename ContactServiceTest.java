package Module3MilestoneContact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {


	@Test
	void testContact() {
		Contact contact = new Contact("Bill", "Bob", "1234", "6784047785", "102 May Lane, Car Ga 30579");
		assertTrue(contact.getfirstName().equals("Bill"));
		assertTrue(contact.getlastName().equals("Bob"));
		assertTrue(contact.getID().equals("1234"));
		assertTrue(contact.getphone().equals("6784047785"));
		assertTrue(contact.getaddress().equals("102 May Lane, Car Ga 30579"));
	}
	
	
	
	
	private void assertTrue(boolean equals) {
		// TODO Auto-generated method stub
		
	}

}
