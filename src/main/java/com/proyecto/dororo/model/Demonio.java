package com.proyecto.dororo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Demonio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String partedelcuerpo;
    private String lugar;
    private String foto;

    public Demonio() {
    }

    public Demonio(Long id, String nombre, String partedelcuerpo, String lugar, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.partedelcuerpo = partedelcuerpo;
        this.lugar = lugar;
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartedelcuerpo() {
        return partedelcuerpo;
    }

    public void setPartedelcuerpo(String partedelcuerpo) {
        this.partedelcuerpo = partedelcuerpo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString(){
        return "Demonio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", partedelcuerpo='" + partedelcuerpo + '\'' +
                ", lugar='" + lugar + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
