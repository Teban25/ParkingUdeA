/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.alpr;

import java.util.List;

/**
 *
 * @author juanf.molina
 */
public class Result {

    private String plate;
    private float confidence;
    private int matches_template;
    private int plate_index;
    private String region;
    private int region_confidence;
    private float processing_time_ms;
    private List<Plate> candidates;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public float getConfidence() {
        return confidence;
    }

    public void setConfidence(float confidence) {
        this.confidence = confidence;
    }

    public int getMatches_template() {
        return matches_template;
    }

    public void setMatches_template(int matches_template) {
        this.matches_template = matches_template;
    }

    public int getPlate_index() {
        return plate_index;
    }

    public void setPlate_index(int plate_index) {
        this.plate_index = plate_index;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getRegion_confidence() {
        return region_confidence;
    }

    public void setRegion_confidence(int region_confidence) {
        this.region_confidence = region_confidence;
    }

    public float getProcessing_time_ms() {
        return processing_time_ms;
    }

    public void setProcessing_time_ms(float processing_time_ms) {
        this.processing_time_ms = processing_time_ms;
    }

    public List<Plate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Plate> candidates) {
        this.candidates = candidates;
    }

    public Result(String plate, float confidence, int matches_template, int plate_index, String region, int region_confidence, float processing_time_ms, List<Plate> candidates) {
        this.plate = plate;
        this.confidence = confidence;
        this.matches_template = matches_template;
        this.plate_index = plate_index;
        this.region = region;
        this.region_confidence = region_confidence;
        this.processing_time_ms = processing_time_ms;
        this.candidates = candidates;
    }
}
