CREATE TABLE Bibliotheque (
                              idBibliotheque INT PRIMARY KEY AUTO_INCREMENT,
                              nom VARCHAR(255) NOT NULL,
                              adresse VARCHAR(255) NOT NULL
);

CREATE TABLE Employe (
                         idEmploye INT PRIMARY KEY AUTO_INCREMENT,
                         nom VARCHAR(255) NOT NULL,
                         prenom VARCHAR(255) NOT NULL,
                         poste VARCHAR(255) NOT NULL,
                         dateEmbauche DATE,
                         idBibliotheque INT,
                         FOREIGN KEY (idBibliotheque) REFERENCES Bibliotheque(idBibliotheque)
);

CREATE TABLE Livre (
                       idLivre INT PRIMARY KEY AUTO_INCREMENT,
                       titre VARCHAR(255) NOT NULL,
                       auteur VARCHAR(255) NOT NULL,
                       genre VARCHAR(255),
                       anneePublication INT,
                       idBibliotheque INT,
                       FOREIGN KEY (idBibliotheque) REFERENCES Bibliotheque(idBibliotheque)
);

CREATE TABLE Abonne (
                        idAbonne INT PRIMARY KEY AUTO_INCREMENT,
                        nom VARCHAR(255) NOT NULL,
                        prenom VARCHAR(255) NOT NULL,
                        email VARCHAR(255) NOT NULL,
                        adresse VARCHAR(255)
);

CREATE TABLE Emprunt (
                         idEmprunt INT PRIMARY KEY AUTO_INCREMENT,
                         dateEmprunt DATE,
                         dateRetour DATE,
                         idLivre INT,
                         idAbonne INT,
                         FOREIGN KEY (idLivre) REFERENCES Livre(idLivre),
                         FOREIGN KEY (idAbonne) REFERENCES Abonne(idAbonne)
);
