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
public class classEditoriales {

    private String txtEditorial;
    private String txtEditorialPhone;
    private int id;

    public String getTxtEditorial() {
        return txtEditorial;
    }

    public void setTxtEditorial(String txtEditorial) {
        this.txtEditorial = txtEditorial;
    }

    public String getTxtEditorialPhone() {
        return txtEditorialPhone;
    }

    public void setTxtEditorialPhone(String txtEditorialPhone) {
        this.txtEditorialPhone = txtEditorialPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean insert() {
        return methodsSQL.execute("INSERT INTO editorials (editorial, phone)  VALUES (?, ?)", txtEditorial, txtEditorialPhone);
    }
     
    public boolean delete() {
        return methodsSQL.execute("DELETE FROM editorials WHERE id = ? ", id);
    }

    public boolean update() {
        return methodsSQL.execute("UPDATE editorials SET editorial = ?, phone = ?  WHERE id = ?", txtEditorial, txtEditorialPhone, id);
    }

}
