package com.bfi.meriam.produits.service;
import com.bfi.meriam.produits.entities.Role;
import com.bfi.meriam.produits.entities.User;
import com.bfi.meriam.produits.repos.RoleDao;
import com.bfi.meriam.produits.repos.UserRepository;



import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bfi.meriam.produits.*;

@Service
public class UserService {
	@Autowired
	private UserRepository userDao;
	@Autowired
	private PasswordEncoder passwordEncoder;

	
    @Autowired
    private RoleDao RoleDao;


   
    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("admin");
        adminRole.setRoleDescription("Admin role");
        RoleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("Superadmin");
        userRole.setRoleDescription("can do what ever he wants");
        RoleDao.save(userRole);

        User adminUser = new User();
        adminUser.setEmail("IMEN@bfigroupe.com");
        adminUser.setPassword(getEncodedPassword("Superadmin"));
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(userRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);
        
        User guichUser = new User();
        guichUser.setEmail("sarah@bfigroupe.com");
        guichUser.setPassword(getEncodedPassword("admin"));
        Set<Role> guichRoles = new HashSet<>();
        guichRoles.add(adminRole);
        guichUser.setRole(guichRoles);
        userDao.save(guichUser);

    }

   
    public User registerNewUser(User user) {
        Role role = RoleDao.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setPassword(user.getPassword());

        return userDao.save(user);
    }
    public String getEncodedPassword(String password)
    {return passwordEncoder.encode(password);
    	
    }
    
}
