/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jonix
 */
public class methodsSQL {

    private static classCategoriaTipos CategoriaTipos;
    private static classTipos Tipos;
    private static classSeccion Seccion;
    private static classLocalidad Localidad;
    private static classEditoriales Editoriales;
    private static classEjemplares Ejemplares;
    private static classUsuarios Usuarios;
    private static classPrestamos Prestamos;

    public static classPrestamos getPrestamos() {
        return Prestamos;
    }

    public static void setPrestamos(classPrestamos Prestamos) {
        methodsSQL.Prestamos = Prestamos;
    }
    
    public static classSeccion getSeccion() {
        return Seccion;
    }

    public static void setSeccion(classSeccion Seccion) {
        methodsSQL.Seccion = Seccion;
    }

    public static classLocalidad getLocalidad() {
        return Localidad;
    }

    public static void setLocalidad(classLocalidad Localidad) {
        methodsSQL.Localidad = Localidad;
    }

    public static classTipos getTipos() {
        return Tipos;
    }

    public static void setTipos(classTipos Tipos) {
        methodsSQL.Tipos = Tipos;
    }

    public static classCategoriaTipos getCategoriaTipos() {
        return CategoriaTipos;
    }

    public static void setCategoriaTipos(classCategoriaTipos CategoriaTipos) {
        methodsSQL.CategoriaTipos = CategoriaTipos;
    }

    public static classEditoriales getEditoriales() {
        return Editoriales;
    }

    public static void setEditoriales(classEditoriales Editoriales) {
        methodsSQL.Editoriales = Editoriales;
    }

    public static classEjemplares getEjemplares() {
        return Ejemplares;
    }

    public static void setEjemplares(classEjemplares Ejemplares) {
        methodsSQL.Ejemplares = Ejemplares;
    }

    public static classUsuarios getUsuarios() {
        return Usuarios;
    }

    public static void setUsuarios(classUsuarios Usuarios) {
        methodsSQL.Usuarios = Usuarios;
    }

    //static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(methodsSQL.class);
    static void prepare(PreparedStatement cmd, Object... values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            cmd.setObject(i + 1, values[i]);
        }
    }

    public static boolean execute(String query, Object... values) {
        try (Connection con = connection.getConnection();
                PreparedStatement command = con.prepareStatement(query)) {
            prepare(command, values);
            command.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            //item.setError(e.getMessage());
            //log.error ("error metodo execute " + e);
            return false;
        }
    }

    public static ResultSet getExecute(String query, Object... values) {
        ResultSet rs = null;
        try {
            Connection con = connection.getConnection();
            PreparedStatement prepStmt = con.prepareStatement(query);
            prepare(prepStmt, values);
            rs = prepStmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //item.setError(ex.getMessage());
            //log.error("error metodo getExecute " + ex);
        }
        return rs;
    }

    public static Integer getExecuteInt(String query, Object... values) {
        ResultSet rs;
        Integer i = -1;
        try {
            Connection con = connection.getConnection();
            PreparedStatement prepStmt = con.prepareStatement(query);
            prepare(prepStmt, values);
            rs = prepStmt.executeQuery();
            if (rs.next()) {
                i = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //log.error( "error metodo getExecuteInt " +ex);
            //item.setError(ex.getMessage());
        }
        return i;
    }

    public static boolean exists(String query, Object... values) {
        Object cod = null;
        try {
            ResultSet rs = getExecute(query, values);
            if (rs.next()) {
                cod = rs.getObject(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //log.error("error del metodo exist " + ex);
            //item.setError(ex.getMessage());
        }
        if (cod == null) {
            return false;
        } else {
            return true;
        }
    }

    public static DefaultTableModel getTableModel(String query, Object... values) {
        DefaultTableModel modelo = new DefaultTableModel();
        for (Object value : values) {
            modelo.addColumn(value);
        }
        ResultSet rs = methodsSQL.getExecute(query);

        try {
            while (rs.next()) {
                Object[] fila = new Object[values.length];
                for (int i = 0; i < values.length; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            //item.setError(ex.getMessage());
            //log.error("error metodo getTableModel " + ex);
        }

        return modelo;
    }
}
