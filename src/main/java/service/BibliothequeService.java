package service;

import modele.Bibliotheque;
import persistence.Bibliotheque_DAO;

public class BibliothequeService {

    Bibliotheque_DAO bibliothequeDao = new Bibliotheque_DAO();

    public BibliothequeService(Bibliotheque_DAO bibliothequeDao) {
        this.bibliothequeDao = bibliothequeDao;
    }

    public Bibliotheque FindBibliothequeByName(String name){
        return bibliothequeDao.findBibliothequeByName(name);
    }
}
