package view;

import modele.Bibliotheque;
import modele.Employe;
import modele.Livre;
import persistence.AbonneDAO;
import persistence.Bibliotheque_DAO;
import persistence.Employe_DAO;
import persistence.Livre_DAO;
import service.AbonneService;
import service.BibliothequeService;
import service.EmployeService;
import service.LivreService;

import java.util.List;

public class ConsoleUI {
    public static void main(String[] args) {
/*

            // Test Acces à la table Bibliotheque:

        System.out.println("recherche Bibliotheque par nom!!!!!!!!!!!");

        Bibliotheque_DAO daoBib=new Bibliotheque_DAO();
        BibliothequeService serviceBib=new BibliothequeService(daoBib);
        Bibliotheque bibliotheque= serviceBib.FindBibliothequeByName("Bibliothèque Historique");

            System.out.println(bibliotheque);

            // Test Acces à la table Employe:

        System.out.println("recherche Employe par Id!!!!!!!!!!!");
        Employe_DAO daoEmp = new Employe_DAO();
        EmployeService serviceEmp= new EmployeService(daoEmp);
        Employe employe= serviceEmp.findEmployeById(5);

        System.out.println(employe);

        // Test acces à la table Livre:
        System.out.println("rechercher un livre!!!!!!!!!!!");

        Livre_DAO daoLiv = new Livre_DAO();
        LivreService serviceLiv= new LivreService(daoLiv);
        // livre By Titre:

        List<Livre> listLivreParTitre= serviceLiv.FindLivreByTitre("Le Rouge et le Noir");
        System.out.println(listLivreParTitre);

        // livre By Genre:

        List<Livre> listLivreParGenre= serviceLiv.FindLivreByCat("Roman");
        System.out.println(listLivreParGenre);

        // livre By Auteur:
        List<Livre> listLivreParAuteur= serviceLiv.FindLivreByAuteur("Albert Camus");
        System.out.println(listLivreParAuteur);*/

        // Ajout d'un abonnée
System.out.println("ajoutAbonnée!!!!!");
        AbonneDAO abonneDao= new AbonneDAO();
        AbonneService serviceAbonne= new AbonneService(abonneDao);
        serviceAbonne.addAbonne("Tl ","Jo","joud6@gail.Com","1030 rue Salaberry, Montréal");
System.out.println("félicitation succées!!!!!");
    }
}
