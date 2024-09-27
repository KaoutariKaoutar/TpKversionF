INSERT INTO Bibliotheque (nom, adresse) VALUES
                                            ('Bibliothèque Centrale', '123 Rue Principale'),
                                            ('Bibliothèque des Sciences', '45 Avenue des Sciences'),
                                            ('Bibliothèque Littéraire', '78 Boulevard des Lettres'),
                                            ('Bibliothèque Historique', '12 Rue de l Histoire'),
                                            ('Bibliothèque Technologique', '56 Route de la Technologie');

INSERT INTO Employe (nom, prenom, poste, dateEmbauche, idBibliotheque) VALUES
                                                                           ('Dupont', 'Jean', 'Bibliothécaire', '2022-01-15', 1),
                                                                           ('Martin', 'Sophie', 'Archiviste', '2021-07-23', 2),
                                                                           ('Lefevre', 'Thomas', 'Gestionnaire', '2020-05-30', 3),
                                                                           ('Durand', 'Marie', 'Assistant', '2023-02-10', 4),
                                                                           ('Moreau', 'Alice', 'Responsable', '2019-11-19', 5);

INSERT INTO Abonne (nom, prenom, email, adresse) VALUES
                                                     ('Bernard', 'Luc', 'luc.bernard@example.com', '24 Rue des Fleurs'),
                                                     ('Petit', 'Clara', 'clara.petit@example.com', '67 Rue des Jardins'),
                                                     ('Garcia', 'Emilie', 'emilie.garcia@example.com', '89 Avenue des Champs'),
                                                     ('Roux', 'Paul', 'paul.roux@example.com', '34 Boulevard des Arts'),
                                                     ('Morel', 'Julie', 'julie.morel@example.com', '78 Rue de la Liberte');

INSERT INTO Livre (titre, auteur, genre, anneePublication, idBibliotheque) VALUES
                                                                               ('Les Miserables', 'Victor Hugo', 'Roman', 1862, 1),
                                                                               ('1984', 'George Orwell', 'Science-fiction', 1949, 1),
                                                                               ('Le Petit Prince', 'Antoine de Saint-Exupery', 'Conte', 1943, 2),
                                                                               ('LEtranger', 'Albert Camus', 'Roman', 1942, 3),
                                                                               ('La Peste', 'Albert Camus', 'Roman', 1947, 3),
                                                                               ('Germinal', 'Emile Zola', 'Roman', 1885, 4),
                                                                               ('Le Rouge et le Noir', 'Stendhal', 'Roman', 1830, 4),
                                                                               ('Madame Bovary', 'Gustave Flaubert', 'Roman', 1857, 5),
                                                                               ('Crime et Chatiment', 'Fiodor Dostoievski', 'Roman', 1866, 5),
                                                                               ('La Metamorphose', 'Franz Kafka', 'Nouvelle', 1915, 2);


INSERT INTO Emprunt (dateEmprunt, dateRetour, idLivre, idAbonne) VALUES
                                                                     ('2024-01-10', '2024-01-20', 1, 1),
                                                                     ('2024-02-15', '2024-02-25', 2, 1),
                                                                     ('2024-03-01', '2024-03-11', 3, 1),

                                                                     ('2024-01-12', '2024-01-22', 4, 2),
                                                                     ('2024-02-20', '2024-03-02', 5, 2),
                                                                     ('2024-03-05', '2024-03-15', 6, 2),

                                                                     ('2024-01-14', '2024-01-24', 7, 3),
                                                                     ('2024-02-25', '2024-03-07', 8, 3),
                                                                     ('2024-03-08', '2024-03-18', 9, 3),

                                                                     ('2024-01-16', '2024-01-26', 10, 4),
                                                                     ('2024-02-28', '2024-03-10', 1, 4),
                                                                     ('2024-03-12', '2024-03-22', 2, 4),

                                                                     ('2024-01-18', '2024-01-28', 3, 5),
                                                                     ('2024-03-01', '2024-03-11', 4, 5),
                                                                     ('2024-03-14', '2024-03-24', 5, 5);

