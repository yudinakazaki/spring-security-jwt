package com.br.yudinakazaki.springsecurityjwt;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public String authenticate() {
      return "token";
    }
}
