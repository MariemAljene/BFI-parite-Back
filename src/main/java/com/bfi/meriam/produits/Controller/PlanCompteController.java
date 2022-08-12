package com.bfi.meriam.produits.Controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bfi.meriam.produits.entities.Journal;
import com.bfi.meriam.produits.entities.PlanCompte;
import com.bfi.meriam.produits.service.JournalService;
import com.bfi.meriam.produits.service.PlanCompteService;

@RequestMapping("/PlanCompte")
@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class PlanCompteController {
	@Autowired  
	PlanCompteService PCS ; 
	@PostMapping ("/addPlanCompte")  
	public void AddPlanCompte(@RequestBody PlanCompte PC)
	{
PCS.addPlanCompte(PC);
	}
	
	@GetMapping("/getPlanCompte")
	public List<PlanCompte> getPlanCompte(){
		return PCS.ListerPlanCompte();		
	}
	@DeleteMapping("/deletePlanCompte")
	public void deletePlanCompte(@RequestParam Integer id) {
		PCS.DeletePlanCompte(id);
	}
}
