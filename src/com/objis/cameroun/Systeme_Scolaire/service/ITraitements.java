package com.objis.cameroun.Systeme_Scolaire.service;

import java.util.List;

import com.objis.cameroun.Systeme_Scolaire.domaine.Eleve;
import com.objis.cameroun.Systeme_Scolaire.domaine.Enseignant;

public interface ITraitements {
	
	public void enregistrerEnseignant(Enseignant enseig);
	public void enregistrerEleve(Eleve eleve);
	public void afficherDetailsEnseignant(Enseignant enseig); // j'utilise cette methode pour afficher le resutat de la recherche d'un enseignant
	public void afficherDetailsEleve(Eleve elev); // j'utilise cette methode pour afficher le resutat de la recherche d'un eleve
	public void rechercherEleveService(String nom);
	public void rechercherEnseignantService(String nom);
	public void listerElevesService();
	public void listerEnseignantsService();
	public void rechercherElevService(String matricule);
	public void rechercherEnseigService(String matricule);

}
