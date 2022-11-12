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
public class classCategoriaTipos {
    
    private Integer idCategoria;
    private String textCategoria;
    private Integer cmbLocalidad;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getTextCategoria() {
        return textCategoria;
    }

    public void setTextCategoria(String textCategoria) {
        this.textCategoria = textCategoria;
    }

    public Integer getCmbLocalidad() {
        return cmbLocalidad;
    }

    public void setCmbLocalidad(Integer cmbLocalidad) {
        this.cmbLocalidad = cmbLocalidad;
    }
    
    //copy_categorias Metodos
    public boolean insert(){
        return methodsSQL.execute("INSERT INTO copy_categories (category, location_section_id)  VALUES (?, ?)",textCategoria, cmbLocalidad);
    }
    
    public boolean delete(){
        return methodsSQL.execute("DELETE FROM copy_categories WHERE id = ? ", idCategoria);
    }
    
    public boolean update(){
        return methodsSQL.execute("UPDATE copy_categories SET category = ?, location_section_id = ? WHERE id = ?",textCategoria, cmbLocalidad, idCategoria);
    }
}
