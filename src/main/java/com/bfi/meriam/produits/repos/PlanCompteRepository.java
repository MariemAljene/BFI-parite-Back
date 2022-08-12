package com.bfi.meriam.produits.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bfi.meriam.produits.entities.PlanCompte;

@Repository
public interface PlanCompteRepository extends CrudRepository<PlanCompte, Integer> {

}
