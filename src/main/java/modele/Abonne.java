package modele;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

    @Entity
    public class Abonne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAbonne;

    private String nom;

    private String prenom;

    private String email;

    private String adresse;


    @OneToMany(mappedBy = "abonne")
    private List<Emprunt> emprunts;

    // Constructeurs
    public Abonne() {}

    public Abonne(int idAbonne, String nom, String prenom, String email, String adresse) {
        this.idAbonne = idAbonne;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.emprunts = new ArrayList<>();
    }

    // Getters et Setters


    public int getIdAbonne() {
        return idAbonne;
    }

    public void setIdAbonne(int idAbonne) {
        this.idAbonne = idAbonne;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    @Override
    public String toString() {
        return "Abonne{" +
                "idAbonne=" + idAbonne +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", emprunts=" + emprunts +
                '}';
    }
}
