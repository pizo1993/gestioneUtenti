package com.thespringside.gestioneutenti.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Utente {
	
	// si definiscono i due ruoli gestiti dall'applicazione
	public enum Role {
		ROLE_USER, ROLE_ADMIN
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	private String username;
	
	private String password;
	
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCreazione;
	
	 @Enumerated(EnumType.STRING)
	 private Role role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
