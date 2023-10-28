import java.util.*;
class iFriend{ 
	
    public static String[] idArray=new String[0];
	public static String[] nameArray=new String[0];
	public static String[] numberArray=new String[0];
	public static String[] companyArray=new String[0];
	public static double[] salaryArray=new double[0];
	public static String[] bdayArray=new String[0];
	public static int index;
	
	public static void extendsArrays(){
		int length=idArray.length;
		String[] tempidArray=new String[length+1];		
		String[] tempnameArray=new String[length+1];
		String[] tempnumberArray=new String[length+1];
		String[] tempcompanyArray=new String[length+1];
		double[] tempsalaryArray=new double[length+1];
		String[] tempbdayArray=new String[length+1];  
	
	for(int i=0;i<length;i++){
		tempidArray[i]=idArray[i];
		tempnameArray[i]=nameArray[i];
		tempnumberArray[i]=numberArray[i];
	    tempcompanyArray[i]=companyArray[i];
		tempsalaryArray[i]=salaryArray[i];
	    tempbdayArray[i]=bdayArray[i];
	}
	
		idArray=tempidArray;
		nameArray=tempnameArray;
		numberArray=tempnumberArray;
		companyArray=tempcompanyArray;
		salaryArray=tempsalaryArray;
		bdayArray=tempbdayArray;
		}
	
	
	
		//=====================id=================
	
	
	
	public static String generateid(){
		if(idArray.length==0){
			System.out.println("C0001");
			System.out.println("========");
			return "C0001";

		}else{
			System.out.println(String.format("C%04d",(idArray.length+1)));
			System.out.println("========");
			return String.format("C%04d",(idArray.length+1));

	    }
	}
	
	
	
		//=======================name , number , company , salary , bday =========================
	
	
	
	public static void nameArray(){
		clearConsole();
		System.out.println("\n+---------------------------------------------------+");
		System.out.println("|               ADD Contact to the list             |");
		System.out.println("+---------------------------------------------------+");
		String id=generateid();
		extendsArrays();

		idArray[idArray.length-1]=id;
		//~ if(idArray.length==0){
			//~ System.out.println("\nC0001");
			//~ System.out.println("========");
		//~ }else{
			//~ System.out.println(String.format("\nC%04d",(idArray.length+1)));
			//~ System.out.println("========");
		 //~ }
		
		Scanner input=new Scanner (System.in);
		System.out.print("\n\nName                : ");
		String name=input.next();
		nameArray[nameArray.length-1]=name;
	
	}
	
	
	
	public static void numberArray(){
			Scanner input=new Scanner(System.in);
			System.out.print("Phone number        : ");
			String number=input.next();
				if(number.charAt(0)=='0'&&number.length()==10){
					
				}else{
					System.out.println("\n\t  Invalid phone number...\n");
				
				System.out.print("Do you want to add anther Contact (Y/N): ");	   
				char ch=input.next().charAt(0);
	   		    if(ch=='Y'||ch=='y'){
					System.out.print("\033[5A");
					System.out.print("\033[0J");
					numberArray();
					
		  	    }
			    if(ch=='N'||ch=='n'){
					clearConsole();
					home();
					
				
							   }
				}
				numberArray[numberArray.length-1]=number;
				
	}

	
	
	public static void companyArray(){	
		Scanner input=new Scanner (System.in);
		System.out.print("Company Name        : ");
		String company=input.next();
	    companyArray[companyArray.length-1]=company;
	    
	}
	
	
	
	public static void salaryArray(){	
		Scanner input=new Scanner (System.in);
		System.out.print("Salary              : ");
		double salary=input.nextDouble();
		salaryArray[salaryArray.length-1]=salary;	
	}


	public static void bdayArray(){
		Scanner input=new Scanner (System.in);
		System.out.print("B'Day (YYYY-MM-DD)  : ");
		String bday=input.next();
		bdayArray[bdayArray.length-1]=bday;
		System.out.println("\n\tContact has been successfully...");
		 test();
	//======
		System.out.print("\n\n\nDo you want to add another Contact (Y/N); ");
		char ch=input.next().charAt(0);
		if(ch=='Y'||ch=='y'){
			 AddcontactArray();
			}
		if(ch=='N'||ch=='n'){
	       home();
		}
       
	}


		//=================add contact=======================
	
	
	
	public static void AddcontactArray(){
		generateid();
		nameArray();
		numberArray();
		companyArray();
		salaryArray();
		bdayArray();
        
		}
		
		
		
		//====================search======================
		
		
		
	public static int search(String search){
	     for (int i = 0; i <idArray.length; i++){
			 if(nameArray[i].equalsIgnoreCase(search)||numberArray[i].equalsIgnoreCase(search)){
				 return i;
			 }
			 
		 }
		 return -1;
	}
		 
		
		

		
		
		
		//=====================update======================


