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
    
    private int embarazos;
    private int glucosa;
    private int presionSanguinea;
    private int pliegueCutaneo;
    private int insulina;
    private int IMC;
    private double pedigriDiabetes;
    private int edad;
    private String diabetes;
    private String scoredLabel;
    private double scoredProbabilities;

    public int getEmbarazos() {
        return embarazos;
    }

    public void setEmbarazos(int embarazos) {
        this.embarazos = embarazos;
    }

    public int getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(int glucosa) {
        this.glucosa = glucosa;
    }

    public int getPresionSanguinea() {
        return presionSanguinea;
    }

    public void setPresionSanguinea(int presionSanguinea) {
        this.presionSanguinea = presionSanguinea;
    }

    public int getPliegueCutaneo() {
        return pliegueCutaneo;
    }

    public void setPliegueCutaneo(int pliegueCutaneo) {
        this.pliegueCutaneo = pliegueCutaneo;
    }

    public int getInsulina() {
        return insulina;
    }

    public void setInsulina(int insulina) {
        this.insulina = insulina;
    }

    public int getIMC() {
        return IMC;
    }

    public void setIMC(int IMC) {
        this.IMC = IMC;
    }

    public double getPedigriDiabetes() {
        return pedigriDiabetes;
    }

    public void setPedigriDiabetes(double pedigriDiabetes) {
        this.pedigriDiabetes = pedigriDiabetes;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getScoredLabel() {
        return scoredLabel;
    }

    public void setScoredLabel(String scoredLabel) {
        this.scoredLabel = scoredLabel;
    }

    public double getScoredProbabilities() {
        return scoredProbabilities;
    }

    public void setScoredProbabilities(double scoredProbabilities) {
        this.scoredProbabilities = scoredProbabilities;
    }

    
    
}
