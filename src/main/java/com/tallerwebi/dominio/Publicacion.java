package com.tallerwebi.dominio;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Publicacion implements Comparable<Publicacion> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String contenido;
    private String img;
    private LocalDateTime fechaCreacion;
    private String fechaFormateada;
    @ManyToOne
    private Usuario usuario;

    public Publicacion() {}

    @Override
    public int compareTo(Publicacion otraPublicacion) {return otraPublicacion.getFechaCreacion().compareTo(this.fechaCreacion);}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getContenido() {return contenido;}
    public void setContenido(String contenido) {this.contenido = contenido;}

    public String getImg () {return img;}
    public void setImg(String img) {this.img = img;}   

    public LocalDateTime getFechaCreacion() {return fechaCreacion;}
    public void setFechaCreacion(LocalDateTime fechaCreacion) {this.fechaCreacion = fechaCreacion;}  
    
    public String getFechaFormateada() {return fechaFormateada;}
    public void setFechaFormateada(String fechaFormateada) {this.fechaFormateada = fechaFormateada;}    

    public Usuario getUsuario() {return usuario;}
    public void setUsuario(Usuario usuario) {this.usuario = usuario;}
    
}
