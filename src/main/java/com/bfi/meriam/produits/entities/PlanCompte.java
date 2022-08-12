package com.bfi.meriam.produits.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PlanCompte {
@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
private int idPlan ;  
@OneToMany(mappedBy = "PlanCompte")
private Collection <Compte> compte ;
public int getIdPlan() {
	return idPlan;
}
public void setIdPlan(int idPlan) {
	this.idPlan = idPlan;
}
@JsonIgnore
@OneToMany(mappedBy = "PlanCompte")
public Collection<Compte> getCompte() {
	return compte;
}
public void setCompte(Collection<Compte> compte) {
	this.compte = compte;
}
public PlanCompte(int idPlan, Collection<Compte> compte) {
	super();
	this.idPlan = idPlan;
	this.compte = compte;
}
public PlanCompte() {
	super();
}



}
