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
public class AlprResult {

    private int version;
    private String data_type;
    private double epoch_time;
    private int img_width;
    private int img_height;
    private double processing_time_ms;
    private List<Result> results;

    public AlprResult(int version, String data_type, double epoch_time, int img_width, int img_height, double processing_time_ms, List<Result> results) {
        this.version = version;
        this.data_type = data_type;
        this.epoch_time = epoch_time;
        this.img_width = img_width;
        this.img_height = img_height;
        this.processing_time_ms = processing_time_ms;
        this.results = results;
    }
    

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
     

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public double getEpoch_time() {
        return epoch_time;
    }

    public void setEpoch_time(double epoch_time) {
        this.epoch_time = epoch_time;
    }

    public int getImg_width() {
        return img_width;
    }

    public void setImg_width(int img_width) {
        this.img_width = img_width;
    }

    public int getImg_height() {
        return img_height;
    }

    public void setImg_height(int img_height) {
        this.img_height = img_height;
    }

    public double getProcessing_time_ms() {
        return processing_time_ms;
    }

    public void setProcessing_time_ms(double processing_time_ms) {
        this.processing_time_ms = processing_time_ms;
    }

                       
    
}
