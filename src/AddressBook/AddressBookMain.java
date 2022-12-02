package AddressBook;

import java.util.*;

public class AddressBookMain {
	public static void main(String[] args){
		List<Person> p = new ArrayList<Person>();
		//Scanner scan = new Scanner(System.in);
		char menuChoice = '\n';

		
		do{
			menuChoice = menuOperationSelection().charAt(0);
			processChoice(menuChoice,p);
		} while(menuChoice != 'X');

	}

	public static String processChoice(char menuChoice,List<Person> p){
		String s = "FIX ME";
		String pName = "\n";
		String pEmail = "\n";
		String pAddress = "\n";
		String pPhoneNum = "\n";
		int pAge = -1;
		
		char personChoice;
		float sGPA = -1;
		int sID = -1;
		String fTitle = "\n";
		int fSalary = -1;

		Scanner sScan = new Scanner(System.in);
		Scanner iScan = new Scanner(System.in);

		switch (menuChoice){
			case 'C':
				System.out.println("Please enter the following information:");
				System.out.println("Full Name:");
				pName = "pName"; //sScan.nextLine();
				System.out.println("Age:");
				pAge = -1;//iScan.nextInt();
				System.out.println("Email:");
				pEmail = "p@email.com";//sScan.nextLine();
				System.out.println("Phone Number:");
				pPhoneNum = "pNumber";//sScan.nextLine();
				System.out.println("Home Address:");
				pAddress = "pAddressc";//sScan.nextLine();
				personChoice = menuTypeSelection().charAt(0);
				switch (personChoice){

					case 'S':
						System.out.println("Student ID:");
						sID = iScan.nextInt();
						System.out.println("Student GPA:");
						sGPA = iScan.nextInt();
						//p.add(new Student(pAge,pEmail , pAddress, pName, pPhoneNum, sID,  sGPA));
						break;

					case 'F':
						System.out.println("Salary:");
						fSalary = iScan.nextInt();
						System.out.println("Job Title:");
						fTitle = sScan.nextLine();
						//p.add(new Faculty(fullName, age, email, phoneNum, address, fSalary,  fTitle));
						break;

					default:
					p.add(new Person(pName, pAge, pEmail, pPhoneNum, pAddress));
						break;
				}
				break;

			case 'V':
				System.out.println(p);
				//System.out.print(p);
				//for (Person pr : p){
				//	System.out.print(pr.toString());
				//}
				break;
			
		}
		return s;
	}

	public static String menuOperationSelection(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("\nAddressBook Menu\n");
		System.out.println("(C)reate");
		System.out.println("(R)etrieve");
		System.out.println("(U)pdate");
		System.out.println("(D)elete");
		System.out.println("(V)iew:");
		System.out.println("E(X)it\n");
		System.out.print("Choice: ");
		String menuChoice = scnr.next().toUpperCase();
		return menuChoice;
	}
	public static String menuTypeSelection(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("\nSelect person type to process(if any):\n");
		System.out.println("(F)aculty");
		System.out.println("(S)tudent");
		System.out.println("E(X)it\n");
		System.out.print("Choice: ");
		String type = scnr.nextLine().toUpperCase();
		return type;
	}
}
