package persistence;

import dataStore.Bibliotheque_PersistenceUnitInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.spi.PersistenceUnitInfo;
import modele.Livre;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.List;

public class Livre_DAO {

    EntityManagerFactory emf;
    EntityManager em;

    public Livre_DAO() {
        try{
            PersistenceUnitInfo pui = new Bibliotheque_PersistenceUnitInfo();
            this.emf = new HibernatePersistenceProvider()
                    .createContainerEntityManagerFactory(pui, new HashMap());
            this.em = emf.createEntityManager();}
        catch (Exception e){
            System.out.println("Erreur lors de la création du Factory");
        }
    }
    public List<Livre> findLivreByGenre(String genre) {

        Query query = this.em.createQuery(JPQL_BOX.jpqlLivreByGenre);
        query.setParameter("genre", genre);
        List<Livre> listLivre1 = query.getResultList();
        return listLivre1;
    }

    public List<Livre> findLivreByTitre(String titre){

        Query query = this.em.createQuery(JPQL_BOX.jpqlLivreByTitre);
        query.setParameter("titre", titre);
        List<Livre> listLivre2 = query.getResultList();
        return listLivre2;
    }

    public List<Livre> findLivreByAuteur(String auteur){

        Query query = this.em.createQuery(JPQL_BOX.jpqlLivreByAuteur);
        query.setParameter("auteur", auteur);
        List<Livre> listLivre3 = query.getResultList();
        return listLivre3;
    }
}
