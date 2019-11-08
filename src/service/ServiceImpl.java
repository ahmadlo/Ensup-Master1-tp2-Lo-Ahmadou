package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Annonce;
import metier.Personne;

public class ServiceImpl implements Iservice {

	// liste des personnes 
	public static List<Personne> base = new ArrayList<Personne>();
	
	// liste des annonces 
		public static List<Annonce> annonces = new ArrayList<Annonce>();
		
		//Crud Personne
	@Override
	public List<Personne> init() {
		Personne loik = new Personne(base.size()+1, "Froeich", "Loïc", "atLoik", "Zapper", new Date(1995, 5, 18));
		base.add(loik);
		
		Personne fatima = new Personne(base.size()+1, "Ba", "Fatima", "timzii", "Passer12", new Date(1982, 12, 28));
		base.add(fatima);
		
		Personne gio = new Personne(base.size()+1, "Simon", "Gio", "gogo", "Aimer", new Date(1935, 1, 3));
		base.add(gio);
		
		return base ;
	}
	
	
	@Override
	public int creerPersonne(List<Personne> list, Personne personne) {
		list.add(personne);
		return 1;
	}

	@Override
	public Personne getPersonne(List<Personne> list, int idPersonne) {
		for (Personne personne : list) {
			if (personne.getPersonneId() == idPersonne) {
				return personne;
			}
		}
		return null;
	}

	@Override
	public void deletePersonne(List<Personne> list, int idPersonne) {
		for (Personne personne : list) {
			if (personne.getPersonneId() == idPersonne) {
				list.remove(personne);
			}
		}

	}

	@Override
	public void updatePersonne(List<Personne> list, Personne p, String nom, String prenom, Date dateNaissance) {
		for (Personne personne : list) {
			if (personne.getPersonneId() == p.getPersonneId()) {
				personne.setNom(nom);
				personne.setPrenom(prenom);
				personne.setDateDeNaissance(dateNaissance);
			}
		}

	}

	@Override
	public List<Personne> findAllPersonnes() {
		return base;
	}

	@Override
	public int getPersonneId(List<Personne> list, Personne p) {
		for (Personne personne : list) {
			if (personne.getNom().matches(p.getNom())) {
				return personne.getPersonneId();
			}
		}
		return 0;
	}

	@Override
	public void affichePersonnes() {
		System.out.println(base);

	}

	@Override
	public void afficheAnnoncesPersonne(Personne p) {
		for (Annonce annonce : annonces) {
			if (annonce.getIdPersonne() == p.getPersonneId()) {
				System.out.println(annonce);
			}
		}

	}

	
	//Crud Annonce
	
	@Override
	public int creerAnnonce(Personne personne, Annonce a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Annonce getAnnonce(Personne personne, int idAnnonce) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAnnonce(Personne personne, int idAnnonce) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAnnonce(Personne personne, Annonce a) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Annonce> findAllAnnonce(Personne personne) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
