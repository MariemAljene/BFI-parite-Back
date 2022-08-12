package com.bfi.meriam.produits.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bfi.meriam.produits.entities.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {


}
