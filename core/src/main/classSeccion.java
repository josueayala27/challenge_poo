/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Cartagena
 */
public class classSeccion {
    private String error;
    private Integer idSeccion;
    private String txtSeccion;
    private Integer cmbLocacion;

    public Integer getCmbLocacion() {
        return cmbLocacion;
    }

    public void setCmbLocacion(Integer cmbLocacion) {
        this.cmbLocacion = cmbLocacion;
    }
    
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(Integer idSeccion) {
        this.idSeccion = idSeccion;
    }

    public String getTxtSeccion() {
        return txtSeccion;
    }

    public void setTxtSeccion(String txtSeccion) {
        this.txtSeccion = txtSeccion;
    }
    
    //copy_categorias Metodos
    public boolean insert(){
        return methodsSQL.execute("INSERT INTO location_sections (section, location_id)  VALUES (?, ?)",txtSeccion, cmbLocacion);
    }
    
    public boolean delete(){
        return methodsSQL.execute("DELETE FROM location_sections WHERE id = ? ", idSeccion);
    }
    
    public boolean update(){
        return methodsSQL.execute("UPDATE location_sections SET section = ?, location_id = ? WHERE id = ?",txtSeccion, cmbLocacion, idSeccion);
    }
    
    
}
