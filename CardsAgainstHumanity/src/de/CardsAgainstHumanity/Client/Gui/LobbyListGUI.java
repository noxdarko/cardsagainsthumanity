/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LobbyListGUI.java
 *
 * Created on 26.06.2012, 10:54:37
 */
package de.CardsAgainstHumanity.Client.Gui;

import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author schlefix
 */
public class LobbyListGUI extends javax.swing.JPanel {
    MainGUI parent;
    /** Creates new form LobbyListGUI */
    public LobbyListGUI(MainGUI parent) {
        initComponents();
        for (int i = 0; i < 10; i++) {
            jPanel1.add(new LobbyPanel(), new AbsoluteConstraints(0, i*65, -1, -1));
       
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("lobbyListPanel"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jTextArea1.setText("Servernachricht an alle Lobbys: Hallo Welt, viel spaß mit Cards against Humanity");
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 720, 110));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane2.setViewportView(jPanel1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 760, 370));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("your Lobbys");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
