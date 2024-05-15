package org.serratec.backend.h2banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Preencha o titulo")
	@Size(max = 20)
	@Column(nullable = false, length = 20)
	private String titulo;

	@NotBlank(message = "Preencha as informacoes")
	@Size(max = 30)
	@Column(nullable = false, length = 30)
	private String informacoes;


	@Embedded
	private InformacaoPubli informacaoPubli;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

	public InformacaoPubli getInformacaoPubli() {
		return informacaoPubli;
	}

	public void setInformacaoPubli(InformacaoPubli informacaoPubli) {
		this.informacaoPubli = informacaoPubli;
	}
	
	

}
