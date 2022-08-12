package com.bfi.meriam.produits.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Compte implements Serializable {
	@Id
	//@JsonIgnore
	@GeneratedValue
	private int idCompte;
	@OneToMany(mappedBy = "numCompte")
	private Collection <Journal> numCompte ;
	
	@ManyToOne
	private PlanCompte PlanCompte;
	
 @ManyToOne 
 private User Email ; 

	public Collection<Journal> getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(Collection<Journal> numCompte) {
		this.numCompte = numCompte;
	}

	public PlanCompte getPlanCompte() {
		return PlanCompte;
	}

	public void setPlanCompte(PlanCompte planCompte) {
		this.PlanCompte = planCompte;
	}

	public Compte(int idCompte, Collection<Journal> numCompte, com.bfi.meriam.produits.entities.PlanCompte planCompte,
			User email) {
		super();
		this.idCompte = idCompte;
		this.numCompte = numCompte;
		PlanCompte = planCompte;
		Email = email;
	}

	public Compte(Collection<Journal> numCompte, com.bfi.meriam.produits.entities.PlanCompte planCompte) {
		super();
		this.numCompte = numCompte;
		PlanCompte = planCompte;
	}

	public Compte() {
		super();
	}

	

}
