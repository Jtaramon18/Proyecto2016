/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Container;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author CEL
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogoGrafo = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        matrizAdyacencia = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jSpinner1 = new javax.swing.JSpinner();
        matrizResultante = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));

        btnCalcular.setText("CALCULAR CAMINO");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(125, 125, 125))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCalcular)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/CapturaM.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel8.setText("Distribucion de Cajeros Automaticos en el centro de la Ciudad De Loja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(107, 107, 107))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DialogoGrafoLayout = new javax.swing.GroupLayout(DialogoGrafo.getContentPane());
        DialogoGrafo.getContentPane().setLayout(DialogoGrafoLayout);
        DialogoGrafoLayout.setHorizontalGroup(
            DialogoGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        DialogoGrafoLayout.setVerticalGroup(
            DialogoGrafoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoGrafoLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        matrizAdyacencia.setTitle("Matriz original");

        jPanel4.setLayout(new java.awt.GridLayout(6, 6));
        jPanel4.add(jLabel16);

        jLabel18.setText("Centro Com");
        jPanel4.add(jLabel18);

        jLabel17.setText("Romar");
        jPanel4.add(jLabel17);

        jLabel15.setText("Sto. Dom");
        jPanel4.add(jLabel15);

        jLabel14.setText("San Sebast");
        jPanel4.add(jLabel14);

        jLabel11.setText("Catedral");
        jPanel4.add(jLabel11);

        jLabel12.setText("Centro Com");
        jPanel4.add(jLabel12);

        jTextField6.setText("0");
        jPanel4.add(jTextField6);

        jTextField15.setText("1");
        jPanel4.add(jTextField15);

        jTextField9.setText("1");
        jPanel4.add(jTextField9);

        jTextField8.setText("1");
        jPanel4.add(jTextField8);

        jTextField3.setText("0");
        jPanel4.add(jTextField3);

        jLabel13.setText("Romar");
        jPanel4.add(jLabel13);

        jTextField17.setText("1");
        jPanel4.add(jTextField17);

        jTextField1.setText("0");
        jPanel4.add(jTextField1);

        jTextField2.setText("1");
        jPanel4.add(jTextField2);

        jTextField5.setText("0");
        jPanel4.add(jTextField5);

        jTextField4.setText("1");
        jPanel4.add(jTextField4);

        jLabel10.setText("Sto. Dom");
        jPanel4.add(jLabel10);

        jTextField10.setText("1");
        jPanel4.add(jTextField10);

        jTextField11.setText("1");
        jPanel4.add(jTextField11);

        jTextField12.setText("0");
        jPanel4.add(jTextField12);

        jTextField13.setText("1");
        jPanel4.add(jTextField13);

        jTextField16.setText("1");
        jPanel4.add(jTextField16);

        jLabel20.setText("San Sebast");
        jPanel4.add(jLabel20);

        jTextField18.setText("1");
        jPanel4.add(jTextField18);

        jTextField19.setText("0");
        jPanel4.add(jTextField19);

        jTextField20.setText("1");
        jPanel4.add(jTextField20);

        jTextField22.setText("0");
        jPanel4.add(jTextField22);

        jTextField21.setText("1");
        jPanel4.add(jTextField21);

        jLabel19.setText("Catedral");
        jPanel4.add(jLabel19);

        jTextField14.setText("0");
        jPanel4.add(jTextField14);

        jTextField23.setText("1");
        jPanel4.add(jTextField23);

        jTextField24.setText("1");
        jPanel4.add(jTextField24);

        jTextField25.setText("1");
        jPanel4.add(jTextField25);

        jTextField7.setText("0");
        jPanel4.add(jTextField7);

        matrizAdyacencia.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        matrizResultante.setTitle("Matriz de Adyacencia Resultante");

        javax.swing.GroupLayout matrizResultanteLayout = new javax.swing.GroupLayout(matrizResultante.getContentPane());
        matrizResultante.getContentPane().setLayout(matrizResultanteLayout);
        matrizResultanteLayout.setHorizontalGroup(
            matrizResultanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        matrizResultanteLayout.setVerticalGroup(
            matrizResultanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(102, 0, 204));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel1.setText("UNIVERSIDAD NACIONAL DE LOJA");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        jLabel2.setText("AREA DE LA ENERGIA LAS INDUSTRIAS Y LOS RECURSOS NATURALES ");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        jLabel3.setText("NO RENOVABLES");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        jLabel4.setText("CARRERA DE INGENIERIA EN SISTEMAS");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("ALGORITMO WARSHALL");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        jLabel6.setText("ESTUDIANTE: MIROSLAVA MONTESINOS");

        btnInicio.setText("INICIO");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInicio)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel5)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(btnInicio)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        DialogoGrafo.setSize(600, 600);
        DialogoGrafo.setVisible(true);
        DialogoGrafo.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        matrizAdyacencia.setSize(400, 400);
        matrizAdyacencia.setVisible(true);
        matrizAdyacencia.setLocation(100, 100);
        calcular_caminos();
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DialogoGrafo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnInicio;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JDialog matrizAdyacencia;
    private javax.swing.JDialog matrizResultante;
    // End of variables declaration//GEN-END:variables
Container contenedor;
JPanel panel;
//declaracion e inicialización de la matriz de acuerdo a la distribución de los cajeros
    //El uno indica que hay un camino entre un par de nodos y el cero indica que no lo hay
    static int[][] warshall = {{0, 1, 1, 1, 0}, {1, 0, 1, 0, 1}, {1, 1, 0, 1, 1}, {1, 0, 1, 0, 1}, {0, 1, 1, 1, 0}};
    static int n = 5;
    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

    ;

   
    public void calcular_caminos() {
        contenedor=getContentPane();
//        contenedor=new Container();
        panel = new JPanel(new GridLayout(5, 5));
        JButton btnCamino;
        for (int k = 0; k <= n - 1; k++) {
            for (int i = 0; i <= n - 1; i++) {
                for (int j = 0; j <= n - 1; j++) {
                    warshall[i][j] = funcionwar(i, j, k);
                }
            }

        }
        //Matriz de Adyacencia
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(warshall[i][j]);
                btnCamino = new JButton(String.valueOf(warshall[i][j]));
                panel.add(btnCamino);
            }
        }
        contenedor.add(panel);
        matrizResultante.setContentPane(contenedor);

        matrizResultante.setLocation(600, 100);
        matrizResultante.setSize(400, 400);
        
        matrizResultante.setVisible(true);
        
    }

    public static int funcionwar(int i, int j, int k) {
        if ((warshall[i][j] == 1) || ((warshall[i][k] == 1) && (warshall[k][j] == 1))) {
            return 1;
        } else {
            return 0;
        }
    }
}