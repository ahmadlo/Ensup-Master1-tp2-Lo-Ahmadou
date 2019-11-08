package presentation;

import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		//test du Crud Personne 
		
		Iservice iservice = new ServiceImpl();
		ServiceImpl.base = iservice.init();
		
		iservice.affichePersonnes();

	}

}
