class MyMenu extends Authentication
{   
      BankDataBase bdb=new BankDataBase();
      keypad keypad1=new keypad();
      Scanner sc = new Scanner(System.in);
      boolean y=false;
      public void myMenu(int acno) 
      { 
    	 int t;
       outerprinter.DisplayMessageln("Please enter your choice:");
       outerprinter.DisplayMessageln("1.view my balance");
       outerprinter.DisplayMessageln("2.withdraw cash");
       outerprinter.DisplayMessageln("3.Deposit funds");
       outerprinter.DisplayMessageln("4.Account Details");
       t=keypad1.getInput();
       while(t!=1&&t!=2&&t!=3&&t!=4)
       {
  	  outerprinter.DisplayMessageln("Invalid input!!please try again");
  	  outerprinter.DisplayMessageln("Please enter your choice again:");
  	   outerprinter.DisplayMessageln("1.view my balance");
           outerprinter.DisplayMessageln("2.withdraw cash");
           outerprinter.DisplayMessageln("3.Deposit funds");
           outerprinter.DisplayMessageln("4.Account Details");
	   t=keypad1.getInput();
	   if(t==1||t==2||t==3||t==4)
               break;
       }
       if(t==1||t==2||t==3||t==4)
       {
              if(t==1)
              {
		  ViewMyBalance vmb=new ViewMyBalance()
		  int balance=vmb.getBalance(acno);
	          outerprinter.DisplayMessage("Your Present Balance is:");
	          outerprinter.DisplayIntMessage(balance);
	          outerprinter.DisplayMessageln("(in rupees)");
	      }
              else if(t==2)
	      {
	         while(y==false)
	         {
 	            outerprinter.DisplayMessageln("Enter your phone number for transaction");
	            long phno=sc.nextLong();
                    y=bdb.issearchphno(acno, phno);
 		   if(y==true)
                        break;
                  if(y==false)
	              outerprinter.DisplayMessageln("Invalid phone number!!Try again");
	         }
               	 if(y==true)
	         {
 	           boolean n=false;
 	           while(n==false)
	           {
         	        int otp=(int)(Math.random()*10000);
			outerprinter.DisplayMessageln("otp:"+otp);
	         	 outerprinter.DisplayMessageln("please enter otp for verification");
		          int userotp=keypad1.getInput();
		          if(userotp==otp)
		          {
 		             n=true;
			     WithDrawal wd=new WithDrawal();
			     wd.withdrawing(acno);
		          }
		         else
		         {
		           outerprinter.DisplayMessageln("Invalid otp!!resending otp");
			  }
           	           if(n==true)
		              break;
		       }
		     }
		   }
		    else if(t==3)
		   {
			     while(y==false)
			    {
				      outerprinter.DisplayMessageln("Enter your phone number for transaction");
				      long phno=sc.nextLong();
				      y=bdb.issearchphno(acno, phno);
				      if(y==true)
					         break;
				     if(y==false)
					      outerprinter.DisplayMessageln("Invalid phone number!!Try again");
			    }
			   if(y==true)
			   {
				  boolean n=false;
				  while(n==false)
				  {
					  int otp=(int)(Math.random()*10000);
					  outerprinter.DisplayMessageln("otp:"+otp);
					  outerprinter.DisplayMessageln("please enter otp for verification");
					  int userotp=keypad1.getInput();
					  if(userotp==otp)
					  {
						  n=true;
						  DepositSlot ds=new DepositSlot();
						  ds.deposit(acno);
					  }
					  else
					  {
						  outerprinter.DisplayMessageln("Invalid otp!!resending otp");
					  }
				       if(n==true)
						  break;
				  }
		         }
	           }
		  else if(t==4)
		  {
			  Admin a=new Admin();
			  outerprinter.DisplayMessagelninred("Contact Admin for account Details");
			  a.AccountDetails(acno);
		  }
     }
   }
}
