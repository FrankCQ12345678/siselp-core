package edu.elp.siselp.entity;

import javax.persistence.*;

@Entity
@Table(name = "administrador")
@Inheritance( strategy =  InheritanceType.JOINED)
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "idadministrador")
    private Long idadministrador;
    @Column(name = "encargado", length = 50, nullable = false)
    private String encargado;
    @Column( name = "carrera" , length = 100, nullable = false)
    private String carrera;
    @Column( name = "edad" , length = 100)
    private String edad;

    public Administrador(Long idadministrador) {
        this.idadministrador = idadministrador;
    }

    public Administrador() {
    }

    public Administrador(Long idadministrador, String encargado, String carrera, String edad) {
        this.idadministrador = idadministrador;
        this.encargado = encargado;
        this.carrera = carrera;
        this.edad = edad;
    }

    public Long getIdadministrador() {
        return idadministrador;
    }

    public void setIdadministrador(Long idadministrador) {
        this.idadministrador = idadministrador;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
