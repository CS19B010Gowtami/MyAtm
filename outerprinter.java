class outerprinter
{
     public static void DisplayIntMessageinred(int message)
     {
	System.err.print(message);
     }
    public static void DisplayMessageln(String message)
    {
		System.out.println(message);
     }
     public static void DisplayMessagelninred(String message)
     {
		System.err.println(message);
     }
     public static void DisplayMessage(String message)
     {
		System.out.print(message);
      }
      public static void DisplayIntMessage(int message)
     {
		System.out.print(message);
      }
       public static void welcome()
	{
		System.out.println("Welcome to our Bank");
	}
	public static void end()
	{
		System.out.println("Thanks for using our Bank!!");
		System.out.println("Sorry for any inconvineance from our side");
	}
	public void displayamount(double amount)
	{
		System.out.println(amount +"rs");
	}
}
