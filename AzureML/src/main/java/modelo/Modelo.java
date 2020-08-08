/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author L8
 */
public class Modelo {
    
    private int Embarazos;
    private int Glucosa;
    private int Presion_sanguinea;
    private int Pliegue_cutaneo;
    private int Insulina;
    private int IMC;
    private double Pedigri_diabetes;
    private int edad;
    private String Diabetes;
    private String scored_label;
    private double scored_probabilities;

    public int getEmbarazos() {
        return Embarazos;
    }

    public void setEmbarazos(int Embarazos) {
        this.Embarazos = Embarazos;
    }

    public int getGlucosa() {
        return Glucosa;
    }

    public void setGlucosa(int Glucosa) {
        this.Glucosa = Glucosa;
    }

    public int getPresion_sanguinea() {
        return Presion_sanguinea;
    }

    public void setPresion_sanguinea(int Presion_sanguinea) {
        this.Presion_sanguinea = Presion_sanguinea;
    }

    public int getPliegue_cutaneo() {
        return Pliegue_cutaneo;
    }

    public void setPliegue_cutaneo(int Pliegue_cutaneo) {
        this.Pliegue_cutaneo = Pliegue_cutaneo;
    }

    public int getInsulina() {
        return Insulina;
    }

    public void setInsulina(int Insulina) {
        this.Insulina = Insulina;
    }

    public int getIMC() {
        return IMC;
    }

    public void setIMC(int IMC) {
        this.IMC = IMC;
    }

    public double getPedigri_diabetes() {
        return Pedigri_diabetes;
    }

    public void setPedigri_diabetes(double Pedigri_diabetes) {
        this.Pedigri_diabetes = Pedigri_diabetes;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDiabetes() {
        return Diabetes;
    }

    public void setDiabetes(String Diabetes) {
        this.Diabetes = Diabetes;
    }

    public String getScored_label() {
        return scored_label;
    }

    public void setScored_label(String scored_label) {
        this.scored_label = scored_label;
    }

    public double getScored_probabilities() {
        return scored_probabilities;
    }

    public void setScored_probabilities(double scored_probabilities) {
        this.scored_probabilities = scored_probabilities;
    }
    
    
    
}
