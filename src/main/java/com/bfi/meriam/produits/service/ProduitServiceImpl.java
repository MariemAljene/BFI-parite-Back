package com.bfi.meriam.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfi.meriam.produits.entities.Produit;
import com.bfi.meriam.produits.repos.ProduitRepository;
@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
ProduitRepository produitRepository ;
	@Override
	public Produit saveProduit(Produit p) {
		
		return produitRepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);		
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
	}

	@Override
	public Produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

}
