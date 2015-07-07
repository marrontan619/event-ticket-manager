package com.github.marrontan619.evetike.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.github.marrontan619.evetike.model.Users;

public interface UsersRepository extends CrudRepository<Users, String> {

	List<Users> findByUserName(String userName);
}
