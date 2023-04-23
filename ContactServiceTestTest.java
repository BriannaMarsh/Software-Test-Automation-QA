package Module3MilestoneContact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTestTest {

	@Test
	void testContact() {
		Contact contact = new Contact();
		assertTrue(contact.getfirstName().equals("nothing wriiten"));
		assertTrue(contact.getfirstName().equals("nothing written"));
	}

}
