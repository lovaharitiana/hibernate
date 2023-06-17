/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author CE PC
 */

public class Patient {

    private Integer codePat;
    private String nomPat;
    private String prenomPat;
    private String sexePat;
    private String adressePat;
    
   private Set<Visiter> visiter = new HashSet<>();

    public Patient() {
    }

    public Patient(Integer codePat, String nomPat, String prenomPat, String sexePat, String adressePat) {
        this.codePat = codePat;
        this.nomPat = nomPat;
        this.prenomPat = prenomPat;
        this.sexePat = sexePat;
        this.adressePat = adressePat;
    }

    public Integer getCodePat() {
        return codePat;
    }

    public void setCodePat(Integer codePat) {
        this.codePat = codePat;
    }

    public String getNomPat() {
        return nomPat;
    }

    public void setNomPat(String nomPat) {
        this.nomPat = nomPat;
    }

    public String getPrenomPat() {
        return prenomPat;
    }

    public void setPrenomPat(String prenomPat) {
        this.prenomPat = prenomPat;
    }

    public String getSexePat() {
        return sexePat;
    }

    public void setSexePat(String sexePat) {
        this.sexePat = sexePat;
    }

    public String getAdressePat() {
        return adressePat;
    }

    public void setAdressePat(String adressePat) {
        this.adressePat = adressePat;
    }

    public Set<Visiter> getVisiter() {
        return visiter;
    }

    public void setVisiter(Set<Visiter> visiter) {
        this.visiter = visiter;
    }

    @Override
    public String toString() {
        return "Patient{" + "codePat=" + codePat + ", nomPat=" + nomPat + ", prenomPat=" + prenomPat + ", sexePat=" + sexePat + ", adressePat=" + adressePat + ", visiter=" + visiter + '}';
    }

   
    
    

}
