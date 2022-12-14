/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;
import com.raven.datechooser.DateChooser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.classPrestamos;
import main.methodsSQL;

/**
 *
 * @author cesar
 */
public class pPrestamos extends javax.swing.JPanel {
    private final classPrestamos Prestamo;
    private String query;
    /**
     * Creates new form prestamosMora
     */
    public pPrestamos() {
        initComponents();
        Prestamo = new classPrestamos();
        methodsSQL.setPrestamos(Prestamo);
        mostrarUsuario();
        mostrarEjemplar();
        mostrarPrestamos();
        idUsuario.setVisible(false);
        idEjemplar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPrestamos = new javax.swing.JTable();
        txtejemplar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEjemplares = new javax.swing.JTable();
        btnGuardarSC = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idEjemplar = new javax.swing.JTextField();
        idUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese el nombre del Ejemplar");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 205, -1));

        tbPrestamos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbPrestamos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 340, 100));
        add(txtejemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 226, -1));

        tbEjemplares.setModel(new javax.swing.table.DefaultTableModel(
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
        tbEjemplares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEjemplaresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbEjemplares);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 290, 120));

        btnGuardarSC.setBackground(new java.awt.Color(0, 115, 165));
        btnGuardarSC.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 10)); // NOI18N
        btnGuardarSC.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarSC.setText("Hacer Prestamo");
        btnGuardarSC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSCActionPerformed(evt);
            }
        });
        add(btnGuardarSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 160, 40));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Ingrese su nombre completo");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Prestamos actuales");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));
        add(idEjemplar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 30, -1));
        add(idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 30, -1));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Gestion de prestamos");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 22, -1, -1));

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        tbUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbUsuariosKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tbUsuarios);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 290, 100));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Los prestamos tiene un costo de $0.50");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Los prestamos se tienen que devolver 5 dias despues.");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSCActionPerformed
        if (!camposVaciosPrestamos()) {
            if (!existUsuarioyEjemplar(txtName.getText(), txtejemplar.getText())) {
                asignarPrestamo();
                if (Prestamo.insert()) {
                    mostrarMensaje(2);
                    updateStock();
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
        mostrarPrestamos();
        mostrarUsuario();
        mostrarEjemplar();
    }//GEN-LAST:event_btnGuardarSCActionPerformed

    private void tbUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbUsuariosKeyPressed

    }//GEN-LAST:event_tbUsuariosKeyPressed

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        try {
            int i = tbUsuarios.getSelectedRow();
            query = "SELECT id, full_name from users WHERE id = ?";
            ResultSet rs = methodsSQL.getExecute(query, tbUsuarios.getValueAt(i, 0));
            if (rs.next()) {

                Prestamo.setTxtUserId(rs.getInt(1));
                Prestamo.setTxtNombreUser(rs.getString(2));
            }
            idUsuario.setText(tbUsuarios.getValueAt(i, 0).toString());
            txtName.setText(Prestamo.getTxtNombreUser());
            
        } catch (SQLException ex) {
            Logger.getLogger(pPrestamos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_tbUsuariosMouseClicked

    private void tbEjemplaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEjemplaresMouseClicked
        try {
            int i = tbEjemplares.getSelectedRow();
            query = "SELECT id, name from copies WHERE id = ?";
            ResultSet rs = methodsSQL.getExecute(query, tbEjemplares.getValueAt(i, 0));
            if (rs.next()) {

                Prestamo.setTxtCopyId(rs.getInt(1));
                Prestamo.setTxtEjemplar(rs.getString(2));
            }
            idEjemplar.setText(tbEjemplares.getValueAt(i, 0).toString());
            txtejemplar.setText(Prestamo.getTxtEjemplar());
            
        } catch (SQLException ex) {
            Logger.getLogger(pPrestamos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_tbEjemplaresMouseClicked

    //Modificar valores
    public void updateStock() {
        Prestamo.update();
    }
    
    public void asignarPrestamo() {
        Prestamo.setTxtUserId(Integer.parseInt(idUsuario.getText()));
        Prestamo.setTxtCopyId(Integer.parseInt(idEjemplar.getText()));
    }
    
    public boolean existEjemplarId(Integer idEjemplar) {
        return methodsSQL.exists("SELECT name FROM copies  WHERE id = ?", idEjemplar);
    }
    
    public boolean existUsuarioyEjemplar(String txtName, String txtejemplar) {
        return methodsSQL.exists("SELECT u.full_name, c.name FROM copies c, users u WHERE u.id = ? AND c.id = ?", txtName, txtejemplar);
    }
    
    public boolean camposVaciosPrestamos() {
        if (campoVacio(txtName.getText()) || campoVacio(idUsuario.getText()) || campoVacio(txtejemplar.getText()) || campoVacio(idEjemplar.getText())) {
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
    
    public void limpiarCampos() {
        txtName.setText("");
        idUsuario.setText("");
        txtejemplar.setText("");
        idEjemplar.setText("");
    }
    
    public void mostrarPrestamos() {
        query = "SELECT l.identification, u.full_name, c.name, l.return_date FROM copy_loans l, users u, copies c WHERE l.user_id = u.id AND l.copy_id = c.id  ";
        tbPrestamos.setModel(methodsSQL.getTableModel(query, "Identificador", "Alumno", "Ejemplar Prestado", "Fecha Retorno"));
    }
    
    public void mostrarUsuario() {
        query = "select id, full_name, identification from users  ";
        tbUsuarios.setModel(methodsSQL.getTableModel(query, "ID", "Alumno", "Carnet"));
    }
    
    public void mostrarEjemplar() {
        query = "select id, name, quantity from copies  ";
        tbEjemplares.setModel(methodsSQL.getTableModel(query, "ID", "Nombre Ejemplar", "Stock"));
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
    private javax.swing.JButton btnGuardarSC;
    private javax.swing.JTextField idEjemplar;
    private javax.swing.JTextField idUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbEjemplares;
    private javax.swing.JTable tbPrestamos;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtejemplar;
    // End of variables declaration//GEN-END:variables
}
