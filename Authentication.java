class Authentication  extends GUI
{
	protected int acno;
	protected int pinno,userpin;
	boolean yn,n=false;
	BankDataBase bdb=new BankDataBase();
	keypad keypad1=new keypad();
       public boolean validacno(int acno)
       {
           this.acno=acno;
	   if(Digit.size(acno)==5)
	   {
		return true;
	    }
	    return false;
	}
       public boolean validpinno(int acno,int pinno)
       {
    	 yn=bdb.issearchpinno(acno,pinno);
	 if(yn==true)
	  {
              return true;
	  }
	   return false;
      }
}
