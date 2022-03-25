package org.example;

import org.example.Animal;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String managerName;

    @OneToMany(mappedBy = "petStore")
    private Set<Animal> animaux;


    @ManyToMany
    @JoinTable(name = "pro_pstore",
            joinColumns = @JoinColumn(name="id_pro", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_pstore", referencedColumnName = "id")
    )
    private Set<Product> products;

//    private Adresse adresse;

    public PetStore() {
    }

    public PetStore(String name, String managerName) {
        this.name = name;
        this.managerName = managerName;
    }

    public void addAnimal(Animal a){
        if(this.animaux == null){
            this.animaux = new HashSet<>();
        }

        this.animaux.add(a);
    }

    public void addProduct(Product p){
        if(this.products == null){
            this.animaux = new HashSet<>();
        }

        this.products.add(p);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "org.example.PetStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
