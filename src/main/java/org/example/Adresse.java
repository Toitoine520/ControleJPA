package org.example;

import javax.persistence.*;

//@Embeddable
@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String rue;
    private String zipCode;
    private String ville;

    public Adresse() {
    }

    public Adresse(String nombre, String rue, String zipCode, String ville) {
        this.nombre = nombre;
        this.rue = rue;
        this.zipCode = zipCode;
        this.ville = ville;
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

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", rue='" + rue + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
