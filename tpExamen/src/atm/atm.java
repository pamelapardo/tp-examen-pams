package atm;
import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Construction des objets user a partir de la classe Client avec toute les attributs definis
		Client user1 = new Client("Pamela", "Pardo", "Louis XIV", 9001, "Versailles");
		Client user2 = new Client("Mounir", "B", "Napoleon", 6904, "Lyon");
		Client user3 = new Client("Toto", "Tata", "Marcelo", 3002, "Bolivar");
		
		//Construction du scanner qui prends la valeur donnee par saisi de clavier
		Scanner scan = new Scanner(System.in);
		int parsedInput = 0;


		System.out.println("Bienvenu sur votre ATM virtuel");
		System.out.println("Choisir l'utilisateur entre:");
		System.out.println("1. Pamela \n 2. Mounir \n 3.Toto \n 4.Quitter l'ATM");
		System.out.println("");
		System.out.print("Votre choix : ");
		//Saisi de clavier:
		int input = scan.nextInt();;
			// Choix multiple qui prend comme valeur la saisie d'avant
			switch(input) {
			case 1:
				System.out.println("Bienvenu sur votre compte, " + user1.getName() + " !\n");
				//appel d'une class static qui prend comme parametre le client 1 (selon le choix)
				userChoice(user1);
				break;
			case 2: 
				System.out.println("Bienvenu sur votre compte, " + user2.getName() + " !\n");
				//appel d'une class static qui prend comme parametre le client 2 (selon le choix)
				userChoice(user2);
				break;
			case 3:
				System.out.println("Bienvenu sur votre compte, " + user3.getName() + " !\n");
				//appel d'une class static qui prend comme parametre le client 3 (selon le choix)
				userChoice(user3);
				break; 
			case 4:
				System.out.println("Au revoir !");
				// Sortie du code
				System.exit(1);
				break;
			default:
				System.out.println("...");
				System.out.println("Choisisez entre ces propositions, s'il vous plait.");
				break;
			}
			
			
		}
			// Declaration de la classe statique d'utilisateur qui permet de prendre une classe client comme parametre, pour profiter de ses attributs
			public static void userChoice(Client client) {
				// Construction de la classe scanner pour prendre une saisie de clavier
				Scanner scan2 = new Scanner(System.in);
				//Construction d'objet de la classe Account qui prend comme paramentre un double et un client et la stocke dans l'objet acc1
				Account acc1 = new Account(0 , client);
				
				//boucle while qui permetra de executer les choix multiples, quand le code termine, on sort de la boucle et revient au code anterieur
				while (true) {
				System.out.println("Que voulez vous faire? \n");
				System.out.println("1. Consulter mon solde. \n 2. Deposer \n 3. Retirer \n 4. Consulter mes informations \n 5. 5. Quitter l'ATM");
				System.out.println("");
				System.out.print("Votre choix: ");
				//Saisie de clavier
				int input2 = scan2.nextInt();
				//Choix multiple qui prend en parametre la valeur saise 
				switch(input2) {
				case 1:
					System.out.println("Vous avez choisit de consulter votre solde. \n");
					//Le code dessous permet d'obtenir a travers de la metjode get, la valeur stocke dans l'attribut Balance dans les parametres de l'objet acc1
					System.out.println("Votre solde est de : "+ acc1.getBalance() + "€ \n");
					break;
				case 2:
					System.out.println("Vous avez choisit de deposer de l'argent. \n");
					// appel de la methode deposit de la classe Account avec l'objet acc1
					acc1.deposit();
				case 3:
					System.out.println("Vous avez choisit de retirer de l'argent. \n");
					// appel de la methode withdraw de la classe Account avec l'objet acc1
					acc1.withdraw();
					break;
				case 4:
					System.out.println("Vous avez choisit de consulter vos informations. \n");
					//Affichage des attributes de la classe Client avec le parametre client
					System.out.println(client.getName()+".\n"+ client.getLastname()+".\n"+ client.getAdress()+".\n"+ client.getPostal()+".\n"+ client.getCity() );
					break;
				case 5:
					System.out.println("Au revoir !");
					System.exit(1);
					break;
				default:
					System.out.println("...");
					System.out.println("Choisisez entre ces propositions, s'il vous plait.");
					break;
				}
				}
				
				
			}
}
