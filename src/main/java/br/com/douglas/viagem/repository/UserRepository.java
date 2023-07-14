package br.com.douglas.viagem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.douglas.viagem.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
