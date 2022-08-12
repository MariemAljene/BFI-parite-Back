package com.bfi.meriam.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bfi.meriam.produits.entities.Produit;


public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
