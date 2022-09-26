package net.javaguides.sms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public String titulo;
	public String autor; 
	public String categoria; 
	public String editora; 
	public String qtdPagina; 
	public String capa; 
	public Double valor;
	
public Livro() {
		
	}

public Livro(String titulo, String autor, String categoria, String editora, String qtdPagina, String capa, Double valor) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	this.categoria = categoria;
	this.editora = editora;
	this.qtdPagina = qtdPagina;
	this.capa = capa;
	this.valor = valor;
}

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

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public String getEditora() {
	return editora;
}

public void setEditora(String editora) {
	this.editora = editora;
}

public String getQtdPagina() {
	return qtdPagina;
}

public void setQtdPagina(String qtdPagina) {
	this.qtdPagina = qtdPagina;
}

public String getCapa() {
	return capa;
}

public void setCapa(String capa) {
	this.capa = capa;
}

public Double getValor() {
	return valor;
}

public void setValor(Double valor) {
	this.valor = valor;
}


}
