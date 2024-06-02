package org.ecjug.legacy.service;

import org.springframework.stereotype.Service;

@Service
public class LegacyUserService {
    public UserDetails getUserById(String id) {
        // Simulate fetching user from a database
        return new UserDetails(id, "Alberto Salazar");
    }
}
