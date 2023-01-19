package main;
import java.sql.*;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    //variable untuk memasukan query ke database
    private Connect con = Connect.getConnection();
    
    public Register() {
        initComponents();
        txtID.setEnabled(false);
        autonumber();
    }
    
    //method untuk generate ID
    private void autonumber() {
        try{
            String sql = "SELECT * FROM login ORDER BY id DESC";
            ResultSet rs = con.executeQuery(sql);
            if(rs.next()){
                String NoID = rs.getString("id").substring(5);
                String ID = "" + (Integer.parseInt(NoID)+1);
                String Zero = "";
                
                if(ID.length()==1){
                    Zero = "00";
                }
                else if(ID.length()==2){
                    Zero = "0";
                }
                else if(ID.length()==3){
                    Zero = "";
                }
                txtID.setText("User_" + Zero + ID);
            }
            else{
                txtID.setText("User_001");
            }
            rs.close();

        }catch(Exception e){
            System.out.println("Autonumber error");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConPassword = new javax.swing.JPasswordField();
        cancelBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 240));
        getContentPane().setLayout(null);

        registLabel.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        registLabel.setForeground(new java.awt.Color(255, 255, 255));
        registLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registLabel.setText("REGISTRATION");
        registLabel.setToolTipText("");
        getContentPane().add(registLabel);
        registLabel.setBounds(200, 20, 270, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 100, 40, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("USERNAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 160, 140, 33);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 220, 140, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 280, 220, 30);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(310, 100, 220, 30);

        txtUsername.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsername.setToolTipText("");
        txtUsername.setName(""); // NOI18N
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        getContentPane().add(txtUsername);
        txtUsername.setBounds(310, 160, 220, 30);

        txtPassword.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtPasswordMouseReleased(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(310, 220, 220, 30);

        txtConPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtConPassword);
        txtConPassword.setBounds(310, 280, 220, 30);

        cancelBtn.setBackground(new java.awt.Color(255, 102, 102));
        cancelBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn);
        cancelBtn.setBounds(370, 340, 100, 40);

        registerBtn.setBackground(new java.awt.Color(0, 255, 51));
        registerBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerBtn);
        registerBtn.setBounds(200, 340, 100, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/firewatch-nature-m2-1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-440, -70, 1280, 540);

        setSize(new java.awt.Dimension(656, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtConPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConPasswordActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        //jika cancel button di pencet maka akan kembali ke form login
        this.dispose();
        Login a = new Login();
        a.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        //jika register button di pencet
        String id = txtID.getText().toString().trim();
        String username = txtUsername.getText().toString().trim();
        String password = txtPassword.getText().toString().trim();
        String conPassword = txtConPassword.getText().toString().trim();
        
        //melakukan validasi kepada username, password, dan conPassword
        if(!password.equals(conPassword)){
            JOptionPane.showMessageDialog(null, "Password does not match");
        }
        else if(password.equals("") || username.equals("")){
            JOptionPane.showMessageDialog(null, "Username or Password cannot be empty");
        }
        else if(username.length()<5 || username.length()>10){
            JOptionPane.showMessageDialog(null, "Username must be 5 - 10 Characters [inclusive]");
        }
        
        //jika validasi sudah benar maka akan diinput ke database
        else{
            try{
                String query = "INSERT INTO `login`(`id`, `username`, `password`) VALUES (?,?,?)";
                PreparedStatement input = con.prepareStatement(query);
                input.setString(1, id);
                input.setString(2, username);
                input.setString(3, password);
                input.executeUpdate();
                input.close();
                JOptionPane.showMessageDialog(null, "Account has been created Successfully");
            }catch(SQLException e){
                e.printStackTrace();
            }
            finally{
                this.dispose();
                Login a = new Login();
                a.setVisible(true);
            }
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void txtPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseReleased
        
    }//GEN-LAST:event_txtPasswordMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel registLabel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPasswordField txtConPassword;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
