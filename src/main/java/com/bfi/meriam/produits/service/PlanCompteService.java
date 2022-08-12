package com.bfi.meriam.produits.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfi.meriam.produits.entities.Journal;
import com.bfi.meriam.produits.entities.PlanCompte;
import com.bfi.meriam.produits.repos.PlanCompteRepository;

@Service
public class PlanCompteService {
@Autowired

PlanCompteRepository PC;
public void addPlanCompte (PlanCompte PlanCompte)
{PC.save(PlanCompte) ;
	 
}


public void DeletePlanCompte(int id)
{PC.deleteById(id);;
} 
public  List<PlanCompte> ListerPlanCompte()
{List<PlanCompte> PlanCompte = new ArrayList<PlanCompte>();  
PC.findAll().forEach(PlanCompte1 -> PlanCompte.add(PlanCompte1));  
return  PlanCompte ;
	 
}
public  PlanCompte ListerPlanOne(int id)
{return  PC.findById(id).get(); 

	 
}
}