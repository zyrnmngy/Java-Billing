import javax.swing.*; 

public class zz{

	
		public static void main(String [] args)
		{
			
		int shake =0;
		int ulit=0;
		int again=0;
		int zzz=0;
		String flavor = " ";
		int num =0;
		int small =(num * 15);
		int medium =(num * 25);
		int large =(num * 35);
		int xl =(num * 45);
		int zy=0;
		double cash =0;
		double sukli=0;
		String size=" ";
		
		String line = "\n\t\t\t|| ~~~~~~~~~~~~ * ~~~~~~~~~~~~ ||";
		
		String title = "\n\t\t\t\t  SHAKERIEZ";
		
		String line2 = "\n\t\t\t|| ~~~~~~~~~~~~ * ~~~~~~~~~~~~ ||";
		
		do{
			ulit=0;
		try{
			shake=Integer.parseInt(JOptionPane.showInputDialog("\n\t\t\t FLAVORS TO CHOOSE FROM:"
						  +"\n\t\t\t [1] Choco Kisses"
						  +"\n\t\t\t [2] Choco Hot Fudge"
						  +"\n\t\t\t [3] Ube"
						  +"\n\t\t\t [4] Strawberry"
						  +"\n\t\t\t [5] Vanilla"
						  +"\n\t\t\t [6] Mango"
						  +"\n\t\t\t [7] Pandan"
						  +"\n\t\t\t [8] Rocky Road"
						  +"\n\t\t\t [9] Cappuchino"
						  +"\n\t\t\t [10] Double Dutch"
						  +"\n\t\t\t [11] Cookies and Cream"
						  +"\n\t\t\tEnter your chosen flavor: "));
						  
		String line3 = "\n\t\t\t|| ~~~~~~~~~~~~ * ~~~~~~~~~~~~ ||";
			switch(shake){
				case 1:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Choco Kisses");
				flavor = "Choco Kisses";
				break;
				case 2:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Choco Hot Fudge");
				flavor = "Choco Hot Fudge";
				break;
				case 3:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Ube");
				flavor = "Ube";
				break;
				case 4:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Strawberry");
				flavor = "Strawberry";
				break;
				case 5:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Vanilla");
				flavor = "Vanilla";
				break;
				case 6:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Mango");
				flavor = "Manungo";
				break;
				case 7:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Pandan");
				flavor = "Pandan";
				break;
				case 8:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Rocky Road");
				flavor = "Rocky Road";
				break;
				case 9:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Cappuchino");
				flavor = "Cappuchino";
				break;
				case 10:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Double Dutch");
				flavor = "Double Dutch";
				break;
				case 11:
				JOptionPane.showMessageDialog(null,"You have chosen the flavor Cookies and Cream");
				flavor = "Cookies and Cream";
				break;
				default:
				JOptionPane.showMessageDialog(null,"That flavor is not available. Please choose a product among the list.");
				ulit=1;
				break;
				}
				}catch(Exception a){
			JOptionPane.showMessageDialog(null,"Invalid Choice. Please Try Again. \n\t\t\t");
			ulit=1;
		}
			}while(ulit==1);
			do{
				again=0;
				
				size=JOptionPane.showInputDialog(null,"\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45 pesos"
						  +"\n\t\t\t Enter your chosen size: ");
						  
						  if(size.equals("S") || size.equals("s"))
						  {
						  	JOptionPane.showMessageDialog(null,"You have chosen the size SMALL.");
						  	do{
						  		zzz=0;
						  		try{
						  			num=Integer.parseInt(JOptionPane.showInputDialog("\n\t\t\t Enter the quantity: "));
						  			if(num>=1)
									{
										small = (num * 15);
										cash=0;
										sukli=0;
										JOptionPane.showMessageDialog(null,"\n\t\t\t Total Amount: \t\t" + small);
										do{
										try{
										cash=Double.parseDouble(JOptionPane.showInputDialog("\n\t\t\t Cash: \t\t\t: "
																							+"\n\t\t\t Amount to be payed: \t\t" + small));
												zy=0;
												if(cash > small)
												{
													sukli = (cash - small );
													JOptionPane.showMessageDialog(null,"\n\t\t\t Balance:\t\t " +sukli);
														JOptionPane.showMessageDialog(null,"\n\t\t\t>>>>>>>> RECEIPT<<<<<<<<"
																						+"\n\t\t\t YOU HAVE ORDERED : " + "        " +flavor
																						+"\n\t\t\t QTY: " + "        " + num
																						+"\n\t\t\t SIZE:" +         " Small"
																						+"\n\t\t\t Total Amount:" + "        "+ small
																						+"\n\t\t\t Change: " + "        "+ sukli
																						+"\n\t\t\t\t >>>>>>>>>><<<<<<<<<<"
																						+"\n\t\t\t\tTHANK YOU COME AGAIN!!"
																						+ "\n\t\t\t\tSHAKERIEZ SHAKES"
																						+ "\n\t\t\tCONTACT: zdtmanungay@slsu.edu.ph");
																						
												}
												else if(cash == small)
												{
												    JOptionPane.showMessageDialog(null,"\n\t\t\t Balance:\t\t 0");
												    JOptionPane.showMessageDialog(null,"\n\t\t\t>>>>>>>> RECEIPT<<<<<<<<"
																						+"\n\t\t\t YOU HAVE ORDERED : " + "        " +flavor
																						+"\n\t\t\t QTY: " + "        " + num
																						+"\n\t\t\t SIZE:" +         " Small"
																						+"\n\t\t\t Total Amount:" + "        "+ small
																						+"\n\t\t\t Change: " + "        0"
																						+"\n\t\t\t\t >>>>>>>>>><<<<<<<<<<"
																						+"\n\t\t\t\tTHANK YOU COME AGAIN!!"
																						+ "\n\t\t\t\tSHAKERIEZ SHAKES"
																						+ "\n\t\t\tCONTACT: zdtmanungay@slsu.edu.ph");
												}
												else
												{
													JOptionPane.showMessageDialog(null,"\n\t\t\t You have input an insufficient amount." );
													zy=1;
												}
											}catch(Exception z){
												JOptionPane.showMessageDialog(null,"Sorry! You have entered an invalid amount. \n\t\t\t");
												zy=1;
												}
											}while(zy==1);
											
									}
									else {
									zzz=1;
									}
						  		}catch(Exception z){
						  			JOptionPane.showMessageDialog(null,"Invalid Choice. Please Input a Number. \n\t\t\t");
						  			zzz=1;
						  		}
						  }while(zzz==1);
						  }
						  else if(size.equals("M") || size.equals("m"))
						  {
						  	JOptionPane.showMessageDialog(null,"You have chosen the size MEDIUM.");
						  	do{
						  		zzz=0;
						  		try{
						  			num=Integer.parseInt(JOptionPane.showInputDialog("\n\t\t\t Enter the quantity: "));
						  			if(num>=1)
									{
										medium = (num * 25);
										cash=0;
										sukli=0;
										JOptionPane.showMessageDialog(null,"\n\t\t\t Total Amount: \t\t" + medium);
										do{
										try{
										cash=Double.parseDouble(JOptionPane.showInputDialog("\n\t\t\t Cash: \t\t\t: "
																							+"\n\t\t\t Amount to be payed: \t\t" + medium));
												zy=0;
												if(cash > medium)
												{
													sukli = (cash - medium);
													JOptionPane.showMessageDialog(null,"\n\t\t\t Balance:\t\t " +sukli);
													JOptionPane.showMessageDialog(null,"\n\t\t\t>>>>>>>> RECEIPT<<<<<<<<"
																						+"\n\t\t\t YOU HAVE ORDERED : " + "        " +flavor
																						+"\n\t\t\t QTY: " + "        " + num
																						+"\n\t\t\t SIZE:" +         " Medium"
																						+"\n\t\t\t Total Amount:" + "        "+ medium
																						+"\n\t\t\t Change: " + "        "+ sukli
																						+"\n\t\t\t\t >>>>>>>>>><<<<<<<<<<"
																						+"\n\t\t\t\tTHANK YOU COME AGAIN!!"
																						+ "\n\t\t\t\tSHAKERIEZ SHAKES"
																						+ "\n\t\t\tCONTACT: zdtmanungay@slsu.edu.ph");
												}
												else if(cash == medium)
												{
												    JOptionPane.showMessageDialog(null,"\n\t\t\t Balance:\t\t 0");
												    JOptionPane.showMessageDialog(null,"\n\t\t\t>>>>>>>> RECEIPT<<<<<<<<"
																						+"\n\t\t\t YOU HAVE ORDERED : " + "        " +flavor
																						+"\n\t\t\t QTY: " + "        " + num
																						+"\n\t\t\t SIZE:" +         " Medium"
																						+"\n\t\t\t Total Amount:" + "        "+ large
																						+"\n\t\t\t Change: " + "        0"
																						+"\n\t\t\t\t >>>>>>>>>><<<<<<<<<<"
																						+"\n\t\t\t\tTHANK YOU COME AGAIN!!"
																						+ "\n\t\t\t\tSHAKERIEZ SHAKES"
																						+ "\n\t\t\tCONTACT: zdtmanungay@slsu.edu.ph");
												}
												else
												{
													JOptionPane.showMessageDialog(null,"\n\t\t\t You have input an insufficient amount." );
													zy=1;
												}
											}catch(Exception z){
												JOptionPane.showMessageDialog(null,"Sorry! You have input an invalid amount. \n\t\t\t");
												zy=1;
												}
											}while(zy==1);
											
									}
									else {
									zzz=1;
									}
						  		}catch(Exception z){
						  			JOptionPane.showMessageDialog(null,"Invalid Choice. Please Input a Number. \n\t\t\t");
						  			zzz=1;
						  		}
						  }while(zzz==1);
						  }
						  else if(size.equals("L") || size.equals("l"))
						  {
						  	JOptionPane.showMessageDialog(null,"You have chosen the size LARGE.");
						  	do{
						  		zzz=0;
						  		try{
						  			num=Integer.parseInt(JOptionPane.showInputDialog("\n\t\t\t Enter the quantity: "));
						  			if(num>=1)
									{
										large = (num * 35);
										cash=0;
										sukli=0;
										JOptionPane.showMessageDialog(null,"\n\t\t\t Total Amount: \t\t" + large);
										do{
										try{
										cash=Double.parseDouble(JOptionPane.showInputDialog("\n\t\t\t Cash: \t\t\t: "
																							+"\n\t\t\t Amount to be payed: \t\t" + large));
												zy=0;
												if(cash > large)
												{
													sukli = (cash - medium);
													JOptionPane.showMessageDialog(null,"\n\t\t\t Balance:\t\t " +sukli);
													JOptionPane.showMessageDialog(null,"\n\t\t\t>>>>>>>> RECEIPT<<<<<<<<"
																						+"\n\t\t\t YOU HAVE ORDERED : " + "        " +flavor
																						+"\n\t\t\t QTY: " + "        " + num
																						+"\n\t\t\t SIZE:" +         " Large"
																						+"\n\t\t\t Total Amount:" + "        "+ large
																						+"\n\t\t\t Change: " + "        "+ sukli
																						+"\n\t\t\t\t >>>>>>>>>><<<<<<<<<<"
																						+"\n\t\t\t\tTHANK YOU COME AGAIN!!"
																						+ "\n\t\t\t\tSHAKERIEZ SHAKES"
																						+ "\n\t\t\tCONTACT: zdtmanungay@slsu.edu.ph");
												}
												else if(cash == medium)
												{
												    JOptionPane.showMessageDialog(null,"\n\t\t\t Balance:\t\t 0");
												    JOptionPane.showMessageDialog(null,"\n\t\t\t>>>>>>>> RECEIPT<<<<<<<<"
																						+"\n\t\t\t YOU HAVE ORDERED : " + "        " +flavor
																						+"\n\t\t\t QTY: " + "        " + num
																						+"\n\t\t\t SIZE:" +         " Medium"
																						+"\n\t\t\t Total Amount:" + "        "+large
																						+"\n\t\t\t Change: " + "        0"
																						+"\n\t\t\t\t >>>>>>>>>><<<<<<<<<<"
																						+"\n\t\t\t\tTHANK YOU COME AGAIN!!"
																						+ "\n\t\t\t\tSHAKERIEZ SHAKES"
																						+ "\n\t\t\tCONTACT: zdtmanungay@slsu.edu.ph");
												}
												else
												{
													JOptionPane.showMessageDialog(null,"\n\t\t\t You have input an insufficient amount." );
													zy=1;
												}
											}catch(Exception z){
												JOptionPane.showMessageDialog(null,"Sorry! You have input an invalid amount. \n\t\t\t");
												zy=1;
												}
											}while(zy==1);
											
									}
									else {
									zzz=1;
									}
						  		}catch(Exception z){
						  			JOptionPane.showMessageDialog(null,"Invalid Choice. Please Input a Number. \n\t\t\t");
						  			zzz=1;
						  		}
						  }while(zzz==1);
						  }
						  else if(size.equals("XL") || size.equals("xl"))
						  {
						  	JOptionPane.showMessageDialog(null,"You have chosen the size EXTRA LARGE.");
						  	do{
						  		zzz=0;
						  		try{
						  			num=Integer.parseInt(JOptionPane.showInputDialog("\n\t\t\t Enter the quantity: "));
						  			if(num>=1)
									{
										xl = (num * 45);
										cash=0;
										sukli=0;
										JOptionPane.showMessageDialog(null,"\n\t\t\t Total Amount: \t\t" + xl);
										do{
										try{
										cash=Double.parseDouble(JOptionPane.showInputDialog("\n\t\t\t Cash: \t\t\t: "
																							+"\n\t\t\t Amount to be payed: \t\t" + xl));
												zy=0;
												if(cash > xl)
												{
													sukli = (cash - xl);
													JOptionPane.showMessageDialog(null,"\n\t\t\t Balance:\t\t " +sukli);
													JOptionPane.showMessageDialog(null,"\n\t\t\t>>>>>>>> RECEIPT<<<<<<<<"
																						+"\n\t\t\t YOU HAVE ORDERED : " + "        " +flavor
																						+"\n\t\t\t QTY: " + "        " + num
																						+"\n\t\t\t SIZE:" +         " Extra Large"
																						+"\n\t\t\t Total Amount:" + "        "+ xl
																						+"\n\t\t\t Change: " + "        "+ sukli
																						+"\n\t\t\t\t >>>>>>>>>><<<<<<<<<<"
																						+"\n\t\t\t\tTHANK YOU COME AGAIN!!"
																						+ "\n\t\t\t\tSHAKERIEZ SHAKES"
																						+ "\n\t\t\tCONTACT: zdtmanungay@slsu.edu.ph");
												}
												else if(cash == xl)
												{
												    JOptionPane.showMessageDialog(null,"\n\t\t\t Balance:\t\t 0");
												    JOptionPane.showMessageDialog(null,"\n\t\t\t>>>>>>>> RECEIPT<<<<<<<<"
																						+"\n\t\t\t YOU HAVE ORDERED : " + "        " +flavor
																						+"\n\t\t\t QTY: " + "        " + num
																						+"\n\t\t\t SIZE:" +         " Extra Large"
																						+"\n\t\t\t Total Amount:" + "        "+ xl
																						+"\n\t\t\t Change: " + "        "+ sukli
																						+"\n\t\t\t\t >>>>>>>>>><<<<<<<<<<"
																						+"\n\t\t\t\tTHANK YOU COME AGAIN!!"
																						+ "\n\t\t\t\tSHAKERIEZ SHAKES"
																						+ "\n\t\t\tCONTACT: zdtmanungay@slsu.edu.ph");
												}
												else
												{
													JOptionPane.showMessageDialog(null,"\n\t\t\t You have input an insufficient amount." );
													zy=1;
												}
											}catch(Exception z){
												JOptionPane.showMessageDialog(null,"Invalid Choice. Please Try Again. \n\t\t\t");
												zy=1;
												}
											}while(zy==1);
											
									}
									else {
									zzz=1;
									}
						  		}catch(Exception z){
						  			JOptionPane.showMessageDialog(null,"Sorry! You have input an invalid amount. \n\t\t\t");
						  			zzz=1;
						  		}
						  }while(zzz==1);
						  }
						  else
						  {
						  	JOptionPane.showMessageDialog(null,"Sorry! We do not have that size.");
						  	again=1;
						  }
			}while(again==1);
		
	}
	}