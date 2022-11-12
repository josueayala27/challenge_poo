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
public class classUsuarios {
    private Integer idUsuario;
    private String txtEmail;
    private String txtIdentificacion;
    private String txtNombreCompleto;
    private String txtContra;
    private Integer cmbRole;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }

    public String getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public void setTxtIdentificacion(String txtIdentificacion) {
        this.txtIdentificacion = txtIdentificacion;
    }

    public String getTxtNombreCompleto() {
        return txtNombreCompleto;
    }

    public void setTxtNombreCompleto(String txtNombreCompleto) {
        this.txtNombreCompleto = txtNombreCompleto;
    }

    public String getTxtContra() {
        return txtContra;
    }

    public void setTxtContra(String txtContra) {
        this.txtContra = txtContra;
    }

    public Integer getCmbRole() {
        return cmbRole;
    }

    public void setCmbRole(Integer cmbRole) {
        this.cmbRole = cmbRole;
    }
    
    //copy_categorias Metodos
    public boolean insert(){
        return methodsSQL.execute("INSERT INTO users (email, identification, full_name, password, user_role)  VALUES (?, ?, ?, ?, ?)",txtEmail, txtIdentificacion, txtNombreCompleto, txtContra, cmbRole);
    }
    
    public boolean delete(){
        return methodsSQL.execute("DELETE FROM users WHERE id = ? ", idUsuario);
    }
    
    public boolean update(){
        return methodsSQL.execute("UPDATE users SET email = ?, identification = ?, full_name = ?, user_role = ? WHERE id = ?",txtEmail, txtIdentificacion, txtNombreCompleto, cmbRole, idUsuario);
    }
}
