
package interfaz;

import Logica.LogicaAplicacion;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.DateFormatter;
import modelo.Corredor;

import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;


public class PantallaCorredor extends javax.swing.JDialog {

    /**
     * Creates new form PantallaCorredor
     */
    private LogicaAplicacion logicaAplicacion;
    private PantallaPrincipal pp;
    private Corredor corredorModificar;

    public PantallaCorredor(java.awt.Frame parent, boolean modal, LogicaAplicacion logicaAplicacion) {

        pp = (PantallaPrincipal) parent;
        this.logicaAplicacion = logicaAplicacion;
        initComponents();

        //validamos el botón Aceptar
        validationPanel.addChangeListener((ChangeEvent ce) -> {
            if (validationPanel.getProblem() == null) {
                jButtonAniadir.setEnabled(true);
            } else {
                jButtonAniadir.setEnabled(false);
            }
        });

        //bloque validación de los campos
        ValidationGroup group = validationPanel.getValidationGroup();
        group.add(jTextFieldNombre, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDni, StringValidators.maxLength(9), StringValidators.minLength(9));
        group.add(jTextFieldTelefono, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDireccion, StringValidators.REQUIRE_NON_EMPTY_STRING);

    }

    public PantallaCorredor(java.awt.Frame parent, boolean modal, LogicaAplicacion logicaAplicacion, Corredor corredorModificar) {
        super(parent, modal);
        pp = (PantallaPrincipal) parent;
        this.logicaAplicacion = logicaAplicacion;
        this.corredorModificar = corredorModificar;
        initComponents();

        jButtonBorrar.setVisible(false);
        jButtonModificar.setVisible(false);
        jButtonVerLista.setVisible(false);
        jTextFieldNombre.setText(corredorModificar.getNombre());
        jTextFieldDni.setText(corredorModificar.getDNI());
        jTextFieldDireccion.setText(corredorModificar.getDireccion());
        jTextFieldTelefono.setText(corredorModificar.getTelefonoContacto());
    }

    public JSpinner getjSpinnerFechaNacimiento() {
        return jSpinnerFechaNacimiento;
    }

    public void setjSpinnerFechaNacimiento(JSpinner jSpinnerFechaNacimiento) {
        this.jSpinnerFechaNacimiento = jSpinnerFechaNacimiento;
    }

    public JTextField getjTextFieldDireccion() {
        return jTextFieldDireccion;
    }

    public void setjTextFieldDireccion(JTextField jTextFieldDireccion) {
        this.jTextFieldDireccion = jTextFieldDireccion;
    }

    public JTextField getjTextFieldDni() {
        return jTextFieldDni;
    }

    public void setjTextFieldDni(JTextField jTextFieldDni) {
        this.jTextFieldDni = jTextFieldDni;
    }

    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    public void setjTextFieldNombre(JTextField jTextFieldNombre) {
        this.jTextFieldNombre = jTextFieldNombre;
    }

    public JTextField getjTextFieldTelefono() {
        return jTextFieldTelefono;
    }

    public void setjTextFieldTelefono(JTextField jTextFieldTelefono) {
        this.jTextFieldTelefono = jTextFieldTelefono;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerFechaNacimiento = new javax.swing.JSpinner();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jButtonAniadir = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonVerLista = new javax.swing.JButton();
        validationPanel = new org.netbeans.validation.api.ui.swing.ValidationPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNombre.setText("Nombre: ");

        jTextFieldNombre.setName("Nombre"); // NOI18N

        jLabel1.setText("DNI:");

        jTextFieldDni.setName("DNI"); // NOI18N

        jLabel2.setText("Fecha de nacimiento:");

        jSpinnerFechaNacimiento.setModel(new javax.swing.SpinnerDateModel());

        jLabelFechaNacimiento.setText("Dirección: ");

        jTextFieldDireccion.setName("Dirección"); // NOI18N

        jLabel3.setText("Teléfono:");

        jTextFieldTelefono.setName("Teléfono"); // NOI18N

        jButtonAniadir.setText("AÑADIR");
        jButtonAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAniadirActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("BORRAR");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("MODIFICAR");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonVerLista.setText("VER LISTA");
        jButtonVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAniadir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVerLista))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabelFechaNacimiento)
                            .addComponent(jLabel3))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldDni)
                            .addComponent(jSpinnerFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(validationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaNacimiento)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAniadir)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonVerLista))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAniadirActionPerformed

        //doy formato a la fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        String nombre = jTextFieldNombre.getText();
        String dni = jTextFieldDni.getText();
        Date fechaNacimiento = (Date) jSpinnerFechaNacimiento.getValue();
        String fecString = sdf.format(fechaNacimiento);
        String direccion = jTextFieldDireccion.getText();
        String telefonoContacto = jTextFieldTelefono.getText();

        Corredor corredor = new Corredor(nombre, dni, fecString, direccion, telefonoContacto);

        pp.getLogicaAplicacion().aniadirCorredor(corredor);
        // pp.getLogicaAplicacion().guardarCsv(pp.getLogicaAplicacion().getNOMBRE_ARCHIVO_CSV());

        dispose();
    }//GEN-LAST:event_jButtonAniadirActionPerformed

    private void jButtonVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerListaActionPerformed

        PantallaListaCorredores pantallaListaCorredores = new PantallaListaCorredores(pp, true, logicaAplicacion);

        pantallaListaCorredores.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonVerListaActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed

        PantallaListaCorredores pantallaListaCorredores = new PantallaListaCorredores(pp, true, logicaAplicacion);
        dispose();
        pantallaListaCorredores.setVisible(true);
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed

        PantallaListaCorredores pantallaListaCorredores = new PantallaListaCorredores(pp, true, logicaAplicacion);
        dispose();
        pantallaListaCorredores.setVisible(true);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAniadir;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVerLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JSpinner jSpinnerFechaNacimiento;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel;
    // End of variables declaration//GEN-END:variables
}
