package com.github.marrontan619.evetice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	private String id;

	@Column(name="user_name", nullable=false, length=128)
	String userName;

	@Column(name="password", nullable=false, length=32)
	String password;
}
