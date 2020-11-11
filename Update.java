class Update
{
	public static void updateCSV(String filepath,String acno1,String newBalance)
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
				if(acno!=acno1)
				{
				    pw.println(acno+","+pinno+","+balance+","+phno);
				}
				else 
				{
					pw.println(acno+","+pinno+","+newBalance+","+phno);
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
}
