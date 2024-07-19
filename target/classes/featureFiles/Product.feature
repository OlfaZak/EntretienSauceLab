@product
Feature: Je souhaire rechercher et ajouter un produit

  Background: 
   Given Je visite le site nopcommerce
    When Je saisis l'adresse mail "standard_user"
    And Je saisis le mot de passe "secret_sauce"
    And Je clique sur le bouton login
    Then Je me rederige vers la page home "Swag Labs"

  @ajoutProduit
  Scenario: Ajout d'un produit
    When Je clique sur le bouton Add to cart
    And  Je verifie l'ajout du produit "Sauce Labs Backpack"
    And  je click sur le panier 
    And  Je clique sur le bouton Chekout
    And  Je saisie le Prenom " Olfa"
    And  Je saisie le nom "Zakhama"
    And je saisie le code Postal "2300"
    And je clique sur le bouton Continue
    And  je verifie le prix de produit "$29.99"
    And  Je click sur le bouton finish
    And  Je clique sur le bouton backhome
    And  Je clique sur le burger menu
    And Je clique sur le bouton logout
    
   

