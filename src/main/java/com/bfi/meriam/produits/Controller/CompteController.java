package com.bfi.meriam.produits.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bfi.meriam.produits.entities.Compte;
import com.bfi.meriam.produits.service.CompteService;
import com.bfi.meriam.produits.service.PlanCompteService;
import com.bfi.*;
@RequestMapping("/Compte")
@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*")


public class CompteController {
	@Autowired  
	CompteService CS ; 
	@PostMapping ("/addCompte")  
	public void AddPlanCompte(@RequestBody Compte PC)
	{
CS.addCompte(PC);
	}
	
	@GetMapping("/getCompte")
	public List<Compte> getCompte(){
		return CS.ListerCompte();		
	}
	@DeleteMapping("/deleteCompte")
	public void deleteCompte(@RequestParam Integer id) {
		CS.DeleteCompte(id);
	
}
}