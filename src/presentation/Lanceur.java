package presentation;

import java.util.Date;
import java.util.List;

import metier.Annonce;
import metier.Personne;
import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		//test du Crud Personne 
		
		Iservice iservice = new ServiceImpl();
		ServiceImpl.base = iservice.init();
		 System.out.println("Affiche Personne ");
		iservice.affichePersonnes();
		
		// recuperer la personne 2"
		Personne p = iservice.getPersonne(ServiceImpl.base, 2);
		System.out.println(p.toString());
		
		//supprimer une personne 
		iservice.deletePersonne(ServiceImpl.base, 1);
		System.out.println("apres Delete ");
		iservice.affichePersonnes();
		
		// modifier Personne 
		iservice.updatePersonne(ServiceImpl.base, p, "Zegrour", "Youssef", new Date("1902/12/28"));
		
		// recuperer la personne apres modification"
				 p = iservice.getPersonne(ServiceImpl.base, 2);
				System.out.println(p.toString());
				
		// ajout d'annoces
		
		Annonce a1 = new Annonce(1, "annonce 1", "ceci cest une annonce", 12.3);
		Annonce a2 = new Annonce(2, "annonce 2", "ceci cest une autre annonce", 8.3);
		Annonce a3 = new Annonce(3, "annonce 3", "ceci cest une derniere annonce", 7.3);
		
		iservice.creerAnnonce(p, a1);
		iservice.creerAnnonce(p, a2);
		iservice.creerAnnonce(ServiceImpl.base.get(1), a3);
		
		// afficher annonces d'une personne 
		iservice.afficheAnnoncesPersonne(p);
		
		// delete annonces 
		iservice.deleteAnnonce(ServiceImpl.base.get(1), 3);
		
		// recuperer les annonces d'une personnes 
		
		List<Annonce> annoncesPerso = iservice.findAllAnnonce(ServiceImpl.base.get(1));
		System.out.println("nombres d'annoces : " + annoncesPerso.size() );
		
		// update annonce d'une personne 
		
		iservice.updateAnnonce(p, a2);
		// afficher annonces d'une personne 
		iservice.afficheAnnoncesPersonne(p);
		
		// getAnnonce 
		System.out.println(" annonce recuperee : " + iservice.getAnnonce(p, 2));
		
		
		
		
		
		
				
				
	

	}

}
