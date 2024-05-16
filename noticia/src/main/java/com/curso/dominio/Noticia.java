package com.curso.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "noticias")
public class Noticia implements Serializable {

    @Id
    private String identificador;
    private String texto;
    private String autor;

    @OneToMany(mappedBy = "noticia")
    private List<Comentario> comentarioLista = new ArrayList<>();

    public Noticia() {
        super();
    }

    public Noticia(String identificador, String texto, String autor) {
        super();
        this.identificador = identificador;
        this.texto = texto;
        this.autor = autor;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Comentario> getComentarioLista() {
        return comentarioLista;
    }

    public void setComentarioLista(List<Comentario> comentarioLista) {
        this.comentarioLista = comentarioLista;
    }

    @Override
    public String toString() {
        return "Noticia [identificador=" + identificador + ", texto=" + texto + ", autor=" + autor + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, identificador, texto);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Noticia other = (Noticia) obj;
        return Objects.equals(autor, other.autor) && Objects.equals(identificador, other.identificador)
                && Objects.equals(texto, other.texto);
    }
}
