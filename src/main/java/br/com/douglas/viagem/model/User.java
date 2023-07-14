package br.com.douglas.viagem.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private int idUser;
	private String nome;
	private String email;
	private String senha;
	
}
