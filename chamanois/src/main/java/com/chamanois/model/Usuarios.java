package com.chamanois.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	private String nomeUsuario;
	private String cpfUsuario;
	private String enderecoUsuario;
	private String telefoneUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	
	@ManyToMany(mappedBy = "usuarios", cascade = { CascadeType.ALL })
	private Set<Produtos> produtos = new HashSet<>();
	
	public Usuarios() {
		
	}

	public Usuarios(Long idUsuario, String nomeUsuario, String cpfUsuario, String enderecoUsuario,
			String telefoneUsuario, String emailUsuario, String senhaUsuario, Set<Produtos> produtos) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.cpfUsuario = cpfUsuario;
		this.enderecoUsuario = enderecoUsuario;
		this.telefoneUsuario = telefoneUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.produtos = produtos;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public String getEnderecoUsuario() {
		return enderecoUsuario;
	}

	public void setEnderecoUsuario(String enderecoUsuario) {
		this.enderecoUsuario = enderecoUsuario;
	}

	public String getTelefoneUsuario() {
		return telefoneUsuario;
	}

	public void setTelefoneUsuario(String telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public Set<Produtos> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Produtos> produtos) {
		this.produtos = produtos;
	}
		
}
