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
public class classPrestamos {
    private Integer idPrestamos;
    private String txtIdentificacion;
    private String txtCost;
    private Integer txtUserId;
    private String txtNombreUser;
    private String txtEjemplar;
    private Integer txtCopyId;
    private String txtReturnDate;

    public String getTxtNombreUser() {
        return txtNombreUser;
    }

    public void setTxtNombreUser(String txtNombreUser) {
        this.txtNombreUser = txtNombreUser;
    }

    public String getTxtEjemplar() {
        return txtEjemplar;
    }

    public void setTxtEjemplar(String txtEjemplar) {
        this.txtEjemplar = txtEjemplar;
    }
    
    public Integer getIdPrestamos() {
        return idPrestamos;
    }

    public void setIdPrestamos(Integer idPrestamos) {
        this.idPrestamos = idPrestamos;
    }

    public String getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public void setTxtIdentificacion(String txtIdentificacion) {
        this.txtIdentificacion = txtIdentificacion;
    }

    public String getTxtCost() {
        return txtCost;
    }

    public void setTxtCost(String txtCost) {
        this.txtCost = txtCost;
    }

    public Integer getTxtUserId() {
        return txtUserId;
    }

    public void setTxtUserId(Integer txtUserId) {
        this.txtUserId = txtUserId;
    }

    public Integer getTxtCopyId() {
        return txtCopyId;
    }

    public void setTxtCopyId(Integer txtCopyId) {
        this.txtCopyId = txtCopyId;
    }

    public String getTxtReturnDate() {
        return txtReturnDate;
    }

    public void setTxtReturnDate(String txtReturnDate) {
        this.txtReturnDate = txtReturnDate;
    }
    
    public boolean insert() {
        return methodsSQL.execute("INSERT INTO copy_loans (cost, identification, user_id, copy_id, return_date)  VALUES (?, FLOOR(RAND() * 999999.99), ? ,?, NOW()+INTERVAL 5 DAY)", "0.50", txtUserId, txtCopyId);
    }
    
    public boolean update() {
        return methodsSQL.execute("UPDATE copies SET quantity = quantity - 1 WHERE id = ?", txtCopyId);
    }
}
