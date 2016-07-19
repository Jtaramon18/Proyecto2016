/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.principal;

import java.io.IOException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 * @authores
 * Jean Chimbo
 * David Salinas
 * Juan Ramón
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    private DefaultListModel modelo;
    private int pos_tarea; //Guarda la posicion de la tarea seleccionada de la lista
    private List<String> tareas; //Listado de tareas

    public Ventana() {

        initComponents();
        listatareas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel();

        //Este botón permite guardar las modificaciones que se realicen sobre una tarea,
        //al principio debe estar deshabilitado y solo habilitarse cuando se seleccione la opción de modificar tarea
        btnGuardar.setEnabled(false);
        try {
            //Para llenar la lista con las tareas guardadas en el archivo
            tareas = Archivo.leer_archivo("C:/Users/JuanRamon/Desktop/Archivos/agenda.txt");
            for (String tarea : tareas) {
                modelo.addElement(tarea);
            }
            listatareas.setModel(modelo);
        } catch (IOException ex) {
            System.out.println("Error en la lectura del fichero " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eliminar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        dia = new javax.swing.JTextField();
        prioridad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        listatareas = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha");

        jLabel2.setText("Descripción");

        jLabel3.setText("Prioridad");

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jScrollPane2.setViewportView(listatareas);

        jLabel4.setText("Lista de Tareas");

        jLabel5.setText("Día");

        jLabel6.setText("Mes");

        jLabel7.setText("Año");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 153));
        jLabel8.setText("Agenda Estudiantil");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(Eliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnGuardar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Agregar))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(prioridad, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Agregar)
                                    .addComponent(btnGuardar))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(btnModificar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Método que permite obtener los datos de una tarea

    public String obtener_datos_tarea() {
        String date = dia.getText() + "-" + mes.getText() + "-" + año.getText();
        String des = descripcion.getText();
        String pri = prioridad.getText();
        String tarea = date + " / " + des + " / " + pri;

        dia.setText("");
        mes.setText("");
        año.setText("");
        descripcion.setText("");
        prioridad.setText("");

        return tarea;
    }
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

        String tarea = obtener_datos_tarea(); //Obtiene los datos de la tarea
        modelo.addElement(tarea); //Sea agrega la tarea a la lista
        System.out.println(modelo);
        listatareas.setModel(modelo);

        try {
            Archivo.escribir_fichero(modelo.toArray()); //Se escribe sobre el fichero
        } catch (IOException ex) {
            System.out.println("Error en la escritura del fichero " + ex);
        }


    }//GEN-LAST:event_AgregarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int indice = listatareas.getSelectedIndex();
        if (indice >= 0) {
            modelo.removeElementAt(indice);
            try {
                Archivo.escribir_fichero(modelo.toArray());//Para eliminar el elemento del archivo
            } catch (IOException ex) {
                System.out.println("Error en la escritura del fichero " + ex);
            }
            JOptionPane.showMessageDialog(null, "Se eliminó un elemento en la posición " + indice);

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error", JOptionPane.ERROR_MESSAGE);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        String itemAgenda = String.valueOf(listatareas.getSelectedValue()); //Se guarda el elemento de la lista de tareas
        pos_tarea = listatareas.getSelectedIndex(); //Guarda la posición en la que se encuentra la tarea a modificar

        String fecha = itemAgenda.substring(0, itemAgenda.indexOf('/')); //Guarda la fecha
        String descrip = itemAgenda.substring(fecha.length() + 2, itemAgenda.indexOf('/', fecha.length() + 1)); //Guarda la descripcion del archivo
        String prior = itemAgenda.substring(fecha.length() + descrip.length() + 3); //Guarda la prioridad
        String d = fecha.substring(0, fecha.indexOf('-'));
        String m = fecha.substring(d.length() + 1, fecha.indexOf('-', d.length() + 1));
        String a = fecha.substring(d.length() + m.length() + 2);

        dia.setText(d);
        mes.setText(m);
        año.setText(a);
        descripcion.setText(descrip);
        prioridad.setText(prior);
        btnGuardar.setEnabled(true); // Se habilita para guardar los cambios registrados en la tarea
        Agregar.setEnabled(false); //Se deshabilita el botón para que la tarea modificada no se cree como nueva


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String tarea = obtener_datos_tarea(); //Obtiene los datos de la tarea
        modelo.setElementAt(tarea, pos_tarea); //Se actualiza la lista de tareas, para lo cual se le establece la posicion y la tarea en si
        listatareas.setModel(modelo);
        Object[] tareas = modelo.toArray();
        try {
            Archivo.escribir_fichero(tareas);
        } catch (IOException ex) {
            System.out.println("Error al actualizar la tarea en el fichero " + ex);
        }
        btnGuardar.setEnabled(false); //Se deshabilita el botón guardar
        Agregar.setEnabled(true); //Se habilita el botón para  agregar más tareas 

    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField año;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField dia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listatareas;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField prioridad;
    // End of variables declaration//GEN-END:variables
}
