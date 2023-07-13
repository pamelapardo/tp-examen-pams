package atm;
import java.util.Scanner;
//		do {
//			System.out.println("Entrez votre code, client: ");
//			try {
//				
//				input = scan.next();
//				parsedInput = Integer.parseInt(input);
//				
//				if (parsedInput == user.getCode()) {
//					System.out.println("Vous etes bien connecte sur votre compte, " + input + " !");
//					System.out.println("Que voulez-vous faire ?");
//				}
//				
//				} catch (java.lang.NumberFormatException e ) {
//					System.out.println("Veuillez saisir des nombres!");
//				
//			}
//
//		} while (parsedInput != user.getCode());
public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account(100);
		Client user1 = new Client("Pamela", "Pardo", "Louis XIV", 9001, "Versailles", acc1);
		Client user2 = new Client("Mounir", "B", "Napoleon", 6904, "Lyon" );
		Client user3 = new Client("Toto", "Tata", "Marcelo", 3002, "Bolivar" );
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();;
		int parsedInput = 0;


		System.out.println("Bienvenu sur votre ATM virtuel");
		System.out.println("Choisir l'utilisateur entre:");
		System.out.println("1. Pamela");
		System.out.println("2. Mounir");
		System.out.println("3. Toto");
		System.out.println("4. Quitter");
		System.out.println("");
		System.out.print("Votre choix: ");
			switch(input) {
			case 1:
				System.out.println("Bienvenu sur votre compte, " + user1.getName() + " !");
				System.out.println("");
				userChoice(user1);
				break;
			case 2: 
				System.out.println("Bienvenu sur votre compte, " + user2.getName() + " !");
				System.out.println("");
				userChoice(user2);
				break;
			case 3:
				System.out.println("Bienvenu sur votre compte, " + user3.getName() + " !");
				System.out.println("");
				userChoice(user3);
				break; 
			case 4:
				System.out.println("Au revoir !");
				System.exit(1);
				break;
			default:
				System.out.println("...");
				System.out.println("Choisisez entre ces propositions, s'il vous plait.");
				break;
			}
			
			
		}
			public static void userChoice(Client client) {
				Scanner scan2 = new Scanner(System.in);
				int input2 = scan2.nextInt();
				Account account1 = new Account( );
				
				
				System.out.println("Que voulez vous faire? ");
				switch(input2) {
				case 1:
					System.out.println("Bienvenu sur votre compte, " + client.name + " !");
					System.out.println("");
					break;
				default:
					System.out.println("...");
					System.out.println("Choisisez entre ces propositions, s'il vous plait.");
					break;
				}
				
			}
}
