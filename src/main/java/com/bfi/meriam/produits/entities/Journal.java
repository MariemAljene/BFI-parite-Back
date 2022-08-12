package com.bfi.meriam.produits.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity  

public class Journal {
	
@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
private int idJournal ;  
@ManyToOne
private Compte numCompte  ; 
@Temporal(TemporalType.DATE)
private Date DateTransaction=new Date (System.currentTimeMillis() ); 
private String libelle ; 
private float debit ; 
private float credit;
public int getIdJournal() {
	return idJournal;
}
public void setIdJournal(int idJournal) {
	this.idJournal = idJournal;
}



public Compte getNumCompte() {
	return numCompte;
}
public void setNumCompte(Compte numCompte) {
	this.numCompte = numCompte;
}
public Date getDateTransaction() {
	return DateTransaction;
}
public void setDateTransaction(Date dateTransaction) {
	DateTransaction = dateTransaction;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public float getDebit() {
	return debit;
}
public void setDebit(float debit) {
	this.debit = debit;
}
public float getCredit() {
	return credit;
}
public void setCredit(float credit) {
	this.credit = credit;
}

@Override
public String toString() {
	return "Journal [idJournal=" + idJournal + ", numCompte=" + numCompte + ", DateTransaction=" + DateTransaction
			+ ", libelle=" + libelle + ", debit=" + debit + ", credit=" + credit + "]";
}

public Journal(Compte numCompte, Date dateTransaction, String libelle, float debit, float credit) {
	super();
	this.numCompte = numCompte;
	DateTransaction = dateTransaction;
	this.libelle = libelle;
	this.debit = debit;
	this.credit = credit;
}
public Journal(int idJournal, Compte numCompte, Date dateTransaction, String libelle, float debit,
		float credit) {
	super();
	this.idJournal = idJournal;
	this.numCompte = numCompte;
	DateTransaction = dateTransaction;
	this.libelle = libelle;
	this.debit = debit;
	this.credit = credit;
}
public Journal() {
	super();
}



}
