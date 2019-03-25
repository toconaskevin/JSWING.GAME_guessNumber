package gameventana;

import javax.swing.JOptionPane;

public class ventana2 extends javax.swing.JFrame {

    public ventana2() {
        initComponents();
    }
    
    data datos2 = new data();
    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intentoButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        numeroB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        intentoButton.setText("Probar");
        intentoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intentoButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        numeroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroBActionPerformed(evt);
            }
        });

        jLabel1.setText("Intenta adivinar el numero. Tenes "+datos2.intentosMAX+" intentos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(intentoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numeroB, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(numeroB, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intentoButton)
                    .addComponent(jButton2))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void numeroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroBActionPerformed
    }//GEN-LAST:event_numeroBActionPerformed

    private void intentoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intentoButtonActionPerformed
        datos2.capturaDatos2();
        datos2.proceso();
    }//GEN-LAST:event_intentoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton intentoButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField numeroB;
    // End of variables declaration//GEN-END:variables
}
