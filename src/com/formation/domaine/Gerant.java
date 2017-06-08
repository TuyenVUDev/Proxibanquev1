package com.formation.domaine;

import java.util.Collection;

public class Gerant extends Personne {

	private Collection<Conseiller> listeConseillers;

	// getters/setters
	public Collection<Conseiller> getListeConseillers() {
		return listeConseillers;
	}

	public void setListeConseillers(Collection<Conseiller> listeConseillers) {
		this.listeConseillers = listeConseillers;
	}

	@Override
	public String toString() {
		return "Gerant [listeConseillers=" + listeConseillers + ", nom=" + nom
				+ ", prenom=" + prenom + "]";
	}

	// constructeur
	public Gerant() {
		super();
	}

}
