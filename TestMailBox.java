public class TestMailBox{
	public static void main (String[] args){

		//Create 3 MailBox objects
		MailBox m1 = new MailBox(123, "Bob");
		MailBox m2 = new MailBox(456, "Patrick");
		MailBox m3 = new MailBox(222, "Sally");

		//Deliver mail to m1
		m1.setMailDelivered();

		//print out mailbox number, owner name, and delivered for each mailbox
		System.out.println("Mailbox #	Owner Name	Delivered");
		System.out.println(m1.getMailboxNumber() + "\t        " + m1.getOwnerName() + "\t        " + m1.getMailDelivered());

		System.out.println(m2.getMailboxNumber() + "\t        " + m2.getOwnerName() + "\t        " + m2.getMailDelivered());
		System.out.println(m3.getMailboxNumber() + "\t        " + m3.getOwnerName() + "\t        " + m3.getMailDelivered());
	}

}//end class TestMailBox