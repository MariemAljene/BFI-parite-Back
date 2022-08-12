package com.bfi.meriam.produits.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit implements Serializable {
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long idProduit ; 
private String nomProduit ; 
private Double Prix ; 
private Date DateCreation ;

public Long getIdProduit() {
	return idProduit;
}
public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}
public String getNomProduit() {
	return nomProduit;
}
public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}
public Double getPrix() {
	return Prix;
}
public void setPrix(Double prix) {
	Prix = prix;
}
public Date getDateCreation() {
	return DateCreation;
}
public void setDateCreation(Date dateCreation) {
	DateCreation = dateCreation;
}
@Override
public String toString() {
	return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", Prix=" + Prix + ", DateCreation="
			+ DateCreation + "]";
}
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public Produit(String nomProduit, Double prix, Date dateCreation) {
	super();
	this.nomProduit = nomProduit;
	Prix = prix;
	DateCreation = dateCreation;
}  

}
