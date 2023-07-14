package br.com.douglas.viagem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.douglas.viagem.model.User;
import br.com.douglas.viagem.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User insert(User obj) {
		return repository.insert(obj);

	}
}
