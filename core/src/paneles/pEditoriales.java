/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.classEditoriales;
import main.methodsSQL;

/**
 *
 * @author cesar
 */
public class pEditoriales extends javax.swing.JPanel {

    private final classEditoriales Editoriales;
    private String query;

    /**
     * Creates new form pCategorias
     */
    public pEditoriales() {
        initComponents();
        Editoriales = new classEditoriales();
        methodsSQL.setEditoriales(Editoriales);
        mostrarEditoriales();
        id.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbEditoriales = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbEditoriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbEditoriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEditorialesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEditoriales);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 620, 311));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre editorial");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 210, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, -1));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Telefono editorial");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 115, 165));
        btnGuardar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 10)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 130, 40));

        btnModificar.setBackground(new java.awt.Color(0, 115, 165));
        btnModificar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 10)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 130, 40));

        btnEliminar.setBackground(new java.awt.Color(0, 115, 165));
        btnEliminar.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 10)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 130, 40));
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 60, -1));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Gestion de editoriales");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 22, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!camposVaciosEditorial()) {
            if (!existEditorials(txtEditorial.getText())) {
                asignarEditorial();
                if (Editoriales.insert()) {
                    mostrarMensaje(2);
                } else {
                    mostrarMensaje(3);
                }
            } else {
                mostrarMensaje(1);
            }
        } else {
            mostrarMensaje(0);
        }

        limpiarCampos();
        mostrarEditoriales();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (!camposVaciosEditorial()) {
            updateEditorial();
        } else {
            mostrarMensaje(3);
        }
        limpiarCampos();
        mostrarEditoriales();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if (!campoVacio(id.getText())) {
            Editoriales.setId(Integer.parseInt(id.getText()));
            if (existEditorialId(Editoriales.getId())) {
                if (Editoriales.delete()) {
                    mostrarMensaje(2);
                } else {
                    mostrarMensaje(3);
                }
            } else {
                mostrarMensaje(4);
            }
        } else {
            mostrarMensaje(0);
        }

        limpiarCampos();
        mostrarEditoriales();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbEditorialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEditorialesMouseClicked
        try {
            int i = tbEditoriales.getSelectedRow();
            query = "SELECT editorial, phone from editorials WHERE id = ?";
            ResultSet rs = methodsSQL.getExecute(query, tbEditoriales.getValueAt(i, 0));
            if (rs.next()) {

                Editoriales.setTxtEditorial(rs.getString(1));
                Editoriales.setTxtEditorialPhone(rs.getString(2));
            }
            id.setText(tbEditoriales.getValueAt(i, 0).toString());
            txtEditorial.setText(Editoriales.getTxtEditorial());
            txtPhone.setText(Editoriales.getTxtEditorialPhone());
            
        } catch (SQLException ex) {
            Logger.getLogger(pEditoriales.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_tbEditorialesMouseClicked

    public void mostrarEditoriales() {
        query = "select id, editorial, phone from editorials  ";
        tbEditoriales.setModel(methodsSQL.getTableModel(query, "ID", "Editorial", "Telefono"));
    }

    public void asignarEditorial() {
        Editoriales.setTxtEditorial(txtEditorial.getText());
        Editoriales.setTxtEditorialPhone(txtPhone.getText());

    }

    //Modificar valores
    public void updateEditorial() {
        Editoriales.setId(Integer.parseInt(id.getText()));
        if (existEditorialId(Editoriales.getId())) {
            asignarEditorial();
            if (Editoriales.update()) {
                mostrarMensaje(2);
            } else {
                mostrarMensaje(3);
            }
        } else {
            mostrarMensaje(4);
        }
    }


    public boolean camposVaciosEditorial() {
        if (campoVacio(txtEditorial.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean campoVacio(String text) {
        text = text.replaceAll(" ", "");
        if (text.isEmpty() || text.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean existEditorials(String txtSeccion) {
        return methodsSQL.exists("SELECT * FROM editorials WHERE editorial = ?", txtEditorial);
    }

    public boolean existEditorialId(Integer id) {
        return methodsSQL.exists("SELECT * FROM editorials WHERE id = ?", id);
    }

    public void limpiarCampos() {
        id.setText("");
        txtEditorial.setText("");
        txtPhone.setText("");

    }

    //Mensajes
    public void mostrarMensaje(int value) {
        switch (value) {
            case 0:
                JOptionPane.showMessageDialog(this, "Campos vacios", "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "Ese id ya exciste", "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Exito al ejecutar", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(this, "Error al ejecutar", "Mensaje", JOptionPane.ERROR_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(this, "Ese id no existe", "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEditoriales;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
