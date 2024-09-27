package service;
import modele.Livre;

import persistence.Livre_DAO;

import java.util.List;

public class LivreService {
    Livre_DAO dao= new Livre_DAO();

    public LivreService(Livre_DAO dao) {
        this.dao = dao;
    }
    public List<Livre> FindLivreByTitre(String titre){

        return dao.findLivreByTitre(titre);
    }
    public List<Livre> FindLivreByCat(String genre){

        return dao.findLivreByGenre(genre);
    }
    public List<Livre> FindLivreByAuteur(String auteur){

        return dao.findLivreByAuteur(auteur);
    }
}
