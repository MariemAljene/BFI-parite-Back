package com.bfi.meriam.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.bfi.meriam.produits.entities.Produit;
import com.bfi.meriam.produits.entities.User;

import com.bfi.meriam.produits.repos.ProduitRepository;
import com.bfi.meriam.produits.repos.UserRepository;

@SpringBootTest
class ProduitsApplicationTests {
	@Autowired 
	private ProduitRepository produitRepository ;
	
	@Test
	public void testCreateProduit() 
	{ Produit prod = new Produit( "PC Dell" ,2200.500, new Date()); 
	produitRepository .save( prod ); }
	@Test
	public void testFindProduit() 
	{Produit p=produitRepository.findById(2L).get();
	System.out.println(p);}
	@Test
	public void testUpdateProduit()
	{Produit p=produitRepository.findById(2L).get();
	p. setPrix(1000.0);
	produitRepository.save(p);
	}
	
	@Test
	public void testDeleteProduit()
	 { produitRepository .deleteById(2L);; }
	@Test public void testListerTousProduits()
	{
	List<Produit> prods = produitRepository.findAll();
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	
}}
