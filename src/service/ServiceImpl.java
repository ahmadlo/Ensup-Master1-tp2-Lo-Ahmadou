package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Annonce;
import metier.Personne;

public class ServiceImpl implements Iservice {

	public static List<Personne> base = new ArrayList<Personne>();
	@Override
	public List<Personne> init() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int creerPersonne(List<Personne> list, Personne personne) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Personne getPersonne(List<Personne> list, int idPersonne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePersonne(List<Personne> list, int idPersonne) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePersonne(List<Personne> list, Personne p, String nom, String prenom, Date dateNaissance) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPersonneId(List<Personne> list, Personne p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void affichePersonnes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void afficheAnnoncesPersonne(Personne p) {
		// TODO Auto-generated method stub

	}

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
