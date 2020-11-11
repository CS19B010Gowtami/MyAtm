class Admin
{
	String adminpass="Admin123";
	public int Changepin(int acno1)
	{
		Authentication aut=new Authentication();
		keypad keypad1=new keypad();
		String filepath="accounts.csv";
		String  sacno1=String.valueOf(acno1);
		int pinno1;
		boolean yn=false;
		do
		{
			outerprinter.DisplayMessageln("Please enter your old pin");
			 pinno1=keypad1.getInput();
			 yn=aut.validpinno(acno1,pinno1);
		}
		while(yn==false);
		if(yn==true)
		{
			String tempFile="temp.csv";
			File oldFile=new File(filepath);
			File newFile=new File(tempFile);
		   try 
			{
			    String acno="";
				String pinno="";
				String balance="";
				String phno="";
				FileWriter fw=new FileWriter(tempFile,true);
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);
				Scanner sc=new Scanner(new File(filepath));
				sc.useDelimiter("[,\n]");
			    while(sc.hasNext())
				{
					acno=sc.next();
					pinno=sc.next();
					balance=sc.next();
					phno=sc.next();
					if(acno==sacno1)
					{
					    pw.println(acno+","+pinno1+","+balance+","+phno);
					}
					else 
					{
						pw.println(acno+","+pinno+","+balance+","+phno);
					}
				}
				sc.close();
				pw.flush();
				pw.close();
			    fw.close();
			    bw.close();
				oldFile.delete();
				File dump=new File(filepath);
				newFile.renameTo(dump);
		     } 
			catch (Exception e) 
			{
				JOptionPane.showMessageDialog(null,"Not updated");
				e.printStackTrace();
			}
		}
		return pinno1;
	}
	public void AccountDetails(int acno)
	{
	    outerprinter.DisplayMessageln("ENTER ADMIN PASSWORD");
		int i=0;
		Scanner sc=new Scanner(System.in);
		String userpass=sc.next();
		while(i<=3&&userpass.equals(adminpass)==false)
		{
			i++;
			outerprinter.DisplayMessageln("you have "+(5-i)+"  tries remaining");
			outerprinter.DisplayMessageln("Please try again");
			userpass=sc.next();
			if(userpass.equals(adminpass)&&i<=3)
			    break;
			else if(i>3)
			{
				outerprinter.DisplayMessageln("Tries exhausted. Contact the main office");
				System.exit(0);
				break;
			}
		}
		if(userpass.equals(adminpass)&&i<=3)
		{
			BufferedReader reader=null;
			String filepath="accounts.csv";
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
							outerprinter.DisplayMessage("Accountno"+"   "+"pinno"+"     "+" Balance"+"   "+" Phoneno"+"\n");
							outerprinter.DisplayMessage(fields[0]+"\t");
							outerprinter.DisplayMessage("  "+fields[1]+"\t ");
							outerprinter.DisplayMessage(fields[2]+"\t");
							outerprinter.DisplayMessage(fields[3]);
							outerprinter.DisplayMessage("\n");
							System.exit(0);
						}
					}
				}
				reader.close();
			}
			catch(Exception e)
			{
				outerprinter.DisplayMessagelninred("Error Found:"+e);
			}
		}
		sc.close();
	}
}
