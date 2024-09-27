package modele;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
    public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmploye;

    private String nom;

    private String prenom;

    private String poste;

    private Date dateEmbauche;

    @ManyToOne
    @JoinColumn(name = "idBibliotheque")
    private Bibliotheque bibliotheque;


    // Constructeurs

    public Employe() {}

    public Employe(int idEmploye, String nom, String prenom, String poste, Date dateEmbauche, Bibliotheque bibliotheque) {
        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.dateEmbauche = dateEmbauche;
        this.bibliotheque = bibliotheque;
    }

    // Getters et Setters

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Bibliotheque getBibliotheque() {
        return bibliotheque;
    }

    public void setBibliotheque(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "idEmploye=" + idEmploye +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", poste='" + poste + '\'' +
                ", dateEmbauche=" + dateEmbauche +
                '}';
    }
}
