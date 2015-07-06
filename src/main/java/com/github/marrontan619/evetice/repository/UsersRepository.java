package com.github.marrontan619.evetice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.github.marrontan619.evetice.model.Users;

public interface UsersRepository extends CrudRepository<Users, String> {

    List<Users> findById(String id);

}
