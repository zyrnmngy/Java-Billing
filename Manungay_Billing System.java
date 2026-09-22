import java.io.*;

public class xxx{

	
		public static void main(String [] args) throws IOException
		{
		
			
		BufferedReader Manungay = new BufferedReader(new InputStreamReader(System.in));
		
		String line = "\n\t\t\t|| ~~~~~~~~~~~~ * ~~~~~~~~~~~~ ||";
		
		String title = "\n\t\t\t\t  SHAKERIEZ";
		
		String line2 = "\n\t\t\t|| ~~~~~~~~~~~~ * ~~~~~~~~~~~~ ||";
		int shake =0;
		int again=0;
		int ulit=0;
		int num =0;
		int small =(num * 15);
		int medium =(num * 25);
		int large =(num * 35);
		int xl =(num * 45);
		int zy=0;
		String size =" ";
		System.out.println(line);
		System.out.println(title);
		System.out.println(line2);
		System.out.print("\n\t\t\t FLAVORS TO CHOOSE FROM:"
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
						  +"\n\t\t\t [11] Cookies and Cream");
						  
		String line3 = "\n\t\t\t|| ~~~~~~~~~~~~ * ~~~~~~~~~~~~ ||";
		System.out.println(line3);
do{
	again=0;

		try{
		
		System.out.print("\n\t\t\tEnter your chosen flavor :");
		shake=Integer.parseInt(Manungay.readLine());
		System.out.println(line3);
		
		switch(shake){
			
			case 1:

			
				System.out.println("\n\t\t\tYou have selected the flavor Choco Kisses");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
		
				System.out.println(line3);
			do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
			
				break;
			case 2:
				System.out.println("\n\t\t\tYou have selected the flavor Choco Hot Fudge");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
				System.out.println(line3);
				do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
			
				break;
			case 3:
				System.out.println("\n\t\t\tYou have selected the flavor Ube");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
				System.out.println(line3);
				do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
			
			
				break;
			case 4:
				System.out.println("\n\t\t\tYou have selected the flavor Strawberry");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
				System.out.println(line3);
		do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
			
				break;
			case 5:
				System.out.println("\n\t\t\tYou have selected the flavor Vanilla");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
				System.out.println(line3);
			do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
			
			
				break;
			case 6:
				System.out.println("\n\t\t\tYou have selected the flavor Mango");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
				System.out.println(line3);
				do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
				break;
			case 7:
				System.out.println("\n\t\t\tYou have selected the flavor Pandan:");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
				System.out.println(line3);
				do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
			
				break;
			case 8:
				System.out.println("\n\t\t\tYou have selected the flavor Rocky Road:");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
				System.out.println(line3);
				do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
				break;
			case 9:
				System.out.println("\n\t\t\tYou have selected the flavor Cappuchino");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
				System.out.println(line3);
				do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
			
				break;
			case 10:
				System.out.println("\n\t\t\tYou have selected the flavor Double Dutch");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
				System.out.println(line3);
				do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
			
				break;
			case 11:
				System.out.println("\n\t\t\tYou have selected the flavor Cookies and Cream");
				System.out.println(line3);
				System.out.print("\n\t\t\tSIZE PRICES:"
						  +"\n\t\t\t [S] Small = 15 pesos"
						  +"\n\t\t\t [M] Medium = 25 pesos"
						  +"\n\t\t\t [L] Large = 35 pesos"
						  +"\n\t\t\t [XL] Extra Large = 45pesos");
				System.out.println(line3);
	do{
				again=0;
				System.out.print("\n\t\t\tChoose the size of your shake :");
				size=Manungay.readLine();
				System.out.println(line3);
					
					if(size.equals("S") || size.equals("s"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - small );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					
					else if(size.equals("M") || size.equals("m"))
				{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + small);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							
							System.out.println("\n\t\t\t\t ORDER RECEIPT");
							System.out.println(line3);
							small = (num * 15);
							medium = (num * 25);
							large = (num * 35);
							xl = (num * 45);
							System.out.println("\n\t\t\t Total Amount: \t\t" + medium);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - medium );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == medium)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("L") || size.equals("l"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + large);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > large)
										{
											double sukli = (payment - large );
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == small)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					
					else if(size.equals("XL") || size.equals("xl"))
					{
							
								do{
								ulit=0;
								try{
								System.out.print("\n\t\t\tEnter the quantity : ");
								num=0;
								num=Integer.parseInt(Manungay.readLine());
								System.out.println(line3);
								if(num >1){
									System.out.println("\n\t\t\t\t ORDER RECEIPT");
									System.out.println(line3);
									small = (num * 15);
									medium = (num * 25);
									large = (num * 35);
									xl = (num * 45);
									System.out.println("\n\t\t\t Total Amount: \t\t" + xl);
											
								}
								else if (num==0){
									ulit=1;
									}
								}catch(Exception z){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									ulit=1;
									}
							}while(ulit==1);
							do{
							zy=0;
								try{
								System.out.print("\n\t\t\t Cash: \t\t\t" );
								double payment=0;
								payment=0;
								payment=Double.parseDouble(Manungay.readLine());
								
										if(payment > small)
										{
											double sukli = (payment - xl);
											System.out.println("\n\t\t\t Balance:\t\t " +sukli);
										}
										else if(payment == xl)
										{
										    System.out.println("\n\t\t\t Balance:\t\t 0");
										}
										else
										{
											System.out.print("\n\t\t\t You have input an insufficient amount." );
											zy=1;
										}
										
								} catch(Exception a){
									System.out.print("\t\t\t Invalid Choice. Please Input a Number not a Character. \n\t\t\t");
									zy=1;
								}	
							}while(zy==1);
					}
					else
					{
						System.out.println("\n\t\t\tThe size you have selected is not available.");
						again=1;
					}
			
				}while(again==1);
			
				break;
			default:
			System.out.println("\n\t\tThe item you've selected is not on the list above :(");
			System.out.println(line3);
			again=1;
			}
	} catch(Exception a){
			System.out.print("\t\t\t Invalid Choice. Please Try Again. \n\t\t\t");
			again=1;
}		
		}while(again==1);
		System.out.println(line3);
		System.out.println("\n\t\t\t\tTHANK YOU COME AGAIN!!");
		System.out.println(line3);
		System.out.println("\n\t\t\t\tSHAKERIEZ SHAKES");
		System.out.println("\n\t\t\tCONTACT: zdtmanungay@slsu.edu.ph");
	}
	}			

