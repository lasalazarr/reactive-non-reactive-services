package org.ecjug.legacy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class LgacyUserRestService {

    @Autowired
    LegacyUserService legacyUserService;

    @GetMapping
    public UserDetails getUserDetails(){
         return legacyUserService.getUserById("1");
    }
}
