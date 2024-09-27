package modele;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Bibliotheque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBibliotheque;

    private String nom;
    private String adresse;

    @ManyToMany
    @JoinTable(
            name = "Bibliotheque_Livre",
            joinColumns = @JoinColumn(name = "idBibliotheque"),
            inverseJoinColumns = @JoinColumn(name = "idLivre")
    )
    private List<Livre> livres;

    @OneToMany(mappedBy = "bibliotheque")
    private List<Employe> employes;

    public Bibliotheque(int idBibliotheque, String nom, String adresse, List<Livre> livres, List<Employe> employes) {
        this.idBibliotheque = idBibliotheque;
        this.nom = nom;
        this.adresse = adresse;
        this.livres = livres;
        this.employes = employes;
    }

    public Bibliotheque() {
    }

    public int getIdBibliotheque() {
        return idBibliotheque;
    }

    public void setIdBibliotheque(int id) {
        this.idBibliotheque = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "id=" + idBibliotheque +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
// comment Bib