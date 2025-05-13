package com.example.jwtauth.config;

import com.example.jwtauth.model.ERole;
import com.example.jwtauth.model.Role;
import com.example.jwtauth.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;

    public DatabaseInitializer(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Initialize default roles
        for (ERole role : ERole.values()) {
            try {
                if (!roleRepository.findByName(role).isPresent()) {
                    roleRepository.save(new Role(role));
                }
            } catch (Exception e) {
                // Role already exists
                System.out.println("Role already exists: " + role.name());
            }
        }
    }
}