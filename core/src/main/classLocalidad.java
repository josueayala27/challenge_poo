/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author jonix
 */
public class classLocalidad {
    private String error;
    private Integer idLocalidad;
    private String txtLocalidad;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getTxtLocalidad() {
        return txtLocalidad;
    }

    public void setTxtLocalidad(String txtLocalidad) {
        this.txtLocalidad = txtLocalidad;
    }
    
    //copy_categorias Metodos
    public boolean insert(){
        return methodsSQL.execute("INSERT INTO locations (location)  VALUES (?)",txtLocalidad);
    }
    
    public boolean delete(){
        return methodsSQL.execute("DELETE FROM locations WHERE id = ? ", idLocalidad);
    }
    
    public boolean update(){
        return methodsSQL.execute("UPDATE locations SET location = ? WHERE id = ?",txtLocalidad, idLocalidad);
    }
    
}
