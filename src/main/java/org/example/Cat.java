package org.example;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Cat extends Animal{
    private String chipId;

    public Cat() {
    }

    public Cat(LocalDate birth, String couleur, String chipId) {
        super(birth, couleur);
        this.chipId = chipId;
    }
//    public Cat(LocalDate birth, String couleur, String chipId) {
//        super(birth, couleur);
//        this.chipId = chipId;
//    }
}
