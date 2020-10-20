package com.example.tp5;

public class Contact {
    String nom;
    String prenom;
    String imageUrl;
    public Contact(String nom, String prenom, String imageUrl) {
        this.nom = nom;
        this.prenom = prenom;
        this.imageUrl = imageUrl;
    }

    public String getmLastName() {
        return nom;
    }

    public String getmFirstName() {
        return prenom;
    }

    public String getImageUrl() {
        return imageUrl;
    }



}
