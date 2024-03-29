 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.PibgVoteApp;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import static my.PibgVoteApp.MainMenuGUI.CandidateListHolder.list;
import static my.PibgVoteApp.MainMenuGUI.VoterListHolder.voterlist;

/**
 *
 * @author User
 */
public class MainMenuGUI extends javax.swing.JFrame {

    private static MainMenuGUI mainMenuInstance;

    public class CandidateListHolder {

        public static ArrayList<Candidate> list = new ArrayList<>();
    }

    public class VoterListHolder {

        public static ArrayList<Voter> voterlist = new ArrayList<>();
    }

    /**
     * Creates new form MainMenuGUI
     */
    public MainMenuGUI() {
        initComponents();
        setImage();
        mainMenuInstance = this;
        loadCanData();
        loadVoterData();
        checkTime();
    }

    @Override
    protected void processWindowEvent(WindowEvent e) {
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            // prevent the window from being closed
            Object[] options = {"OK"};
            JOptionPane.showOptionDialog(this, "You are not allowed to exit!", "NO EXIT",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);
            return;
        }
        super.processWindowEvent(e);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminLogin = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        txtAdminPass = new javax.swing.JPasswordField();
        adminBackBtn = new javax.swing.JButton();
        adminLoginBtn = new javax.swing.JButton();
        voteLogin = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        voteLoginName = new javax.swing.JTextField();
        voteLoginIcNo = new javax.swing.JTextField();
        voterLoginBackBtn = new javax.swing.JButton();
        voterLoginCfmBtn = new javax.swing.JButton();
        icNoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        VoterReBtn = new javax.swing.JButton();
        CanReBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        VoteBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        adminBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        adminLogin.setTitle("Admin Login");
        adminLogin.setIconImage(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("Admin Login :)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Name: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Passcode:");

        adminBackBtn.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        adminBackBtn.setText("Back");
        adminBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBackBtnActionPerformed(evt);
            }
        });

        adminLoginBtn.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        adminLoginBtn.setText("Login");
        adminLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminLoginLayout = new javax.swing.GroupLayout(adminLogin.getContentPane());
        adminLogin.getContentPane().setLayout(adminLoginLayout);
        adminLoginLayout.setHorizontalGroup(
            adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLoginLayout.createSequentialGroup()
                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(adminLoginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminLoginLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3))
                            .addGroup(adminLoginLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAdmin)
                                    .addComponent(txtAdminPass, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))))
                    .addGroup(adminLoginLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(adminBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        adminLoginLayout.setVerticalGroup(
            adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAdminPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        voteLogin.setTitle("Voter Login");
        voteLogin.setIconImage(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("Voter Login");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Name:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("I/C No:");

        voteLoginIcNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                voteLoginIcNoKeyPressed(evt);
            }
        });

        voterLoginBackBtn.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        voterLoginBackBtn.setText("Back");
        voterLoginBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voterLoginBackBtnActionPerformed(evt);
            }
        });

        voterLoginCfmBtn.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        voterLoginCfmBtn.setText("Login");
        voterLoginCfmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voterLoginCfmBtnActionPerformed(evt);
            }
        });

        icNoLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout voteLoginLayout = new javax.swing.GroupLayout(voteLogin.getContentPane());
        voteLogin.getContentPane().setLayout(voteLoginLayout);
        voteLoginLayout.setHorizontalGroup(
            voteLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(voteLoginLayout.createSequentialGroup()
                .addGroup(voteLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(voteLoginLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6))
                    .addGroup(voteLoginLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(voteLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(voteLoginLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(voteLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(voteLoginLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(voteLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(voteLoginIcNo)
                                    .addGroup(voteLoginLayout.createSequentialGroup()
                                        .addComponent(icNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(voteLoginLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(voterLoginBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voterLoginCfmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        voteLoginLayout.setVerticalGroup(
            voteLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(voteLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(39, 39, 39)
                .addGroup(voteLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(voteLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(voteLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(voteLoginIcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(voteLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voterLoginBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voterLoginCfmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/PibgVoteApp/sekolah-tinggi-klang-logo-DBDC58156C-seeklogo.com.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N

        VoterReBtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        VoterReBtn.setText("Voter");
        VoterReBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VoterReBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoterReBtnActionPerformed(evt);
            }
        });

        CanReBtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        CanReBtn.setText("Candidate");
        CanReBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CanReBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanReBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CanReBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VoterReBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(CanReBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(VoterReBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Vote ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N

        VoteBtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        VoteBtn.setText("Vote");
        VoteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(VoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Admin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N

        adminBtn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        adminBtn.setText("Admin Login");
        adminBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("PIBG Commitee Election");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoteBtnActionPerformed
        // TODO add your handling code here:

        voteLogin.setVisible(true);
        voteLogin.setSize(415, 340);
        voteLogin.setLocationRelativeTo(null);
    }//GEN-LAST:event_VoteBtnActionPerformed

    private void CanReBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanReBtnActionPerformed
        // TODO add your handling code here:
        MainMenuGUI.closeMainMenu();
        new CandidateReg().setVisible(true);
    }//GEN-LAST:event_CanReBtnActionPerformed

    private void VoterReBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoterReBtnActionPerformed
        // TODO add your handling code here:
        MainMenuGUI.closeMainMenu();
        new VoterRegister().setVisible(true);
    }//GEN-LAST:event_VoterReBtnActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        // TODO add your handling code here:
        adminLogin.setVisible(true);
        adminLogin.setSize(415, 305);
        adminLogin.setLocationRelativeTo(null);
    }//GEN-LAST:event_adminBtnActionPerformed

    private void adminBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBackBtnActionPerformed
        // TODO add your handling code here:
        adminLogin.setVisible(false);
    }//GEN-LAST:event_adminBackBtnActionPerformed

    private void adminLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginBtnActionPerformed
        // TODO add your handling code here:
        String name = txtAdmin.getText();
        String pass = txtAdminPass.getText();

        if (name.equals("admin") && pass.equals("stia1123")) {
            adminLogin.setVisible(false);
            MainMenuGUI.closeMainMenu();
            new adminGUI().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Password", "Error", JOptionPane.ERROR_MESSAGE);
            txtAdmin.setText("");
            txtAdminPass.setText("");
        }
    }//GEN-LAST:event_adminLoginBtnActionPerformed

    private void voterLoginBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voterLoginBackBtnActionPerformed
        // TODO add your handling code here:
        voteLogin.setVisible(false);
    }//GEN-LAST:event_voterLoginBackBtnActionPerformed

    private void voterLoginCfmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voterLoginCfmBtnActionPerformed
        // TODO add your handling code here:
        if (voteLoginName.getText().isEmpty() || voteLoginIcNo.getText().isEmpty()) {
            Object[] options = {"OK"};
            JOptionPane.showOptionDialog(this, "Please fill in all fields", "Error",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0]);

        } else {
            String nameText = voteLoginName.getText().trim().toLowerCase();
            String icText = voteLoginIcNo.getText().trim().toLowerCase();

            String nameTextOrig = voteLoginName.getText();
            String icTextOrig = voteLoginIcNo.getText();

            boolean found = false;
            boolean registered = false;
            for (Voter v : voterlist) {
                if (v.getName().toLowerCase().trim().equals(nameText) && v.getIcNo().toLowerCase().trim().equals(icText)) {
                    registered = true;
                    if (v.getVoted().equals("-")) {
                        found = true;
                        break;
                    }
                }
            }

            if (found) {
                voteLogin.setVisible(false);
                MainMenuGUI.closeMainMenu();
                new VoteGUI(nameTextOrig, icTextOrig).setVisible(true);
            } else if (registered) {
                Object[] options = {"OK"};
                JOptionPane.showOptionDialog(this, "You have already voted before!", "Error",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, options, options[0]);
            } else {
                Object[] options = {"OK"};
                JOptionPane.showOptionDialog(this, "You have not registered as a voter!", "Error",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, options, options[0]);
            }
        }
    }//GEN-LAST:event_voterLoginCfmBtnActionPerformed

    private void voteLoginIcNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voteLoginIcNoKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (Character.isDigit(ch) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
            voteLoginIcNo.setEditable(true);
            icNoLabel.setText("");
        } else {
            voteLoginIcNo.setEditable(false);
            icNoLabel.setText("Please Enter Numbers Only!");
        }
    }//GEN-LAST:event_voteLoginIcNoKeyPressed

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
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuGUI().setVisible(true);
            }
        });
    }

    public static void closeMainMenu() {
        mainMenuInstance.setVisible(false);
    }

    private void loadCanData() {
        try {
            list.clear();
            File file = new File("Candidate.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String job = parts[2];
                int experience = Integer.parseInt(parts[3]);
                String achievements = parts[4];
                Candidate candidate = new Candidate(name, age, job, experience, achievements);
                list.add(candidate);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadVoterData() {
        try {
            voterlist.clear();
            File file = new File("Voter.txt");
            FileReader ff = new FileReader(file);
            BufferedReader bb = new BufferedReader(ff);
            String line;
            while ((line = bb.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String icNo = parts[1];
                String voted = parts[2];

                Voter voter = new Voter(name, icNo, voted);
                voterlist.add(voter);
            }
            bb.close();
            ff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void checkTime() {
        LocalDateTime now = LocalDateTime.now();
        if (Timeline.isRegistrationPeriodActive()) {
            CanReBtn.setEnabled(true);
            VoterReBtn.setEnabled(true);
            VoteBtn.setEnabled(false);
        } else {
            CanReBtn.setEnabled(false);
            VoterReBtn.setEnabled(false);

            if (Timeline.isVotingPeriodActive()) {
                VoteBtn.setEnabled(true);
            } else {
                VoteBtn.setEnabled(false);
            }
        }
    }

    public void setImage() {
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("sekolah-tinggi-klang-logo-DBDC58156C-seeklogo.com.png"));
        ImageIcon icon = new ImageIcon(image);
        setIconImage(icon.getImage());
        adminLogin.setIconImage(icon.getImage());
        voteLogin.setIconImage(icon.getImage());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanReBtn;
    private javax.swing.JButton VoteBtn;
    private javax.swing.JButton VoterReBtn;
    private javax.swing.JButton adminBackBtn;
    private javax.swing.JButton adminBtn;
    private javax.swing.JDialog adminLogin;
    private javax.swing.JButton adminLoginBtn;
    private javax.swing.JLabel icNoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JPasswordField txtAdminPass;
    private javax.swing.JDialog voteLogin;
    private javax.swing.JTextField voteLoginIcNo;
    private javax.swing.JTextField voteLoginName;
    private javax.swing.JButton voterLoginBackBtn;
    private javax.swing.JButton voterLoginCfmBtn;
    // End of variables declaration//GEN-END:variables
}
