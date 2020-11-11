class ViewMyBalance extends BankDataBase
{
	String filepath="accounts.csv";
	private int balance;
	public int getBalance(int acno)
	{
	   BufferedReader reader=null;
		try 
		{
		   String line="";
			reader=new BufferedReader(new FileReader(filepath));
			reader.readLine();
		    while((line=reader.readLine())!=null)
			{
			    String[] fields=line.split(",");
				if(fields.length>0)
				{
					if(Integer.parseInt(fields[0])==acno)
					{
						balance=Integer.parseInt(fields[2]);
						break;
					}
				}
			}
			reader.close();
		}
		catch (Exception e) 
		{
		    e.printStackTrace();
		}
	   return (balance);
	}
}