	public static void Updatecontacts(){
		
		Scanner input=new Scanner(System.in);
		System.out.println("\n+----------------------------------------------------------+");
		System.out.println("|                      UPDATE CONTACTS                     |");
		System.out.println("+----------------------------------------------------------+");
		System.out.print("\nSearch Contacts by Name or Phone Number - ");
		String searchVal=input.next();
		index=search(searchVal);
	
		
		if(index==-1){
			System.out.println("no contact	");
		 
		}else{
			System.out.println("Contact ID         : "+idArray[index]);
			System.out.println("Name               : "+nameArray[index]);
			System.out.println("Phone Number       : "+numberArray[index]);
			System.out.println("Company Name       : "+companyArray[index]);
			System.out.println("Salary             : "+salaryArray[index]);
			System.out.println("B'day (YYYY-MM-DD) : "+bdayArray[index]);				
		}
	     System.out.println("\n\n What do you want to update...");
	     
	     System.out.println("\n\t\t[01] Name         ");
	     System.out.println("\t\t[02] Phone Number ");
	     System.out.println("\t\t[03] Company Name ");
	     System.out.println("\t\t[04] Salary       \n\n");
	     
	     System.out.print(" Enter an option to continue -> ");
	     int option=input.nextInt();
	     switch(option){
			 case 1:{
				updatename();
				 }
			 
			 }
	}
	
	//==========================================================
	
	public static void updatename(){
		System.out.print("\033[5A");
		System.out.print("\033[0J");
		System.out.print("\033[5A");
		System.out.print("\033[0J");
		Scanner input=new Scanner (System.in);
		System.out.println(" Update Name\n ====================");
		System.out.print("\n\n Input new name                : ");
		String name=input.next();
		nameArray[nameArray.length]=name;
		
		home();
		
		
		
		}
	
	
	
	
	
	
	
	
		
		public static void updatenumber(){
			Scanner input=new Scanner (System.in);
			System.out.print("\033[5A");
			System.out.print("\033[0J");System.out.print("\033[5A");
			System.out.print("\033[0J");
			System.out.println("  Update number");
			System.out.println("==============");
			System.out.println();
			System.out.print("Input new phone number - ");
		
			}
		
		
		
		
		
		
		
		//=================option===============

     
     
	public static void Option(){	
		Scanner input=new Scanner (System.in);
	    System.out.print("\n\nEnter an option to continue -> ");	
	    int option=input.nextInt();
			switch(option){
				case 1:{
					AddcontactArray();
					}
					break;
				case 2:{
					clearConsole();
					Updatecontacts();
					}	
					break;
					
				}
	}
	
	
	
		

		

		
		//===========================test===================


	public static void test(){
		for (int i = 0; i < idArray.length; i++){
			System.out.println("\n\n\n"+idArray[i]+"\t"+nameArray[i]+" \t"+numberArray[i]+"\t"+companyArray[i]+"\t"+salaryArray[i]+"\t"+bdayArray[i]);
		}
	}   

		
		
		
	
		//======================home===================	
	
	
	
	public static void home(){
		 clearConsole();
		 System.out.println("\n\n                              /$$ /$$$$$$$$/$$$$$$$  /$$$$$$ /$$$$$$$$ / $$  | $$ /$$$$$$$         ");	  
		 System.out.println("                              |__/| $$____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$            ");	  
		 System.out.println("                               /$$| $$     | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$          ");	  
		 System.out.println("                              | $$| $$$$$  | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$            ");	  
		 System.out.println("                              | $$| $$_/   |$$___  $$  | $$  | $$__/   | $$  $$$$| $$  | $$            ");	  
		 System.out.println("                              | $$| $$     | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$          ");	  
		 System.out.println("                              | $$| $$     | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/           ");	  
		 System.out.println("                              |__/|__/     |__/  |__/|______/|________/|__/  \\__/|_______/            ");
		 
		 
	 
		 System.out.println("\n\n        ______              _                _                  _____                                                                                        ");
		 System.out.println("       / _____|            | |              | |                / ___ \\                                                                                           ");
		 System.out.println("      | |        ___  _ __ | |_  __  _  ____| |___ ___        | |   | |_ __ ___ _ _ __  _ _________ _ __                                                                                           ");
		 System.out.println("      | |       / _ \\| '_ \\| __ / _ ` |/ ___| ___/ ___|       | |   | | `__/ _ ` | '_ \\| |_   / __ \\ '__|                                                                              ");
		 System.out.println("      | |_____ | (_) | | | | |_| |_|  | |___| |__\\___ \\       | |___| | | | |_|  | | | | |/  /  ___/ |                                                                                  ");
		 System.out.println("       \\______| \\___/|_| |_|\\__|\\__ ,_|\\____|\\___|____/        \\_____/|_|  \\___, |_| |_|_/____\\____|_|                                                                                                              ");
		 System.out.println("                                                                             __/ |                                                              ");
		 System.out.println("                                                                            |___/                                                                    ");
		 
		 System.out.println("\n     =====================================================================================================================================================");
		
		 Scanner input=new Scanner (System.in);
		 System.out.println("\n\n\t[1] ADD Contacts");
	   	 System.out.println("\n\t[2] UPDATE Contacts");
		 System.out.println("\n\t[3] DELETE Contacts");
		 System.out.println("\n\t[4] SEARCH Contacts");
		 System.out.println("\n\t[5] LIST Contacts");
		 System.out.println("\n\t[6] Exit");
		 
		 Option();
		 
	}
	
	
	
	
		//==================main====================
	
	
	
	public static void main(String args[]){ 
        home();
	    }
	  
	  
	    
		//================clear==================    
	  
	  
	    
      public final static void clearConsole() {
		   try {
		   final String os = System.getProperty("os.name");
			   if (os.contains("Windows")) {
				  new ProcessBuilder("cmd", "/c",
				  "cls").inheritIO().start().waitFor();
			   } else {
				   System.out.print("\033[H\033[2J");
				   System.out.flush();
			     }
		   } catch (final Exception e) {
			    e.printStackTrace();
		        // Handle any exceptions.
		     }
      }
	


	
}

