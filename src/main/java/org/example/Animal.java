package org.example;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate birth;
    private String couleur;

    @ManyToOne
    @JoinColumn(name = "id_pstore")
    private PetStore petStore;

    public Animal() {
    }

    public Animal(LocalDate birth, String couleur) {
        this.birth = birth;
        this.couleur = couleur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", birth=" + birth +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
