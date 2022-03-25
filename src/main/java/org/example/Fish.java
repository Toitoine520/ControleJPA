package org.example;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Fish extends Animal{
    private FishLivEnv livingEnv;

    public Fish() {
    }

    public Fish(LocalDate birth, String couleur, FishLivEnv livingEnv) {
        super(birth, couleur);
        this.livingEnv = livingEnv;
    }
}
