package com.bfi.meriam.produits.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfi.meriam.produits.entities.*;
import com.bfi.meriam.produits.repos.CompteRepository;


@Service
public class CompteService {
	@Autowired
	CompteRepository c; 
	public void addCompte (Compte Compte)
	 {c.save(Compte) ;
		 
	 }
	/* public 	Compte UpdateCompte (Compte Compte)
	 {
		 Journal id = Compte.getIdCompte();
			Compte CC= c.findAll(id).get();
			
	 Compte.setPlanCompte(CC.getPlanCompte()); 
	 
	  return c.save(Compte);
	 
	 } */
	 
	 public void DeleteCompte(int id)
	 {c.deleteById(id);;
	} 
	 public  List<Compte> ListerCompte()
	 {List<	Compte> compte = new ArrayList<Compte>();  
	 c.findAll().forEach(compte1 -> compte.add(compte1));  
	 return compte ;
		 
	 }
	
	 

}
