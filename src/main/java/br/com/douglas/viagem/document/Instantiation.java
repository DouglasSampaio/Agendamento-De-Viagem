package br.com.douglas.viagem.document;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.douglas.viagem.model.User;
import br.com.douglas.viagem.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		User viagem1 = new User(null,1,"douglas","douglas@gmail.com","123");
		User viagem2 = new User(null,2,"douglas2","douglas2@gmail.com","123");

		userRepository.saveAll(Arrays.asList(viagem1,viagem2));
	}

}