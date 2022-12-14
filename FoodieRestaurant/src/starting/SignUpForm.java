/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starting;

import customerPackage.Customer;
import javax.swing.JOptionPane;
import managerPackage.Manager;

/**
 *
 * @author PC
 */
public class SignUpForm extends javax.swing.JFrame
{

    /**
     * Creates new form SignUpForm
     */
    String type;

    public SignUpForm()
    {
        initComponents();
        this.setLocationRelativeTo(null); //center form in screen
    }

    public SignUpForm(String s)
    {
        initComponents();
        txtPasswordSignup.setEchoChar('*');
        this.setLocationRelativeTo(null); //center form in screen
        type = s;
        if ("Manager".equals(type))
        {
            lbAddressSignup.setVisible(false);
            txtAddressSignup.setVisible(false);
        }
        txtPhoneSignup.setText("");
    }

    /**
     *
     */
    public static void setTextField()
    {
        txtUsernameSignup.setText("");
    }

    /**
     *
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlSignUp = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbNameSignup = new javax.swing.JLabel();
        txtPhoneSignup = new javax.swing.JTextField();
        lblPasswordSignup = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        txtPasswordSignup = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        lbLogo1 = new javax.swing.JLabel();
        lbAddressSignup = new javax.swing.JLabel();
        lbMobileSignup = new javax.swing.JLabel();
        txtUsernameSignup = new javax.swing.JTextField();
        txtAddressSignup = new javax.swing.JTextField();
        lbUsernameSignup = new javax.swing.JLabel();
        txtNameSignup = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGNUP");
        setUndecorated(true);

        pnlSignUp.setBackground(new java.awt.Color(255, 255, 255));

        lbLogo.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo.setFont(new java.awt.Font("Rockwell Condensed", 0, 55)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(127, 72, 101));
        lbLogo.setText("Create Account");
        lbLogo.setToolTipText("");

        lbNameSignup.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        lbNameSignup.setText("Name");

        txtPhoneSignup.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        txtPhoneSignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 72, 101)));
        txtPhoneSignup.setOpaque(false);
        txtPhoneSignup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtPhoneSignupActionPerformed(evt);
            }
        });

        lblPasswordSignup.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        lblPasswordSignup.setText("Password");

        btnSignUp.setBackground(new java.awt.Color(255, 213, 0));
        btnSignUp.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(127, 72, 101));
        btnSignUp.setText("CREATE YOUR ACCOUNT");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSignUpActionPerformed(evt);
            }
        });

        txtPasswordSignup.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        txtPasswordSignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 72, 101)));
        txtPasswordSignup.setName(""); // NOI18N
        txtPasswordSignup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtPasswordSignupActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(144, 70));

        lbLogo1.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo1.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        lbLogo1.setForeground(new java.awt.Color(127, 72, 101));
        lbLogo1.setText("FOODIE");
        lbLogo1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lbAddressSignup.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        lbAddressSignup.setText("Address");

        lbMobileSignup.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        lbMobileSignup.setText("Mobile Phone");

        txtUsernameSignup.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        txtUsernameSignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 72, 101)));
        txtUsernameSignup.setOpaque(false);
        txtUsernameSignup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtUsernameSignupActionPerformed(evt);
            }
        });

        txtAddressSignup.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        txtAddressSignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 72, 101)));
        txtAddressSignup.setOpaque(false);
        txtAddressSignup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtAddressSignupActionPerformed(evt);
            }
        });

        lbUsernameSignup.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        lbUsernameSignup.setText("Username");

        txtNameSignup.setFont(new java.awt.Font("Rockwell", 0, 22)); // NOI18N
        txtNameSignup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 72, 101)));
        txtNameSignup.setOpaque(false);
        txtNameSignup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNameSignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSignUpLayout = new javax.swing.GroupLayout(pnlSignUp);
        pnlSignUp.setLayout(pnlSignUpLayout);
        pnlSignUpLayout.setHorizontalGroup(
            pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSignUpLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(pnlSignUpLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addComponent(lbNameSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNameSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSignUpLayout.createSequentialGroup()
                        .addComponent(lbMobileSignup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPhoneSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPasswordSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAddressSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPasswordSignup, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(txtAddressSignup)))
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addComponent(lbUsernameSignup)
                        .addGap(78, 78, 78)
                        .addComponent(txtUsernameSignup)))
                .addGap(29, 29, 29))
            .addGroup(pnlSignUpLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnSignUp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSignUpLayout.setVerticalGroup(
            pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignUpLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(lbLogo)
                .addGap(53, 53, 53)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNameSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMobileSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsernameSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsernameSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPasswordSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddressSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddressSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneSignupActionPerformed

    private void txtPasswordSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordSignupActionPerformed

    private void txtUsernameSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameSignupActionPerformed

    private void txtAddressSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressSignupActionPerformed

    private void txtNameSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameSignupActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSignUpActionPerformed
    {//GEN-HEADEREND:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        try
        {
            String username = txtUsernameSignup.getText();
            String password = String.valueOf(txtPasswordSignup.getPassword());
            String mobilePhone = txtPhoneSignup.getText();
            String name = txtNameSignup.getText();
            String address = txtAddressSignup.getText();
            if (!username.isEmpty() && !password.isEmpty() && !mobilePhone.isEmpty() && !name.isEmpty())
            {
                try
                {
                    //int mobile = Integer.valueOf(mobilePhone);

                    if (mobilePhone.length() < 11)
                    {
                        JOptionPane.showMessageDialog(this, "Invalid Mobile Phone, Mobile Phone must consist of 11 numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                        txtPhoneSignup.setText("");
                    }
                    else if (username.contains(" "))
                    {
                        JOptionPane.showMessageDialog(this, "Username can't contain spaces", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                        txtUsernameSignup.setText("");
                    }
                    else
                    {
                        if ("Manager".equals(type))
                        {
                            Manager m = new Manager(name, username, mobilePhone, password);
                            boolean success = m.register();
                            if (success)
                            {
                                this.dispose();
                            }
                        }
                        else //customer
                        {
                            if (address.isEmpty())
                            {
                                JOptionPane.showMessageDialog(this, "Please fill all TextFields", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                            }
                            else
                            {
                                int id = Customer.getNoCustomers()+1;
                                Customer c = new Customer(id, name, username, mobilePhone, password, address);
                              
                                boolean success = c.register();
                                if (success)
                                {
                                    this.dispose();
                                }
                            }
                        }
                    }

                } catch (NumberFormatException ne)
                {
                    JOptionPane.showMessageDialog(this, "Invalid Mobile Phone, please enter numbers only", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    txtPhoneSignup.setText("");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please fill all TextFields", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(SignUpForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SignUpForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SignUpForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SignUpForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new SignUpForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAddressSignup;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbLogo1;
    private javax.swing.JLabel lbMobileSignup;
    private javax.swing.JLabel lbNameSignup;
    private javax.swing.JLabel lbUsernameSignup;
    private javax.swing.JLabel lblPasswordSignup;
    private javax.swing.JPanel pnlSignUp;
    private javax.swing.JTextField txtAddressSignup;
    private javax.swing.JTextField txtNameSignup;
    private javax.swing.JPasswordField txtPasswordSignup;
    private javax.swing.JTextField txtPhoneSignup;
    private static javax.swing.JTextField txtUsernameSignup;
    // End of variables declaration//GEN-END:variables
}
