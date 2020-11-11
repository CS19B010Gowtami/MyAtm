class GUI implements ActionListener
{
	public  JLabel userLabel;
	public JTextField userText;
	public JLabel passwordLabel;
	public JPasswordField passwordText;
	public  JLabel success;
	public JButton button;
	public JFrame frame;
	public int acno1,pinno1;
	public void LoginGUI()
	{
		  JPanel panel=new JPanel();
		  frame=new JFrame();
		   frame.setSize(350,200);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.add(panel);
		   panel.setLayout(null);
		   
		   userLabel=new JLabel("AccountNo.");
		   userLabel.setBounds(10,20,80,25);
		   panel.add(userLabel);
		   
		   userText=new JTextField(20);
		   userText.setBounds(100,20,165,25);
		   panel.add(userText);
		   
		   passwordLabel=new JLabel("Pin");
		   passwordLabel.setBounds(10,50,80,25);
		   panel.add(passwordLabel);
		   
		   passwordText=new JPasswordField(20);
		   passwordText.setBounds(100,50,165,25);
		   panel.add(passwordText);
		   
		   button=new JButton("Enter");
		   button.setBounds(10,80,80,25);
		   button.addActionListener(this);
		   panel.add(button);
		   
		   success =new JLabel("");
		   success.setBounds(10,110,300,25);
		   panel.add(success);
		   
		   frame.setVisible(true);
	    }
		@Override
		public  void actionPerformed(ActionEvent e)
		{
			  Authentication aut=new Authentication();
			  String sacno=userText.getText();
			  String spinno=passwordText.getText(); 
			  acno1=Integer.parseInt(sacno);
			  pinno1=Integer.parseInt(spinno);
		     if(e.getSource()==button&&aut.validacno(acno1)&&aut.validpinno(acno1,pinno1))
		     {
		    	 frame.dispose();
		    	 outerprinter.DisplayMessagelninred("Login Successful");
		    	 MyAtm.setacno(acno1);
		    	 success.setText("Login Successful");
		     }
			  else
		    	  success.setText("Invalid account no. or password....please try again");
		  }
}
