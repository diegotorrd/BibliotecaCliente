/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author Diego Torres
 */
@XmlRootElement
public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private String genero;
    private String pais;
    private String publicacion;
    private int paginas;
    private String imagen;
    private String estado;

   
    public Libro(String id, String titulo, String autor, String genero, String pais, String publicacion, int paginas, String imagen, String estado) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.pais = pais;
        this.publicacion = publicacion;
        this.paginas = paginas;
        this.imagen = imagen;
        this.estado = estado;
    }
    
        public Libro() {
            super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
