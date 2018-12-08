package com.objis.cameroun.Systeme_Scolaire.dao;

import java.util.List;

import com.objis.cameroun.Systeme_Scolaire.domaine.Eleve;
import com.objis.cameroun.Systeme_Scolaire.domaine.Enseignant;

public interface IDao {
	public void enregistrerEnseignantDao(Enseignant enseig);
	public void enregistrerEleveDao(Eleve eleve);
	public List<Eleve> rechercherEleveDao(String nom);
	public List<Enseignant> rechercherEnseignantDao(String nom);
	public List<Eleve> listerElevesDao();
	public List<Enseignant> listerEnseignantsDao();
	public List<Eleve> rechercherElevDao(String matricule);
	public List<Enseignant> rechercherEnseigDao(String matricule);
	

}
