package persistence;

public class JPQL_BOX
{
    public static String jpqlLivreByGenre = "SELECT l " +
            "FROM Livre l " +
            "WHERE l.genre = :genre";
    public static String jpqlLivreByTitre = "SELECT l " +
            "FROM Livre l " +
            "WHERE l.titre = :titre";
    public static String jpqlLivreByAuteur = "SELECT l " +
        "FROM Livre l " +
        "WHERE l.auteur = :auteur";

    public static  String jpqlEmploye = "SELECT e " +
            "FROM Employe e " +
            "WHERE e.idEmploye = :idEmploye";

    public static   String jpqlBiblio = "SELECT b " +
            "FROM Bibliotheque b " +
            "WHERE b.nom = :nom";

    public static String jpql = "SELECT COUNT(a) " +
            "FROM Abonne a " +
            "WHERE a.email = :email";

    public static String jpqlAbonneExist = "SELECT COUNT(a) FROM Abonne a " +
            "WHERE a.nom = :nom AND a.email = :email";

}
