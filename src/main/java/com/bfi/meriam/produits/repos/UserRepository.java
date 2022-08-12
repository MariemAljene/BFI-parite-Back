package com.bfi.meriam.produits.repos;
import com.bfi.meriam.produits.entities.User;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bfi.meriam.produits.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
	

}

