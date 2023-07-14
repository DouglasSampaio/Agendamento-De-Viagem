package br.com.douglas.viagem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import br.com.douglas.viagem.model.User;

@RestController
@RequestMapping(value = "/v1/usuarios")
public class UserController {

	@PostMapping
	public ResponseEntity<User> insertUser(@RequestBody User user) {
		
		User response = new User();
		try {
		} catch (Exception e) {
			
		}
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(response);
	}
}
