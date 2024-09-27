package modele;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLivre;

    private String titre;
    private String auteur;
    private String genre;
    private int anneePublication;

    @ManyToOne
    @JoinColumn(name = "idBibliotheque")
    private Bibliotheque bibliotheque;

    @OneToMany(mappedBy = "livre")
    private List<Emprunt> emprunts;

    // Constructeurs

    public Livre() {}

    public Livre(int idLivre, String titre, String auteur, String genre, int anneePublication, Bibliotheque bibliotheque) {
        this.idLivre = idLivre;
        this.titre = titre;
        this.auteur = auteur;
        this.genre = genre;
        this.anneePublication = anneePublication;
        this.bibliotheque = bibliotheque;
        this.emprunts = new ArrayList<>();
    }

    // Getters et Setters

    public int getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(int idLivre) {
        this.idLivre = idLivre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public Bibliotheque getBibliotheque() {
        return bibliotheque;
    }

    public void setBibliotheque(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "idLivre=" + idLivre +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", genre='" + genre + '\'' +
                ", anneePublication=" + anneePublication +
                '}';
    }
}

