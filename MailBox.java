class MailBox{
	private int mailboxNumber;
	private String ownerName;
	private boolean mailDelivered;
	public static int totalNumberOfMailboxes;

	public MailBox(){
		totalNumberOfMailboxes++;

	}

	public MailBox(int theNumber, String theOwner){
		mailboxNumber = theNumber;
		ownerName = theOwner;
		totalNumberOfMailboxes++;

	}

	public int getMailboxNumber(){
		return mailboxNumber;
	}

	public void setMailboxNumber(int someNumber){
		mailboxNumber = someNumber;
	}

	public String getOwnerName(){
		return ownerName;
	}

	public void setOwnerName(String someName){
		ownerName = someName;
	}

	public boolean getMailDelivered(){
		return mailDelivered;
	}
	public void setMailDelivered(){
		mailDelivered = true;
	}

}//end class MailBox