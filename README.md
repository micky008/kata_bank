# kata_bank
Voici le kata pour le projet bank.

Le code est en anglais, sauf les commentaires.   
Pourquoi ?  
Car ce ne sont pas des commentaires pour le code, mais pour la "correction".

Le diagramme UML n'est pas tout à fait en adéquation avec le code, c'est surtout du manque du temps.
Même si les 45min pouvaient être dépassées, je me suis fixé une limite de 1h30. 

## Ma démarche

Je suis parti des User story et des recommandations.  
Ce qui fait que j'ai crée 3 entités :   
- Customer  
- Account  
- Transaction  

J'ai mis transaction dans le package business car c'est une entité peu orthodoxe.  
Elle sauvegarde les transactions. 

Ensuite j'ai créé les Services et les DAO de chaque entité. 
Pour cet exemple je simule des données en bdd.  
Si on voulait utiliser une vraie BDD il suffit de changer FactoryDAO, et de mettre un init dans le Main,  
puis de créer les nouveaux DAO en n’oubliant pas d'implanter les interfaces CustomerDAO,AccountDAO et TransactionDAO.

Une fois la limite de temps dépassée, je me suis aperçu que l'enum Balance devait être des objets purs et durs. 
l'objet Deposit et Withdrawal.  

J'ai implémenté le fait qu'il y a un découvert autorisé et un plafond maximum [par exemple sur un livret A].

## Bonus 
Si je devais utiliser une vrai BDD, je me serrai appuyé sur mon propre travail : DAOProject.
C’est un ORM de mon cru. Bien sur il n’est pas fini, et les requêtes ne sont pas sécurisées, mais c’est un bon départ :)


Merci.





