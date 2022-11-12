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
public class classTipos {
    
    private Integer idTipo;
    private String txtTipo;

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(String txtTipo) {
        this.txtTipo = txtTipo;
    }
    
    //copy_categorias Metodos
    public boolean insert(){
        return methodsSQL.execute("INSERT INTO copy_type (type) VALUES (?)",txtTipo);
    }
    
    public boolean delete(){
        return methodsSQL.execute("DELETE FROM copy_type WHERE id = ? ", idTipo);
    }
    
    public boolean update(){
        return methodsSQL.execute("UPDATE copy_type SET type = ? WHERE id = ?",txtTipo, idTipo);
    }
}
