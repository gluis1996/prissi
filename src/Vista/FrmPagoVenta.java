/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Priscila Lunarejo
 */
public class FrmPagoVenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmPagoVenta
     */
    public FrmPagoVenta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jtbnBuscar = new javax.swing.JButton();
        jtxtDni = new javax.swing.JTextField();
        jlblCostoTotal = new javax.swing.JLabel();
        jbtnEliminarRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistroPagos = new javax.swing.JTable();
        lblCostoTotal = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE VENTAS PARA PAGOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(102, 204, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbnBuscar.setText("BUSCAR");
        jtbnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jtbnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jtxtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jtxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, 130));

        jlblCostoTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jlblCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 110, 20));

        jbtnEliminarRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnEliminarRegistro.setText("Eliminar ");
        jPanel2.add(jbtnEliminarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 120, 40));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jtblRegistroPagos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblRegistroPagos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 720, 280));

        lblCostoTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCostoTotal.setText("COSTO TOTAL: ");
        jPanel2.add(lblCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnBuscarActionPerformed
        /* String[] titulos = {"Nro","datos pedidos","datos ingresados"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);

        jtblRegistroPagos.setModel(modelo);

        try{
            rs = st.executeQuery("");

        }catch(Exception ex){
            Mensajes.M1("ERROR no se puede mostrar el registro solicitado");
        }*/
    }//GEN-LAST:event_jtbnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtnEliminarRegistro;
    public javax.swing.JLabel jlblCostoTotal;
    public javax.swing.JTable jtblRegistroPagos;
    public javax.swing.JButton jtbnBuscar;
    public javax.swing.JTextField jtxtDni;
    private javax.swing.JLabel lblCostoTotal;
    // End of variables declaration//GEN-END:variables
}
