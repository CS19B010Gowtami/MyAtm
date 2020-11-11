class Accounts
{
	private int acno;
	private int pinno;
	private int balance;
	private long phno;
	public void setacno(int acno)
	{
		this.acno=acno;
	}
	public void setpinno(int pinno)
	{
		this.pinno=pinno;
	}
	public void setbalance(int balance)
	{
		this.balance=balance;
	}
	public void setphoneno(long phno)
	{
		this.phno=phno;
	}
        public int getacno()
	{
		return acno;
	}
	public int getpinno()
	{
		return pinno;
	}
	public int getbalance()
	{
		return balance;
	}
	public long getphoneno()
	{
		return phno;
	}
}
