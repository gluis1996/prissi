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
public class FrmEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEmpleado
     */
    public FrmEmpleado() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistroEmpleados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnConsultar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jtxtCorreo = new javax.swing.JTextField();
        jtxtIdEmpleado = new javax.swing.JTextField();
        jtxtDni = new javax.swing.JTextField();
        jtxtNombres = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtSueldo = new javax.swing.JTextField();
        jbtnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCantidadRegistros = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblRegistroEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblRegistroEmpleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 590, 320));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE LOS EMPLEADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft YaHei UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnRegistrar.setText("REGISTRAR");
        jPanel1.add(jbtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, 60));

        jbtnConsultar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnConsultar.setText("CONSULTAR");
        jPanel1.add(jbtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, 60));

        jbtnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnEliminar.setText("ELIMINAR");
        jPanel1.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 150, 60));

        jtxtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CORREO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 150, 50));

        jtxtIdEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID EMPLEADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jtxtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 50));

        jtxtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jtxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 190, 50));

        jtxtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jtxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 50));

        jtxtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TEL??FONO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 50));

        jtxtSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUELDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.add(jtxtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 160, 40));

        jbtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnActualizar.setText("ACTUALIZAR");
        jPanel1.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 150, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 340, 400));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel2.setText("LISTA DE LOS EMPLEADOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        lblCantidadRegistros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantidadRegistros.setText("Cantidad de registros: ");
        getContentPane().add(lblCantidadRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtnActualizar;
    public javax.swing.JButton jbtnConsultar;
    public javax.swing.JButton jbtnEliminar;
    public javax.swing.JButton jbtnRegistrar;
    public javax.swing.JTable jtblRegistroEmpleados;
    public javax.swing.JTextField jtxtCorreo;
    public javax.swing.JTextField jtxtDni;
    public javax.swing.JTextField jtxtIdEmpleado;
    public javax.swing.JTextField jtxtNombres;
    public javax.swing.JTextField jtxtSueldo;
    public javax.swing.JTextField jtxtTelefono;
    public javax.swing.JLabel lblCantidadRegistros;
    // End of variables declaration//GEN-END:variables
}
