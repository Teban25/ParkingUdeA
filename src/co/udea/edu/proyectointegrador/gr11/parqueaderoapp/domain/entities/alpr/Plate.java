/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.alpr;

/**
 *
 * @author juanf.molina
 */
public class Plate {
    private String plate;
    private double confidence;
    private int matches_template;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public int getMatches_template() {
        return matches_template;
    }

    public void setMatches_template(int matches_template) {
        this.matches_template = matches_template;
    }
    
}
