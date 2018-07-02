package guimatricula;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUIMatriculaEstudiantes extends javax.swing.JFrame {
    String estudiantes[][]; 
    List<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes>(); 
    DefaultTableModel modeloTablaEstudiantes;
    DefaultComboBoxModel modeloComboBoxEstudiantes = new DefaultComboBoxModel(listaEstudiantes.toArray());
    
    String materias[][];
    List<Materias> listaMaterias = new ArrayList<Materias>();
    DefaultTableModel modeloTablaMaterias;
    DefaultComboBoxModel modeloComboBoxMaterias = new DefaultComboBoxModel(listaMaterias.toArray());
    
    String matriculas[][];
    DefaultTableModel modeloTablaMatricula;

    /**
     * Creates new form GUIMatriculaEstudiantes
     */
    public GUIMatriculaEstudiantes() {
        initComponents();
        
        String titulosTablaEstudiante[] = new String[]{"Nombre", "Apellido", "Edad"};
        modeloTablaEstudiantes = new DefaultTableModel(estudiantes, titulosTablaEstudiante); //Mi matriz de datos son los estudiantes
        tableEstudiante.setModel(modeloTablaEstudiantes);
        
        String titulosTablaMaterias[] = new String[]{"Materia"};
        modeloTablaMaterias = new DefaultTableModel(materias, titulosTablaMaterias);
        tableMaterias.setModel(modeloTablaMaterias);
        
        String titulosTablaMatricula[] = new String[]{"Materia","Estudiante"};
        modeloTablaMatricula = new DefaultTableModel(matriculas, titulosTablaMatricula);
        tableMatricula.setModel(modeloTablaMatricula);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstudiante = new javax.swing.JTable();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textEdad = new javax.swing.JTextField();
        buttonRegistrarEstudiante = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMaterias = new javax.swing.JTable();
        labelMateria = new javax.swing.JLabel();
        textMaterias = new javax.swing.JTextField();
        buttonRegistrarMaterias = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelEstudiantes = new javax.swing.JLabel();
        labelMaterias = new javax.swing.JLabel();
        comboBoxMaterias = new javax.swing.JComboBox();
        comboBoxEstudiantes = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMatricula = new javax.swing.JTable();
        buttonRegistrarMatricula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableEstudiante);

        labelNombre.setText("Nombre:");

        labelApellido.setText("Apellido:");

        labelEdad.setText("Edad:");

        buttonRegistrarEstudiante.setText("Registrar");
        buttonRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addGap(18, 18, 18)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelApellido)
                            .addComponent(labelEdad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonRegistrarEstudiante)))))
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEdad)
                    .addComponent(textEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRegistrarEstudiante))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estudiante", jPanel1);

        tableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableMaterias);

        labelMateria.setText("Materia:");

        buttonRegistrarMaterias.setText("Registrar");
        buttonRegistrarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarMateriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(buttonRegistrarMaterias)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMateria)
                .addGap(25, 25, 25)
                .addComponent(textMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMateria)
                    .addComponent(textMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(buttonRegistrarMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("Materia", jPanel2);

        labelEstudiantes.setText("Estudiante:");

        labelMaterias.setText("Materia:");

        tableMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableMatricula);

        buttonRegistrarMatricula.setText("Registrar");
        buttonRegistrarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(buttonRegistrarMatricula))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(labelMaterias)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(labelEstudiantes)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaterias)
                    .addComponent(labelEstudiantes)
                    .addComponent(comboBoxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(buttonRegistrarMatricula)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Matricula", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarEstudianteActionPerformed
        // TODO add your handling code here:
        String nombreEstudiante = textNombre.getText();
        String apellidoEstudiante = textApellido.getText();
        String edadEstudiante = textEdad.getText();
        
        if(nombreEstudiante.equals("") || apellidoEstudiante.equals("") || edadEstudiante.equals("")){
            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Debes llenar todos los campos", "ADVERTENCIA", iconoAdvertencia);
        }else{
            modeloTablaEstudiantes.addRow(new String[]{nombreEstudiante,apellidoEstudiante,edadEstudiante});
            Estudiantes alumno = new Estudiantes(apellidoEstudiante, nombreEstudiante,""); //No le voy a pasar la edad al comboBox, por eso el " "
            comboBoxEstudiantes.addItem(alumno); 
        
        }
        
        
    }//GEN-LAST:event_buttonRegistrarEstudianteActionPerformed

    private void buttonRegistrarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarMateriasActionPerformed
        // TODO add your handling code here:
        String nombreMateria = textMaterias.getText(); 
        
         if(nombreMateria.equals("")){
            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar una materia", "ADVERTENCIA", iconoAdvertencia);
        }else{
            modeloTablaMaterias.addRow(new String[]{nombreMateria});
            Materias asignatura = new Materias(nombreMateria);
            comboBoxMaterias.addItem(asignatura); //A mi combobox le añado el item regisrado.
           
         }
    }//GEN-LAST:event_buttonRegistrarMateriasActionPerformed

    private void buttonRegistrarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarMatriculaActionPerformed
        // TODO add your handling code here:
        String materias = comboBoxMaterias.getSelectedItem().toString();
        String estudiantes = comboBoxEstudiantes.getSelectedItem().toString();
        modeloTablaMatricula.addRow(new String[]{materias, estudiantes});
        
        System.out.println("Usted seleccionó la materia: "+comboBoxMaterias.getSelectedItem());
        System.out.println("Usted seleccionó el estudiante: "+comboBoxEstudiantes.getSelectedItem());
        System.out.println("");
    }//GEN-LAST:event_buttonRegistrarMatriculaActionPerformed

    
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
            java.util.logging.Logger.getLogger(GUIMatriculaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMatriculaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMatriculaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMatriculaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMatriculaEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegistrarEstudiante;
    private javax.swing.JButton buttonRegistrarMaterias;
    private javax.swing.JButton buttonRegistrarMatricula;
    private javax.swing.JComboBox comboBoxEstudiantes;
    private javax.swing.JComboBox comboBoxMaterias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelEstudiantes;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelMaterias;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTable tableEstudiante;
    private javax.swing.JTable tableMaterias;
    private javax.swing.JTable tableMatricula;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textMaterias;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
