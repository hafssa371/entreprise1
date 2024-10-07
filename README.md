TRAVAIL A RENDRE : Gestion des employés
     Dans une petite entreprise, il y a cinq employés. Au sommet de la hiérarchie on trouve le directeur général. Sous le directeur on trouve un manager et un développeur, en outre deux développeurs travaillent sous la responsabilité du manager. On souhaite afficher les noms et les salaires des employés de haut en bas de la hiérarchie. Les travaux de l’équipe chargée de l’analyse et de la conception ont abouti au diagramme de classe suivant :
     
 ![image](https://github.com/user-attachments/assets/969a650c-6d49-400c-babe-0973fec5d825)

Figure 1 : Diagramme de classe.

 Partie I : Couche accès aux données

1. Base de données « entreprise »

•	Créez les tables « DirecteurGeneral », « Manager » et « Developpeur » 
 ![image](https://github.com/user-attachments/assets/1e450060-0226-44b9-8618-902e171c1256)

Figure 2 : Script pour créer la table " DirecteurGeneral ".

 ![image](https://github.com/user-attachments/assets/fcef9f14-8e01-49a5-add5-f374fd3c5c53)

Figure 3 : La table " DirecteurGeneral " est créée avec succès.

 ![image](https://github.com/user-attachments/assets/c539f690-53d8-440c-8779-9edde4c27067)

Figure 4 : Script pour créer la table " Manager ".

 ![image](https://github.com/user-attachments/assets/4fb11050-1837-4e15-891e-6f736d32cd46)

Figure 5 : S La table " Manager " est créée avec succès.
![image](https://github.com/user-attachments/assets/1a98b795-a416-401b-bbdf-5e6afb21050a)

 
Figure 6 : Script pour créer la table " Developpeur ".

 ![image](https://github.com/user-attachments/assets/dbf49352-5e78-483e-b230-84e87ad0aeb5)

Figure 7 : La table " Developpeur" est créée avec succès.


2. Fichier properties
   

•	Créez dans la racine de votre projet un fichier properties nommé base qui contient les informations de connexion à la base de données « entreprise »
 ![image](https://github.com/user-attachments/assets/7af9f72d-b721-4d4e-9015-07df5d832f63)

Figure 8 : Création du fichier properties.

 ![image](https://github.com/user-attachments/assets/048de27e-106e-4a60-a3c8-52c83775c357)

Figure 9 : Création du fichier properties "base.properties" avec succès.

3. Classe « Connexion »

•	Créez une classe « Connexion » permettant d’ouvrir une connexion à la base de données dans le package « ma.projet.connexion » 

 ![image](https://github.com/user-attachments/assets/881ec2b8-05b4-4c87-a6a5-0d7e5739389e)

Figure 9 : Script de la classe "Connexion".


4. Classes « Personne », « DirecteurGeneral », « Manager » et « Developpeur »

•	Créez les classes « Personne », « DirecteurGeneral », « Manager » et « Developpeur » dans le package « ma.projet.beans »
 
 
![image](https://github.com/user-attachments/assets/386abe2e-c0e4-4e98-9382-9b9ddbb5fcf3)
![image](https://github.com/user-attachments/assets/c147ffc1-543e-4e9d-b78b-9a2d30fa29d0)

Figure 10 : Script de la classe "Personne".

 ![image](https://github.com/user-attachments/assets/2f4504e1-a6d5-4ab9-a25e-bb113ebece61)

Figure 11 : Extrait de script de la classe "DirecteurGeneral".


 ![image](https://github.com/user-attachments/assets/a5ef941f-4449-4371-a6dd-d8ccd81b4a7e)

Figure 12 : Extrait de script de la classe "Manager".

![image](https://github.com/user-attachments/assets/37d15e5a-f37c-44f8-ab99-b6e7496ad13a)

Figure 13 : Extrait de script de la classe "Developpeur".


5. Interface « IDao »

•	Créez l’interface « IDao » suivante dans le package « ma.projet.dao »

 ![image](https://github.com/user-attachments/assets/fe4d9b15-a32c-4e48-be04-9f548015b71e)

Figure 14 : Script de création de l'interface "IDao".

6. Classes « Service »

•	Créez les classes « Service » qui implémente l’interface « IDao »
 
![image](https://github.com/user-attachments/assets/1f874d13-9d36-4b31-bfe7-e4c1d16ab4b0)

Figure 15 : Extrait de script de la classe "DeveloppeurService".

![image](https://github.com/user-attachments/assets/a804a0a6-bfee-429a-a671-1ba234f26d6c)

Figure 16 : Extrait de script de la classe "DirecteurGeneralService".

 ![image](https://github.com/user-attachments/assets/5b4c12bd-9008-4d4e-9d99-b8306a0ae199)

Figure 17 : Extrait de script de la classe "ManagerService".

7. Classe « Entreprise »
•	Créer une classe Entreprise pour tester les CRUD dans le package « ma.projet.test ». Dans cette classe :
1. Créer deux développeurs ; 
2. Créer manager qui gère les deux développeurs crées précédemment ; 
3. Créer un 3ème développeur ; 
4. Créer un directeur général qui gère le manager et le 3ème employé ; 
5. Afficher les noms et les salaires des employés de haut en bas de la hiérarchie.

![image](https://github.com/user-attachments/assets/42e41d07-348e-4d75-bf82-96f8270f7856)

Figure 18 : Script de la classe "Entreprise".

 ![image](https://github.com/user-attachments/assets/4b50aeef-2b45-44a6-81bb-046cd0c7a3bb)

Figure 19 : Résultat du test.

