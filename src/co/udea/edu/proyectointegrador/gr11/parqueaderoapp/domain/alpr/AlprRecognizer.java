/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.alpr;


import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.entities.alpr.AlprResult;
import co.udea.edu.proyectointegrador.gr11.parqueaderoapp.domain.exception.BussinessException;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Juan Fernando Molina
 */
public class AlprRecognizer {

    private static final String ALPR_COMMAND_LINE_ROOT = "alpr -j ";
    private Gson gSonConverter;
    private String jSonString = new String();
    /**
     * Este metodo se utiliza para reconocer la plata de una imagen con la ruta de la imagen
     * @param imageRoot
     * @return El objeto que devuelve la librería con las placas reconocidas. Retorna null si la placa no pudo ser reconocida.
     * @throws BussinessException 
     */
    public AlprResult recognize(String imageRoot) throws BussinessException {
        try {
            gSonConverter = new Gson();
            String s;
            Process p = Runtime.getRuntime().exec(ALPR_COMMAND_LINE_ROOT+imageRoot);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while (( s = stdInput.readLine()) != null) {
               jSonString=jSonString+s+"\n";
            }
            AlprResult alprResult = gSonConverter.fromJson(jSonString, AlprResult.class);
            return alprResult;
        } catch (IOException ex) {
            throw new BussinessException(ex.getMessage());
        }

    }

}
