package com.tatyanajacques.dscommerce.services;

import com.tatyanajacques.dscommerce.entities.User;
import com.tatyanajacques.dscommerce.services.exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    public void validadeSelfOrAdmin(Long userId){
        User me = userService.authenticated();
        if(!me.hasRole("ROLE_ADMIN") && !me.getId().equals(userId)){
            throw  new ForbiddenException("Access denied.");


        }
    }
}
