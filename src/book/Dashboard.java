/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import javax.swing.JOptionPane;

/**
 *
 * @author Sofia
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        returnbook = new javax.swing.JButton();
        borrowbook = new javax.swing.JButton();
        borrowedbooks = new javax.swing.JButton();
        viewavailable = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        inputbook = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-borrow-book-100.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 100, 90, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-return-book-100.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(620, 100, 90, 90);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-open-book-100.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(510, 280, 110, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-books-100.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 250, 90, 110);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-log-out-50 (1).png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(800, 0, 50, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-admin-75 (1).png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 150, 80, 80);

        returnbook.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        returnbook.setText("Return a Book");
        returnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbookActionPerformed(evt);
            }
        });
        jPanel1.add(returnbook);
        returnbook.setBounds(600, 200, 140, 30);

        borrowbook.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        borrowbook.setText("Borrow a Book");
        borrowbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowbookActionPerformed(evt);
            }
        });
        jPanel1.add(borrowbook);
        borrowbook.setBounds(390, 200, 180, 30);

        borrowedbooks.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        borrowedbooks.setText("View Borrowed Books");
        borrowedbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowedbooksActionPerformed(evt);
            }
        });
        jPanel1.add(borrowedbooks);
        borrowedbooks.setBounds(270, 370, 170, 30);

        viewavailable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        viewavailable.setText("View Available Books");
        viewavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewavailableActionPerformed(evt);
            }
        });
        jPanel1.add(viewavailable);
        viewavailable.setBounds(480, 370, 180, 30);

        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setText("Admin");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(30, 230, 80, 30);

        inputbook.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        inputbook.setText("Add Books");
        inputbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputbookActionPerformed(evt);
            }
        });
        jPanel1.add(inputbook);
        inputbook.setBounds(190, 200, 170, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icons8-more-details-100.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(220, 100, 100, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/3.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 850, 478);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Log-out Successfully");
            
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void borrowedbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowedbooksActionPerformed
        // TODO add your handling code here:
            View_Borrowed View_BorrowedFrame = new View_Borrowed();
            View_BorrowedFrame.setVisible(true);
            View_BorrowedFrame.pack();
            View_BorrowedFrame.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_borrowedbooksActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
            Admin AdminFrame = new Admin();
            AdminFrame.setVisible(true);
            AdminFrame.pack();
            AdminFrame.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void inputbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbookActionPerformed
        // TODO add your handling code here:
            Input_Book Input_BookFrame = new Input_Book();
            Input_BookFrame.setVisible(true);
            Input_BookFrame.pack();
            Input_BookFrame.setLocationRelativeTo(null);
            this.dispose();
        
    }//GEN-LAST:event_inputbookActionPerformed

    private void borrowbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowbookActionPerformed
        // TODO add your handling code here:
            Borrow_Book Borrow_BookFrame = new Borrow_Book();
            Borrow_BookFrame.setVisible(true);
            Borrow_BookFrame.pack();
            Borrow_BookFrame.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_borrowbookActionPerformed

    private void returnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbookActionPerformed
        // TODO add your handling code here:
            Return_Book Return_BookFrame = new Return_Book();
            Return_BookFrame.setVisible(true);
            Return_BookFrame.pack();
            Return_BookFrame.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_returnbookActionPerformed

    private void viewavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewavailableActionPerformed
        // TODO add your handling code here:
            View_Available View_AvailableFrame = new View_Available();
            View_AvailableFrame.setVisible(true);
            View_AvailableFrame.pack();
            View_AvailableFrame.setLocationRelativeTo(null);
            this.dispose();
    }//GEN-LAST:event_viewavailableActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrowbook;
    private javax.swing.JButton borrowedbooks;
    private javax.swing.JButton inputbook;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton returnbook;
    private javax.swing.JButton viewavailable;
    // End of variables declaration//GEN-END:variables
}
