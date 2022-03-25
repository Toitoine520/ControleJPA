import org.example.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class TestAnimalerie {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("petstore");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        et.begin();

        PetStore pst1 = new PetStore("GifiPet", "GREGOIRE");
        em.persist(pst1);

        PetStore pst2 = new PetStore("Petoilesdents", "JAURICE");
        em.persist(pst2);

        PetStore pst3 = new PetStore("Le Pet Rolier", "JEANCHARLES");
        em.persist(pst3);



        Product prod1 = new Product("red-506", "prod_prod1", ProdType.FOOD, 25.50);
        em.persist(prod1);

        Product prod2 = new Product("blu-907", "prod_duit3", ProdType.ACCESSORY, 45.90);
        em.persist(prod2);

        Product prod3 = new Product("yel-302", "duit_prod2", ProdType.CLEANING, 150.99);
        em.persist(prod3);


        Animal a1 = new Cat(LocalDate.of(2020, 12, 18), "gris", "56");
        em.persist(a1);
        pst1.addAnimal(a1);
        em.merge(pst1);

        Animal a2 = new Animal(LocalDate.of(2021, 5, 27), "brun");
        em.persist(a2);
        pst2.addAnimal(a2);
        em.merge(pst2);

        Animal a3 = new Fish(LocalDate.of(2018, 9, 7), "rouge", FishLivEnv.FRESH_WATER);
        em.persist(a3);
        pst3.addAnimal(a3);
        em.merge(pst3);


//        Adresse ad1 = new Adresse("5", "rue du general santain", "6215", "St Jauvain");
//        Adresse ad2 = new Adresse("15", "Boulevard de Javissaux", "1826", "Causse");
//        Adresse ad3 = new Adresse("105", "Quartier quatorze", "6927", "Maritain");


        em.close();
        emf.close();

    }
}
