package persistence;

import dataStore.Bibliotheque_PersistenceUnitInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.spi.PersistenceUnitInfo;
import modele.Employe;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;

public class Employe_DAO {

    EntityManagerFactory emf;
    EntityManager em;

    public Employe_DAO(){
        try{
            PersistenceUnitInfo pui = new Bibliotheque_PersistenceUnitInfo();
            this.emf = new HibernatePersistenceProvider()
                    .createContainerEntityManagerFactory(pui, new HashMap());
            this.em = emf.createEntityManager();}
        catch (Exception e){
            System.out.println("Erreur lors de la création du Factory");
        }
    }

    public Employe findEmployeById(int idEmploye){

        Query query= this.em.createQuery(JPQL_BOX.jpqlEmploye);
        query.setParameter("idEmploye", idEmploye);
        Employe employe= (Employe) query.getSingleResult();
        return employe;
    }
}
