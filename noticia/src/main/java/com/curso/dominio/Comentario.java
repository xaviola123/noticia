package com.curso.dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentarios")

public class Comentario implements Serializable {
	
	@Id
	private String titulo;
	private String autor;
	private LocalDate fecha;
	
	@OneToMany(mappedBy="comentario")
	private List<Noticia> noticiaLista = new ArrayList<Noticia>();
	
	
	public Comentario(String titulo, String autor, LocalDate fecha) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.fecha = fecha;
	}
	public Comentario() {
		super();
		// TODO Auto-generated constructor stub
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
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Comentario [titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(autor, fecha, titulo);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentario other = (Comentario) obj;
		return Objects.equals(autor, other.autor) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(titulo, other.titulo);
	}
	
	
	
}
