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
public class FrmEnvio extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEnvio
     */
    public FrmEnvio() {
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

        jPanel1 = new javax.swing.JPanel();
        jbtnRegistrar = new javax.swing.JButton();
        jtxtPrecio = new javax.swing.JTextField();
        jtxtCantidad = new javax.swing.JTextField();
        jcbxListaProveedores = new javax.swing.JComboBox<>();
        jcbxListaInsumos = new javax.swing.JComboBox<>();
        jdatchosFecha = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 204, 204));
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE LOS ENVIOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnRegistrar.setText("REGISTRAR");
        jPanel1.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 300, 60));

        jtxtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRECIO ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, 60));

        jtxtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CANTIDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 60));

        jcbxListaProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE PROVEEDORES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jcbxListaProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, 60));

        jcbxListaInsumos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTA DE INSUMOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jcbxListaInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 60));

        jdatchosFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FECHA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jdatchosFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 140, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 360, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JComboBox<String> jcbxListaInsumos;
    public javax.swing.JComboBox<String> jcbxListaProveedores;
    public com.toedter.calendar.JDateChooser jdatchosFecha;
    public javax.swing.JTextField jtxtCantidad;
    public javax.swing.JTextField jtxtPrecio;
    // End of variables declaration//GEN-END:variables
}
