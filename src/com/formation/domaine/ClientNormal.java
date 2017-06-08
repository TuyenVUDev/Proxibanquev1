package com.formation.domaine;

public class ClientNormal extends Client {

	// constructeur
	public ClientNormal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClientNormal(String adresse, String ville,
			int codePostal, Compte compte, String typeClient) {
		super();
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.compte = compte;
		this.typeClient = typeClient;
	}

	@Override
	public String toString() {
		return "ClientNormal [adresse=" + adresse + ", ville=" + ville
				+ ", codePostal=" + codePostal + ", compte=" + compte
				+ ", typeClient=" + typeClient + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}

}
