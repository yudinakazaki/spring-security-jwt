package com.br.yudinakazaki.springsecurityjwt.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.br.yudinakazaki.springsecurityjwt.model.User;

public interface UserRepository extends CrudRepository<User, String> {
  Optional<User> findByUsername(String username);
}
