/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Project5.java
 *
 * Created on 2 Sep, 2016, 7:33:41 PM
 */

package apps;

/**
 *
 * @author sagarika
 */
public class Project5 extends javax.swing.JFrame {

    /** Creates new form Project5 */
    public Project5() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRB1 = new javax.swing.JRadioButton();
        jRB2 = new javax.swing.JRadioButton();
        jRB3 = new javax.swing.JRadioButton();
        jTF1 = new javax.swing.JTextField();
        jTF2 = new javax.swing.JTextField();
        jTF3 = new javax.swing.JTextField();
        jL1 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jL3 = new javax.swing.JLabel();
        jTF4 = new javax.swing.JTextField();
        jL4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTF5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRB1);
        jRB1.setText("Area of Circle");
        jRB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB2);
        jRB2.setText("Area of Tiangle");
        jRB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB3);
        jRB3.setText("Area of Rectangle");
        jRB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB3ActionPerformed(evt);
            }
        });

        jTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF1ActionPerformed(evt);
            }
        });

        jTF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF3ActionPerformed(evt);
            }
        });

        jL1.setText("Radius");

        jL2.setText("Length");

        jL3.setText("Breadth");

        jL4.setText("Side");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL2)
                                    .addComponent(jL1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jL4)
                                        .addComponent(jL3))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jRB1)
                                .addGap(36, 36, 36)
                                .addComponent(jRB2)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRB3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTF3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTF2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTF1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addComponent(jTF4, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(424, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRB1)
                    .addComponent(jRB2)
                    .addComponent(jRB3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL2)
                    .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL3)
                    .addComponent(jTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL4))
                .addGap(55, 55, 55)
                .addComponent(jTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTF1ActionPerformed

    private void jTF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF3ActionPerformed

    private void jRB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB1ActionPerformed
        // TODO add your handling code here:
        double r=Double.parseDouble(jTF1.getText());
        double Area=(3.14*r*r);
        jTF5.setText(Double.toString(Area));
        

     




    }//GEN-LAST:event_jRB1ActionPerformed

    private void jRB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2ActionPerformed
        // TODO add your handling code here:
        double s=Double.parseDouble(jTF4.getText());
        double l=Double.parseDouble(jTF2.getText());
        double Area=(1/2*s*l);
        jTF5.setText(Double.toString(Area));

      
    }//GEN-LAST:event_jRB2ActionPerformed

    private void jRB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB3ActionPerformed
        // TODO add your handling code here:
         double l=Double.parseDouble(jTF2.getText());
         double b=Double.parseDouble(jTF3.getText());
         double Area=(l*b);
         jTF5.setText(Double.toString(Area));
    
    }//GEN-LAST:event_jRB3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jL4;
    private javax.swing.JRadioButton jRB1;
    private javax.swing.JRadioButton jRB2;
    private javax.swing.JRadioButton jRB3;
    private javax.swing.JTextField jTF1;
    private javax.swing.JTextField jTF2;
    private javax.swing.JTextField jTF3;
    private javax.swing.JTextField jTF4;
    private javax.swing.JTextField jTF5;
    // End of variables declaration//GEN-END:variables

}
