package persistence;

import dataStore.Bibliotheque_PersistenceUnitInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.persistence.spi.PersistenceUnitInfo;
import modele.Abonne;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;

public class AbonneDAO {

    EntityManagerFactory emf;
    EntityManager em;

    public AbonneDAO() {

        try{
            PersistenceUnitInfo pui = new Bibliotheque_PersistenceUnitInfo();
            this.emf = new HibernatePersistenceProvider()
                    .createContainerEntityManagerFactory(pui, new HashMap());
            this.em = emf.createEntityManager();}
        catch (Exception e){
            System.out.println("Erreur lors de la création du Factory");
        }
    }

    public void addAbonne(String nom, String prenom, String email, String adresse) {

        EntityTransaction transaction = em.getTransaction();

        try {

            transaction.begin();

            if (email == null || email.isEmpty()) {
                System.out.println("L'email ne peut pas être vide.");
                transaction.rollback();
                return;
            } else {


            Abonne abonne = new Abonne();
            abonne.setNom(nom);
            abonne.setPrenom(prenom);
            abonne.setEmail(email);
            abonne.setAdresse(adresse);
            em.persist(abonne);

            transaction.commit();
            System.out.println("Abonné ajouté avec succès.");}

        } catch (Exception e) {
            transaction.rollback();
            System.out.println("L'abonné n'a pas été ajouté. Réessayez s'il vous plaît.");
            e.printStackTrace();
        }
    }

    public boolean doesAbonneExist(String nom, String email) {
        try {

            Query query = em.createQuery(JPQL_BOX.jpqlAbonneExist);
            query.setParameter("nom", nom);
            query.setParameter("email", email);

            long count = (long) query.getSingleResult();
            return count > 0;
        } catch (Exception e) {
            return false;
        }
    }


}

