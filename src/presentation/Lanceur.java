package presentation;

import java.util.Date;

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

	}

}
