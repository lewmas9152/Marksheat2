package marksheat;

import java.util.Scanner;

public class SSD2 {
	
	public static void menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("0:Sh20(30mins,3hrs)");
		System.out.println("1:Sh10(15mins,1hr)");
		System.out.println("2:Sh20(15mins,midnight)");
		System.out.println("3:Okoa 50");
		System.out.println("4:Okoa 20");
		System.out.println("5:Okoa 10");
		System.out.println("6:Okoa 5");
		System.out.println("7:Okoa 20(900MB,1hr)");
		System.out.println("8:Okoa Internet");
		System.out.println("98:More");
		
		System.out.println(" ");
		
		
		System.out.println("Select a bundle: ");
		int bundle = input.nextInt();
		
		int newOkoaRequest = 0;
		switch (bundle) {
		case 0:
		  newOkoaRequest = 20;
		  break;
		case 1:
		  newOkoaRequest = 10;
		  break;
		case 2:
		  newOkoaRequest = 20;
		  break;
		case 3:
		  newOkoaRequest = 50;
		  break;
		case 4:
		  newOkoaRequest = 20;
		  break;
		case 5:
		  newOkoaRequest = 10;
		  break;
		case 6:
		  newOkoaRequest = 5;
		  break;
		case 7:
		  newOkoaRequest = 20;
		  break;
		case 8:
		  newOkoaRequest = 100;
		  break;
		default:
		  System.out.println("Invalid bundle selection");
		  System.exit(1);
		}
		
		System.out.println(" ");
		

		int totalDebt = newOkoaRequest;

		
		System.out.println("Existing Unpaid Okoa:0 ");
		System.out.println("New Okoa request:" + newOkoaRequest);
		System.out.println("TOTAL DEBT will be:" + totalDebt);
		System.out.println("1:Accept");
		System.out.println("2:Decline");
		System.out.println("0:Back 00Home");
		System.out.println(" ");
		
		System.out.println("Enter your choice: ");
		int choice = input.nextInt();

		switch (choice) {
		case 1:
		  System.out.println("You have accepted the new Okoa request");
		  break;
		case 2:
		  System.out.println("You have declined the new Okoa request");
		  break;
		case 0:
			menu();
		  break;
		default:
		  System.out.println("Invalid selection");
		  System.exit(1);
		}
	}

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
			String code;
			System.out.println("Enter the prompt code: ");
			code = input.next();
			
			 System.out.println(" ");
			 
			 

			
			if (!code.equals("x131#")) {
			  System.out.println("Invalid code ");
			  System.exit(1);
			}
			
			menu();
			
	

			
			

			
	
	}
	


}
