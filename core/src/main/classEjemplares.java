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
public class classEjemplares {
    private Integer comboAutor;
    private Integer comboCat;
    private Integer comboEditorial;
    private Integer comboEjemplar;
    private Integer id;
    private Integer txtCant;
    private String txtISBN;
    private String txtName;
    private Integer txtNumPag;
    private String txtPublicacion;
    
    //Setter and getters
    public Integer getComboAutor() {
        return comboAutor;
    }

    public void setComboAutor(Integer comboAutor) {
        this.comboAutor = comboAutor;
    }

    public Integer getComboCat() {
        return comboCat;
    }

    public void setComboCat(Integer comboCat) {
        this.comboCat = comboCat;
    }
    
    public Integer getComboEditorial() {
        return comboEditorial;
    }

    public void setComboEditorial(Integer comboEditorial) {
        this.comboEditorial = comboEditorial;
    }

    public Integer getComboEjemplar() {
        return comboEjemplar;
    }

    public void setComboEjemplar(Integer comboEjemplar) {
        this.comboEjemplar = comboEjemplar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTxtCant() {
        return txtCant;
    }

    public void setTxtCant(Integer txtCant) {
        this.txtCant = txtCant;
    }
    
    public String getTxtISBN() {
        return txtISBN;
    }

    public void setTxtISBN(String txtISBN) {
        this.txtISBN = txtISBN;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public Integer getTxtNumPag() {
        return txtNumPag;
    }

    public void setTxtNumPag(Integer txtNumPag) {
        this.txtNumPag = txtNumPag;
    }

    public String getTxtPublicacion() {
        return txtPublicacion;
    }

    public void setTxtPublicacion(String txtPublicacion) {
        this.txtPublicacion = txtPublicacion;
    }
    
    //Methods
    
    public boolean insert(){
        return methodsSQL.execute("INSERT INTO copies (isbn, name, quantity, publish_at, total_pages, editorial_id , copy_category, copy_author, copy_type)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)",txtISBN, txtName, txtCant,txtPublicacion, txtNumPag, comboEditorial, comboCat, comboAutor, comboEjemplar);
    }
    
    
    public boolean delete(){
        return methodsSQL.execute("DELETE FROM copies WHERE id = ? ", id);
    }
    
    public boolean update(){
        return methodsSQL.execute("UPDATE copies SET isbn = ?, name = ?, quantity = ?, publish_at = ?, total_pages = ?, editorial_id = ?, copy_category = ?, copy_author = ?, copy_type = ?  WHERE id = ?",txtISBN, txtName, txtCant, txtPublicacion, txtNumPag, comboEditorial, comboCat, comboAutor, comboEjemplar, id);
    }
}
