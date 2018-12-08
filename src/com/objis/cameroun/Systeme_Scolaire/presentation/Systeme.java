package com.objis.cameroun.Systeme_Scolaire.presentation;

import java.util.Scanner;

import com.objis.cameroun.Systeme_Scolaire.domaine.Eleve; // ces 02 instructions créent un lien entre la couche domaine et la couche presentation
import com.objis.cameroun.Systeme_Scolaire.domaine.Enseignant;
import com.objis.cameroun.Systeme_Scolaire.service.ITraitements;
import com.objis.cameroun.Systeme_Scolaire.service.Traitement; // cette instruction crée un lien entre la couche service et la couche presentation

/**
 * @author Brandol
 *Ceci est la classe principale
 *son contenu est exécuté au lancement du programme
 */
public class Systeme {

	public static void main(String[] args) {
		
		System.out.println("\n");
		
		System.out.println("                    **********************************************************************");
		System.out.println("                    *                  Bienvenue dans mon application                    *");
		System.out.println("                    *               d'informatisation du Systeme Scolaire                *");
		System.out.println("                    *                                                                    *");
		System.out.println("                    **********************************************************************");

		
		
		ITraitements gestionnaire= new Traitement(); // on crée ainsi un objet qui pourra nous aider à acceder aux méthodes de la classe Traitement
		
		
		char choix=' ';
		
		System.out.println("\n  Voici les operations que vous pouvez effectuer pour le moment\n");
		
		while(choix != 'q') {
			
			
			System.out.println("    tapez 1 pour enregistrer un nouveau enseignant et ensuite afficher ses details sur une fiche");
			System.out.println("    tapez 2 pour enregistrer un nouveau eleve et ensuite afficher ses details sur une fiche");
			System.out.println("    tapez 3 pour rechercher un eleve a partir de son nom");
			System.out.println("    tapez 4 pour rechercher un enseignant a partir de son nom");
			System.out.println("    tapez 5 pour rechercher un eleve a partir de son matricule");
			System.out.println("    tapez 6 pour rechercher un enseignant a partir de son matricule");
			System.out.println("    tapez 7 pour afficher la liste de tous les eleves enregistres");
			System.out.println("    tapez 8 pour afficher la liste de tous les enseignants enregistres");
			System.out.println("    tapez q si vous voulez quitter");
			
			System.out.println("\n  Faites votre choix: ");
			
			Scanner scan=new Scanner(System.in);
			choix= scan.nextLine().charAt(0);
			
			
		if(choix != 'q') // on fait ce test pour que dans le cas où l'utilisateur saisit 'q' au debut, on arrete le programme
				{
			
			
		switch (choix) 
		{
		
		case '1':
		{
			
			Enseignant enseig= new Enseignant(); // on crée un objet Enseignant
			
			gestionnaire.enregistrerEnseignant(enseig); //on appelle le savoir-faire qui enregistre un enseignant
			System.out.println("\n");
			
			System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
			Scanner reponse=new Scanner(System.in);
			choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
			
			break;
		}
		
		case '2':
		{
			Eleve elev= new Eleve(); // on crée un objet Eleve 
			
			gestionnaire.enregistrerEleve(elev); //on appelle le savoir-faire qui enregistre un élève
			System.out.println("\n");
			
			System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
			Scanner reponse=new Scanner(System.in);
			choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
			break;
		}
		
		case '3':
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Veillez entrer le nom de l'eleve que vous voulez rechercher: ");
			String nom= sc.nextLine();
			
			
			gestionnaire.rechercherEleveService(nom);
			System.out.println("\n");
			
			System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
			Scanner reponse=new Scanner(System.in);
			choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
			break;
		}
		
		case '4':
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Veillez entrer le nom de l'enseignant que vous voulez rechercher: ");
			String nom= sc.nextLine();
			
			gestionnaire.rechercherEnseignantService(nom);
			System.out.println("\n");
			
			System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
			Scanner reponse=new Scanner(System.in);
			choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
			break;
		}
		
		case '5':
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Veillez entrer le matricule de l'eleve que vous voulez rechercher: ");
			String matri= sc.nextLine();
			
			gestionnaire.rechercherElevService(matri);
			System.out.println("\n");
			
			System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
			Scanner reponse=new Scanner(System.in);
			choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
			break;
		}
		
		case '6':
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Veillez entrer le matricule de l'enseignant que vous voulez rechercher: ");
			String matri= sc.nextLine();
			
			gestionnaire.rechercherEnseigService(matri);
			System.out.println("\n");
			
			System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
			Scanner reponse=new Scanner(System.in);
			choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
			break;
		}
		
		case '7':
		{
			Scanner sc=new Scanner(System.in);
			
			gestionnaire.listerElevesService();
			System.out.println("\n");
			
			System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
			Scanner reponse=new Scanner(System.in);
			choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
			break;
		}
		
		case '8':
		{
			Scanner sc=new Scanner(System.in);
			
			gestionnaire.listerEnseignantsService();
			System.out.println("\n");
			
			System.out.println("  Voulez-vous continuer?  o=oui ou q=quitter");
			Scanner reponse=new Scanner(System.in);
			choix= reponse.nextLine().charAt(0); // on recupere le choix de l'utilisateur
			break;
		}
		
		default:
			System.out.println("\n  Vous n'avez pas fait un bon choix \n");
			break;
		
		}
	
	         }
			
	
	           }
		System.out.println("\n  Aurevoir!!! ");
		}
}
