package persistence;

import dataStore.Bibliotheque_PersistenceUnitInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.spi.PersistenceUnitInfo;
import modele.Bibliotheque;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;

public class Bibliotheque_DAO {

    EntityManagerFactory emf;
    EntityManager em;

    public Bibliotheque_DAO() {
        try{
        PersistenceUnitInfo pui = new Bibliotheque_PersistenceUnitInfo();
        this.emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(pui, new HashMap());
        this.em = emf.createEntityManager();}
        catch (Exception e){
            System.out.println("Erreur lors de la création du Factory");
        }
    }

    public Bibliotheque findBibliothequeByName(String nom){

        Query query = this.em.createQuery(JPQL_BOX.jpqlBiblio);
        query.setParameter("nom", nom);
       Bibliotheque result = (Bibliotheque) query.getSingleResult();
       return result;

    }
}
