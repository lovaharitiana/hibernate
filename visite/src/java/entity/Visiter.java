/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CE PC
 */
public class Visiter {

    private Integer id;
    private Medecin medecin;
    private Patient patient;
    private Date date;

    public Visiter() {
    }

    public Visiter(Integer id, Medecin medecin, Patient patient, Date date) {
        this.id = id;
        this.medecin = medecin;
        this.patient = patient;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = dateFormat.format(date);
        return "Visiter{" + "id=" + id + ", medecin=" + medecin + ", patient=" + patient + ", date=" + dateString + '}';
    }

}
