import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class MyAtm
{
     public static void main(String[] args)
      {
    	   GUI gui=new GUI();
	    gui.LoginGUI();
       }
       public static void setacno(int acno1)
        {
    	   int acno=acno1;
            MyMenu obj=new MyMenu();//object of MyClass
    	    int yn = 0;
    	     keypad keypad1=new keypad();
    	     outerprinter.welcome();
    	     do 
    	     {
    	         obj.myMenu(acno);
    	         outerprinter.DisplayMessageln("do you want to exit:");
    	         outerprinter.DisplayMessageln("Choose 1(for yes) or 0(for no)");
    	          yn = keypad1.getInput();
    	      }
    	     while (yn==0);
    	     if(yn==1)
    	     {
    	        outerprinter.end();
    	      }
    	 }
 }
