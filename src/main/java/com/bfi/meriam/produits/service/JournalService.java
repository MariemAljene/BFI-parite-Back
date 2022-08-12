package com.bfi.meriam.produits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfi.meriam.produits.entities.Compte;
import com.bfi.meriam.produits.entities.Journal;
import com.bfi.meriam.produits.entities.Produit;
import com.bfi.meriam.produits.entities.Role;
import com.bfi.meriam.produits.repos.CompteRepository;
import com.bfi.meriam.produits.repos.JournalRepository;

import java.util.Date;
import java.util.List;
import java.time.LocalDate;
import java.util.*;
@Service
public class JournalService {
 @Autowired 
 JournalRepository JR;
 @Autowired
 CompteRepository ct;
 public void addJournal (Journal Journal)
 {
	// Compte c= ct.findById(numcompte).get();
	// Journal.setNumCompte(c);
	 JR.save(Journal) ;
 
	 
 }
 public 	Journal UpdateJournal (Journal Journal)
 {
	 Integer id = Journal.getIdJournal();
		Journal J = JR.findById(id).get();
		
 Journal.setCredit(J.getCredit()); 
 Journal.setDateTransaction(J.getDateTransaction()); 
 Journal.setDebit(J.getCredit() );
 Journal.setLibelle(J.getLibelle());  
  return JR.save(Journal);
 
 } 
 
 public void DeleteJournal(int id)
 {JR.deleteById(id);;
} 
 public  List<Journal> ListerJournal()
 {List<Journal> journal = new ArrayList<Journal>();  
 JR.findAll().forEach(journal1 -> journal.add(journal1));  
 return journal ;
	 
 }
 public  Journal ListerJournalOne(int idJournal)
 {return  JR.findById(idJournal).get(); 

	 
 }
}

