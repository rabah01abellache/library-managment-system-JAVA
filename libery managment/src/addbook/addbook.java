/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addbook;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import static java.awt.JobAttributes.DestinationType.FILE;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mainpage.mainPage;

/**
 *
 * @author PC
 */
public class addbook extends javax.swing.JFrame {

    /**
     * Creates new form addbook
     */
    public addbook() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("ic.png")).getImage();
        this.setIconImage(icon);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        nametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        writertxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        pubtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loghatxt = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        pagestxt = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        addbtn = new java.awt.Button();
        back = new javax.swing.JLabel();
        dat = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("add book");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Add Some Books ?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("BOOK ID :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 20));

        idtxt.setBackground(new java.awt.Color(189, 195, 199));
        idtxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        idtxt.setForeground(new java.awt.Color(51, 51, 51));
        idtxt.setToolTipText("");
        idtxt.setBorder(null);
        idtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idtxtKeyTyped(evt);
            }
        });
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 280, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 280, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 280, 20));

        nametxt.setBackground(new java.awt.Color(189, 195, 199));
        nametxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nametxt.setForeground(new java.awt.Color(51, 51, 51));
        nametxt.setToolTipText("");
        nametxt.setBorder(null);
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 280, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("FULL NAME :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 280, 20));

        writertxt.setBackground(new java.awt.Color(189, 195, 199));
        writertxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        writertxt.setForeground(new java.awt.Color(51, 51, 51));
        writertxt.setToolTipText("");
        writertxt.setBorder(null);
        jPanel1.add(writertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 280, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("WRITER :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 280, 20));

        pubtxt.setBackground(new java.awt.Color(189, 195, 199));
        pubtxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pubtxt.setForeground(new java.awt.Color(51, 51, 51));
        pubtxt.setToolTipText("");
        pubtxt.setBorder(null);
        jPanel1.add(pubtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 280, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PUBLISHER :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("LANGUAGE :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 90, 20));

        loghatxt.setBackground(new java.awt.Color(189, 195, 199));
        loghatxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loghatxt.setForeground(new java.awt.Color(51, 51, 51));
        loghatxt.setToolTipText("");
        loghatxt.setBorder(null);
        jPanel1.add(loghatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 280, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 280, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("NUMER OF PAGES :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 150, 20));

        pagestxt.setBackground(new java.awt.Color(189, 195, 199));
        pagestxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pagestxt.setForeground(new java.awt.Color(51, 51, 51));
        pagestxt.setToolTipText("");
        pagestxt.setBorder(null);
        pagestxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pagestxtKeyTyped(evt);
            }
        });
        jPanel1.add(pagestxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 280, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 280, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText(" RELEASE DATE :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 150, 20));

        addbtn.setBackground(new java.awt.Color(52, 152, 219));
        addbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setLabel("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 280, 30));

        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
        jPanel1.add(dat, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 220, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addbook/addbook.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        if(idtxt.getText().equals("")|| nametxt.getText().equals("")|| writertxt.getText().equals("")|| pubtxt.getText().equals("")|| loghatxt.getText().equals("") || pagestxt.getText().equals("") ) {
            JOptionPane.showMessageDialog(this, "Please Enter All Data !!");
        }else{
            String data[] = {idtxt.getText(),nametxt.getText(),writertxt.getText(),pubtxt.getText(),loghatxt.getText(),pagestxt.getText(),};
            String nameis = nametxt.getText();
            String idis = idtxt.getText();
            String writeris = writertxt.getText();
            String pubis = pubtxt.getText();
            String loghais = loghatxt.getText();
            String pagesais = pagestxt.getText();
            String date = dat.getDate().toString();
            
           JOptionPane.showMessageDialog(this, nameis + " is added.");
            
            
            //save to txt
           
       
        
        try {
            FileWriter Writer = new FileWriter("books.txt",true);
            Writer.write(""+idis+";;"+nameis+";;"+writeris+";;"+pubis+";;"+loghais+";;"+pagesais+"");
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            
            setVisible(false);
               new addbook().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Run The App As An Administrator");
        }

        }
        
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        mainPage gotomain = new mainPage();
        gotomain.show();
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void pagestxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagestxtKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c) || (c== KeyEvent.VK_BACKSPACE) ||c == KeyEvent.VK_DELETE)){
	evt.consume();
}
    }//GEN-LAST:event_pagestxtKeyTyped

    private void idtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idtxtKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c) || (c== KeyEvent.VK_BACKSPACE) ||c == KeyEvent.VK_DELETE)){
	evt.consume();
}
    }//GEN-LAST:event_idtxtKeyTyped

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
            java.util.logging.Logger.getLogger(addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addbtn;
    private javax.swing.JLabel back;
    private com.toedter.calendar.JDateChooser dat;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField loghatxt;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField pagestxt;
    private javax.swing.JTextField pubtxt;
    private javax.swing.JTextField writertxt;
    // End of variables declaration//GEN-END:variables
}
