@login
Feature: Je souhaite verifier la page de connexion 
  ETQ utlisateur je souhaite vérifier la page de connexion
  
  Background:
  Given Je visite le site nopcommerce
    When Je saisis l'adresse mail "standard_user"
    And Je saisis le mot de passe "secret_sauce"
    And Je clique sur le bouton login 


  @login-valide
  Scenario: Connexion avec des donnees valides 
    Then Je me redirige vers la page home "Swag Labs"
    
   