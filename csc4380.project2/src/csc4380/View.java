/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380;

import java.awt.event.ActionListener;

/**
 *
 * @author aaron
 */
public class View extends javax.swing.JFrame {


    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftDropDown = new javax.swing.JComboBox<>();
        rightDropDown = new javax.swing.JComboBox<>();
        leftAmount = new javax.swing.JTextField();
        rightAmount = new javax.swing.JTextField();
        button_swap = new javax.swing.JButton();
        leftSymbol = new javax.swing.JLabel();
        rightSymbol = new javax.swing.JLabel();
        button_convert = new javax.swing.JButton();
        button_clear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftDropDown.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        leftDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "US Dollars", "British Pounds" }));
        leftDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftDropDownActionPerformed(evt);
            }
        });

        rightDropDown.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rightDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "US Dollars", "British Pounds" }));
        rightDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightDropDownActionPerformed(evt);
            }
        });

        leftAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        leftAmount.setText("1.00");

        rightAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rightAmount.setText("1.00");

        button_swap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button_swap.setText("↔");

        leftSymbol.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        leftSymbol.setText("$");

        rightSymbol.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rightSymbol.setText("$");

        button_convert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button_convert.setText("Convert");

        button_clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button_clear.setText("Clear");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(leftSymbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leftDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leftAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_convert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_swap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(rightSymbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rightDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightAmount))
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_swap))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leftSymbol)
                    .addComponent(rightSymbol)
                    .addComponent(button_convert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_clear)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leftDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftDropDownActionPerformed
        leftSymbol.setText(currency_symbols[leftDropDown.getSelectedIndex()]);
    }//GEN-LAST:event_leftDropDownActionPerformed

    private void rightDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightDropDownActionPerformed
        rightSymbol.setText(currency_symbols[rightDropDown.getSelectedIndex()]);
    }//GEN-LAST:event_rightDropDownActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    
    //This method replaces the text in the left text box with s
    void setLeftVal(String s) {
        leftAmount.setText(s);
    }

    
    //This method replaces the value of the drop down with s
    void setLeftDropDown(String s) {
        for (int i = 0; i < leftDropDown.getItemCount(); i++) {
            if (leftDropDown.getItemAt(i).equals(s)) {
                leftDropDown.setSelectedIndex(i);
            }
        }
    }

    
    //This method replaces the value of the right text box with s
    void setRightVal(String s) {
        rightAmount.setText(s);
    }

    //This method replaces the value of the right drop down with s
    void setRightDropDown(String s) {
        for (int i = 0; i < rightDropDown.getItemCount(); i++) {
            if (rightDropDown.getItemAt(i).equals(s)) {
                rightDropDown.setSelectedIndex(i);
            }
        }
    }

    
    //This method returns what is currently stored in the left text box
    String getLeftText() {
      return leftAmount.getText();
    }

    
    //This method returns what is currently stored in the right drop down
    String getRightDropDown() {
        return rightDropDown.getSelectedItem().toString();
    }

    
    //This method returns what is currently stored 
    String getLeftDropDown() {
        return leftDropDown.getSelectedItem().toString();
    }

    
    //Add Action Listeners
    public void addbtnSwapListener(ActionListener listener) {
        this.button_swap.addActionListener(listener);
    }
    
    public void addbtnConvertListener(ActionListener listener) {
        this.button_convert.addActionListener(listener);
    }
    
    public void addbtnClearListener(ActionListener listener) {
        this.button_clear.addActionListener(listener);
    }
    
    
    
    
    
    
    private Controller c = new Controller();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_clear;
    private javax.swing.JButton button_convert;
    private javax.swing.JButton button_swap;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField leftAmount;
    private javax.swing.JComboBox<String> leftDropDown;
    private javax.swing.JLabel leftSymbol;
    private javax.swing.JTextField rightAmount;
    private javax.swing.JComboBox<String> rightDropDown;
    private javax.swing.JLabel rightSymbol;
    // End of variables declaration//GEN-END:variables
    private static String[] currency_symbols = {"$", "£"};
}
