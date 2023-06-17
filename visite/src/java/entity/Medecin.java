/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.annotations.Entity;

/**
 *
 * @author CE PC
 */

public class Medecin {

    private Integer codeMed;
    private String nomMed;
    private String prenomMed;
    private String gradeMed;
    
    
    private Set<Visiter> visiter = new HashSet<>();

    public Medecin() {
    }

    public Medecin(Integer codeMed, String nomMed, String prenomMed, String gradeMed) {
        this.codeMed = codeMed;
        this.nomMed = nomMed;
        this.prenomMed = prenomMed;
        this.gradeMed = gradeMed;
    }

    public Integer getCodeMed() {
        return codeMed;
    }

    public void setCodeMed(Integer codeMed) {
        this.codeMed = codeMed;
    }

    public String getNomMed() {
        return nomMed;
    }

    public void setNomMed(String nomMed) {
        this.nomMed = nomMed;
    }

    public String getPrenomMed() {
        return prenomMed;
    }

    public void setPrenomMed(String prenomMed) {
        this.prenomMed = prenomMed;
    }

    public String getGradeMed() {
        return gradeMed;
    }

    public void setGradeMed(String gradeMed) {
        this.gradeMed = gradeMed;
    }

    public Set<Visiter> getVisiter() {
        return visiter;
    }

    public void setVisiter(Set<Visiter> visiter) {
        this.visiter = visiter;
    }

    @Override
    public String toString() {
        return "Medecin{" + "codeMed=" + codeMed + ", nomMed=" + nomMed + ", prenomMed=" + prenomMed + ", gradeMed=" + gradeMed + ", visiter=" + visiter + '}';
    }

    
    
    

}
