/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package application;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import program.Calculator;
import program.ParseException;

/**
 *
 * @author Youssef
 */
public class CalculateurApplication extends javax.swing.JFrame {

    /**
     * Creates new form CalculateurApplication
     */
    public CalculateurApplication() {
        initComponents();
        this.setTitle("Calculateur");
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

        desktopPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        scrollPane1 = new javax.swing.JScrollPane();
        inputArea = new javax.swing.JTextArea();
        executeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        scrollPane2 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 255, 255));

        scrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entrée", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(102, 205, 255))); // NOI18N

        inputArea.setColumns(20);
        inputArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        inputArea.setRows(5);
        scrollPane1.setViewportView(inputArea);

        executeButton.setBackground(new java.awt.Color(105, 205, 255));
        executeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        executeButton.setForeground(new java.awt.Color(255, 255, 255));
        executeButton.setText("Executer");
        executeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(105, 205, 255));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Effacer");
        clearButton.setBorder(null);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        helpButton.setBackground(new java.awt.Color(102, 205, 255));
        helpButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helpButton.setForeground(new java.awt.Color(255, 255, 255));
        helpButton.setText("Aide");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        scrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sortie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(102, 205, 255))); // NOI18N

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        outputArea.setRows(10);
        scrollPane2.setViewportView(outputArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane2)
                    .addComponent(scrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(executeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 646, Short.MAX_VALUE)
                        .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(executeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        desktopPane.add(jPanel1);
        jPanel1.setBounds(0, 0, 1030, 490);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        desktopPane.add(jPanel2);
        jPanel2.setBounds(-2, 0, 960, 65);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void executeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButtonActionPerformed
        String input = inputArea.getText();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        Calculator calculator = new Calculator(inputStream);

        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        try {
            calculator.Program();
            String output = outputStream.toString();
            outputArea.append(output + "\n");
        } catch (ParseException e) {
            String[] lines = input.split("\n");
            int errorLine = e.currentToken.beginLine;
            String errorToken = e.currentToken.image;

            StringBuilder errorMessage = new StringBuilder();
            errorMessage.append("Erreur à la ligne ").append(errorLine).append(":\n");
            errorMessage.append(lines[errorLine - 1]).append("\n");
            // Add pointer to error position
            for(int i = 0; i < e.currentToken.beginColumn - 1; i++) {
                errorMessage.append(" ");
            }
            errorMessage.append("^\n");
            errorMessage.append("Problème: ").append(e.getMessage()).append("\n");

            // Add solution suggestions
            errorMessage.append("Solutions possibles:\n");
            if(e.expectedTokenSequences != null) {
                if(errorToken.equals(";")) {
                    errorMessage.append("- Il manque une expression avant le point-virgule\n");
                } else if(errorToken.equals(")")) {
                    errorMessage.append("- Vérifiez que les parenthèses sont bien équilibrées\n");
                    errorMessage.append("- Assurez-vous qu'il y a une expression entre les parenthèses\n");
                } else {
                    errorMessage.append("- Attendu: ");
                    for(int[] expectedSequence : e.expectedTokenSequences) {
                        errorMessage.append(calculator.tokenImage[expectedSequence[0]]).append(" ");
                    }
                    errorMessage.append("\n");
                }
            }

            outputArea.append(errorMessage.toString() + "\n");
        }

        System.setOut(System.out);
    }//GEN-LAST:event_executeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        inputArea.setText("");
        outputArea.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        AideInterface aide = new AideInterface();
        aide.setVisible(true);
    }//GEN-LAST:event_helpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CalculateurApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateurApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateurApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateurApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateurApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton executeButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JTextArea inputArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    // End of variables declaration//GEN-END:variables

}
