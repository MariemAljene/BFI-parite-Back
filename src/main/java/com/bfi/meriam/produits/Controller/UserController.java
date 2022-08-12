package com.bfi.meriam.produits.Controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfi.meriam.produits.entities.User;
import com.bfi.meriam.produits.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	@PostMapping({"/registerNewUser"})
	public User registerNewUser(User user) {
		return userService.registerNewUser(user);
	}

	
	@PostConstruct
	public void initRoleAndUser() {
		userService.initRoleAndUser();
	    }
	
    @GetMapping({"/forAdmin"})
    @PreAuthorize("hasRole('Admin')")
    public String forAdmin(){
        return "Admin seulement";
    }

    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('superAdmin')")
    public String forUser(){
        return "super Admin";
    }
}
