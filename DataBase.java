class BankDataBase
{
	String filepath="accounts.csv";
	BankDataBase()
	{
		ArrayList<Accounts>accounts=new ArrayList<Accounts>();
		Accounts acc;
		for(int j=10000;j<100000;j++)
		{
			acc=new Accounts();
			int acno=j;
			acc.setacno(acno);
			if(j<50000)
			   acc.setpinno(j+6567);
			else
				acc.setpinno(j-6567);
			acc.setbalance(j+678);
			String sphno="9"+"1"+Digit.getdigit(1, acno)+"6"+Digit.getdigit(2, acno)+"0"+Digit.getdigit(3, acno)+"8"+Digit.getdigit(4, acno)+"2";
			long phno=Long.parseLong(sphno);
			acc.setphoneno(phno);
			accounts.add(acc);
		}
		FileWriter fw=null;
		try 
		{
			fw=new FileWriter(filepath);
			fw.append("Accountno.,pinno.,balance,phonenumber");
			fw.append("\n");
			for(Accounts a:accounts)
			{
				fw.append(String.valueOf(a.getacno()));
				fw.append(",");
				fw.append(String.valueOf(a.getpinno()));
				fw.append(",");
				fw.append(String.valueOf(a.getbalance()));
				fw.append(",");
				fw.append(String.valueOf(a.getphoneno()));
				fw.append("\n");
			}
		} 
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null,"Records not saved");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.flush();
				fw.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
    int k1=0,p1=0,k2=0,p2=0;
	 private boolean searchpinno(int acno,int pinno)
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
						k2++;
						if(Integer.parseInt(fields[0])==acno&&Integer.parseInt(fields[1])==pinno)
						{
							p2=1;
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
			if(p2==1)
				return true;
			else
				return false;
	 }
	 public boolean issearchpinno(int acno,int pinno)
	 {
			return searchpinno(acno,pinno);
	 }
	 private boolean searchphno(int acno,long phno)
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
						k2++;
						if(Integer.parseInt(fields[0])==acno&&Long.parseLong(fields[3])==phno)
						{
							p2=1;
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
			if(p2==1)
				return true;
			else
				return false;
	 }
	 public boolean issearchphno(int acno,long phno)
	 {
		 return searchphno(acno,phno);
	 }
}
