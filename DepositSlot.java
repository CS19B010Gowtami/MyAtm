class DepositSlot extends ViewMyBalance
{
	public  void deposit(int acno)
	{
	   String filepath="accounts.csv";
           keypad keypad1=new keypad();
           int balance=getBalance(acno);
            outerprinter.DisplayMessageln("Enter the amount to deposit  or choose 0 for cancellation");
	    int dp=keypad1.getInput();
	    int newBalance=balance+dp;
	    if(dp!=0)
    	    {
    	       outerprinter.DisplayMessageln("Please send the envelop....");
    	       outerprinter.DisplayMessage("your present balance is:");
    	       outerprinter.DisplayIntMessage(newBalance);
    	       outerprinter.DisplayMessageln("(in rupees)");
    	       String sacno=String.valueOf(acno);
    	       String snewBalance=String.valueOf(newBalance);
    	       Update.updateCSV(filepath, sacno, snewBalance);
           }
          else
    	  {
    	    outerprinter.DisplayMessagelninred("Cancelling your transaction.....");
    	  }
	}
}
