class Denomination
{
	public void denomination(int amt)
	{
		int r2000=0, r500=0, r100=0, r50=0, r20=0, r10=0, r5=0, r2=0 , r1=0 ,count=0; 
		while(amt >= 2000) 
		 { 
		  r2000 = amt / 2000 ; 
		  amt = amt % 2000;
		  outerprinter.DisplayMessage("2000 Rupees Notes :"+ r2000+"\n") ;
		   break ; 
		 }
		 while(amt >= 500) 
		 { 
		  r500 = amt / 500 ; 
		  amt = amt % 500;
		  outerprinter.DisplayMessage("500 Rupees Notes : "+ r500+"\n") ;
		  break ; 
		 } 
		 while(amt >= 100) 
		 { 
		  r100 = amt / 100 ; 
		  amt = amt % 100;
		  outerprinter.DisplayMessage("100 Rupees Notes : "+ r100+"\n") ;
		  break ; 
		 } 
		 while(amt >= 50) 
		 { 
		  r50 = amt / 50 ;
		  amt = amt % 50; 
		  outerprinter.DisplayMessage("50 Rupees Notes : "+ r50+"\n") ; 
		  break ; 
		 }  
		 while(amt >= 20) 
		 { 
		  r20 = amt / 20 ; 
		  amt = amt % 20;
		  outerprinter.DisplayMessage("20 Rupees Notes : "+ r20+"\n") ; 
		  break ; 
		 }  
		 while(amt >= 10) 
		 { 
		  r10 = amt / 10 ; 
		  amt = amt % 10;
		  outerprinter.DisplayMessage("10 Rupees Notes Or Coin : "+ r10+"\n") ; 
		  break ; 
		 } 
		 while(amt >= 5) 
		 { 
		  r5 = amt / 5 ; 
		  amt = amt % 5;
		  outerprinter.DisplayMessage("5 Rupees Notes Or Coin : "+ r5+"\n") ; 
		  break ; 
		 } 
		 while(amt >= 2) 
		 { 
		  r2 = amt / 2 ; 
		  amt = amt % 2;
		  outerprinter.DisplayMessage("2 Rupees Notes Or Coin : "+ r2+"\n") ; 
		  break ; 
		 } 
		 while(amt >= 1) 
		 { 
		  r1 = amt / 1 ; 
		  amt = amt % 1;
		  outerprinter.DisplayMessage("1 Rupees Note Or Coin : "+ r1+"\n") ; 
		  break ; 
		 }
		 count = r2000 + r500 + r100 + r50 + r20 + r10 + r5 + r2 + r1;   
		 outerprinter.DisplayMessage("Total Number Of Notes You will get : "+ count) ; 
	}
}
