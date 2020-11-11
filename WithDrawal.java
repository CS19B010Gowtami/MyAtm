class WithDrawal extends ViewMyBalance
{
	String filepath="accounts.csv";
	Denomination dm=new Denomination();
	keypad keypad1=new keypad();
	private int balance;
	public void withdrawing(int acno)
	{
		balance=getBalance(acno);
		int newBalance;
		outerprinter.DisplayMessage("Enter the amount you want to withdraw or choose 0 for cancellation");
	    int wd=keypad1.getInput();
		if(wd!=0)
		{
			while(balance<wd)
			{
				outerprinter.DisplayMessagelninred("YOU DONT HAVE ENOUGH BALANCE");
				outerprinter.DisplayMessageln("Please enter Smaller amounts");
				 wd=keypad1.getInput();
				if(balance>=wd)
			         break;
			}
			if(wd<=balance)
			{
				if(wd!=0)
				{
					newBalance=balance-wd;
					outerprinter.DisplayMessageln("Please take your amount:");
					dm.denomination(wd);
					outerprinter.DisplayMessage("\n Your present Balance is ");
					outerprinter.DisplayIntMessage(newBalance);
					outerprinter.DisplayMessageln("(in Rupees)");
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
		else if(wd<=0)
		 {
			   outerprinter.DisplayMessagelninred("Cancelling your transaction.....");
		  }
	}
}
