# TP_SIR_mongodb
Quelles sont les limites d'une BDD orientées document ?


- Compatibilité des requêtes :
  Certaines requêtes qui semblent "classiques" en SQL ne sont pas forcément disponible en NOSQL.

- Propriétés ACID  non respectés :
  ACID (Atomicité, Cohérence, Isolation, Durabilité) ne sont parfois pas respecté dans le NOSQL. 



Mémo des commandes mongod : 

- show dbs : liste le noms des bases de données
- use nomdelabase : permet de "rentrer" dans la base
- show collections : permet de lister les collections de nomdelabase
- db.nomdelacollection.find() : permet de lister toutes les données de la collection
   exemple : db.Address.find()
- db.Address.find({‘city’: ‘Some city’ })
