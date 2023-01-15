package form;

import main.Connect;
import swing_new.ScrollBar;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Random;
import javax.swing.table.DefaultTableModel;


public class Form_Sales extends javax.swing.JPanel {
    //object untuk memasukan query ke database
    private Connect con = Connect.getConnection();
    
    private int TotalPrice = 0;
    private int Profit = 0;
    ResultSet rs=null;
    
    public Form_Sales() {
        initComponents();
        
        //bikin "Click here to reset" ada underline
        Font font=jLabel10.getFont();
        Map att = font.getAttributes();
        att.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jLabel10.setFont(font.deriveFont(att));
        
        //membuat warning text tidak terlihat
        Warning1.setVisible(false);
        Warning2.setVisible(false);
        
        //mengganti scrollbar yang lama jadi scrollbar baru (agar ui bagus)
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        
        
        //mengisi ID and detailID yang sudah di random secara otomatis
        jLabel6.setText(genID());
        jLabel7.setText(genDetailID());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing_new.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        panelBorder2 = new swing_new.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        InputID = new javax.swing.JTextField();
        InputQuantity = new javax.swing.JTextField();
        spTable = new javax.swing.JScrollPane();
        table = new swing_new.Table();
        jLabel5 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        Warning1 = new javax.swing.JLabel();
        Warning2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(883, 598));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Sales");

        AddButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText(" TOTAL: Rp. 200000");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Transaction ID :");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Detail ID           :");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("TR001");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("DT001");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setText("Item ID   :");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Quantity : ");

        InputID.setBackground(new java.awt.Color(242, 242, 242));

        InputQuantity.setBackground(new java.awt.Color(242, 242, 242));
        InputQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputQuantityActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Description", "Quantity", "Price"
            }
        ));
        spTable.setViewportView(table);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Total: Rp.");

        Total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Total.setText("0");

        ConfirmButton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        Warning1.setForeground(new java.awt.Color(255, 0, 51));
        Warning1.setText("*Please Input the Right Item ID");

        Warning2.setForeground(new java.awt.Color(255, 0, 51));
        Warning2.setText("*Please input Numric value");

        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Click Here to Clear Table..");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelBorder1Layout.createSequentialGroup()
                                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel6))
                                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7)))
                                            .addGap(232, 232, 232)
                                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9))
                                            .addGap(18, 18, 18)
                                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(InputID, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                .addComponent(InputQuantity))
                                            .addGap(30, 30, 30)
                                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Warning1)
                                                .addComponent(Warning2)))))
                                .addGap(830, 830, 830)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Warning1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Warning2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InputQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        //jika user pencet add button
        int id = 0;
        int quantity = 0;
        int inventory = 0;
        String desc = null;
        int price = 0;
        int buying =0;
        boolean  flag = true;
        
        //validate id(numeric)
        try {
            int test = Integer.parseInt(InputID.getText());
            String query = String.format("SELECT * FROM inventory WHERE id='%s'", Integer.parseInt(InputID.getText()));
            rs = con.executeQuery(query);
            
            rs.next();
            id = rs.getInt(1);
            desc = rs.getString(2);
            buying = rs.getInt(3);
            price = rs.getInt(4);
            inventory = rs.getInt(5);
            Warning1.setVisible(false);
            
        } catch (Exception e) {
            Warning1.setVisible(true);
            flag=false;
        }
        
        
        //validate quantity
        try {
            quantity = Integer.parseInt(InputQuantity.getText());
            price = price * quantity;
            Warning2.setVisible(false);
            
        } catch (Exception e) {
            Warning2.setText("*Please input Numric value");
            Warning2.setVisible(true);
            flag=false;
        }
        
        //cek apakah quantity yang dimasukan lebih besar dari inventory
        if(quantity>inventory){
            Warning2.setText("*We don't have enough inventory");
            Warning2.setVisible(true);
            flag=false;
        }
        
        //menambahkan item list ke table
        if(flag){
            TotalPrice += price;
            Profit += price-(buying*quantity);
            
            System.out.println(price);
            System.out.println(buying);
            System.out.println(quantity);
            System.out.println("");
            
            DecimalFormat df= new DecimalFormat("#,###");
            Total.setText(df.format(TotalPrice)); 
            
            table.addRow(new Object[]{id, desc, quantity, price});
           
            //jika berhasil di add maka warning text and input text akan kembali kosong
            Warning1.setVisible(false);
            Warning2.setVisible(false);
            Warning2.setText("*Please input Numric value");
            InputID.setText(null);
            InputQuantity.setText(null);
        }
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void InputQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputQuantityActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        //validate tabel tidak kosong
        if(table.getRowCount()==0){
            return;
        }
        
        //menambahkan sales ke database
        String query = String.format("INSERT INTO sales VALUES ('%s', '%s', '%s', '%s')", jLabel6.getText(), jLabel7.getText(), TotalPrice, Profit);
        con.executeUpdate(query);
        
        //meambahkan detail ke database
        for(int i=0; i<table.getRowCount(); i++){
            String itemID = table.getValueAt(i, 0).toString() ;
            int price = Integer.parseInt(table.getValueAt(i, 3).toString()) ;
            query = String.format("INSERT INTO details VALUES ('%s', '%s', '%s')", jLabel7.getText(), itemID, price);
            con.executeUpdate(query);
        }
        
        //update inventory database
        for(int i=0; i<table.getRowCount(); i++){
          
            int itemID = Integer.parseInt(table.getValueAt(i, 0).toString() );
            query = String.format("SELECT * FROM inventory WHERE id='%s'", itemID);
            rs = con.executeQuery(query);
            
            int quantity=0;
            
            try {
                rs.next();
                quantity = rs.getInt(5)-Integer.parseInt(table.getValueAt(i, 2).toString() );
            } catch (Exception e) {
                System.out.println("ERORR");
            }
            
            query = String.format("UPDATE inventory SET quantity='%s' WHERE id='%s'", quantity, itemID);
            con.executeUpdate(query);
        }
        
        //mengosongkan table jika sudah berhasil ditambahkan ke database
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
                
        //set new ID
        jLabel6.setText(genID());
        jLabel7.setText(genDetailID());
        
        //Reset total and profit ke 0
        TotalPrice = 0;
        Total.setText("0");
        Profit = 0;
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        //jika "Click here to reset" dipencet maka isi tabel(item list) akan di hilangkan
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        //jika mouse berada di "click here to reset" makan akan berubah jadi bold
        Font f = jLabel10.getFont();
        jLabel10.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        Font f = jLabel10.getFont();
        jLabel10.setFont(f.deriveFont(f.getStyle() & ~ Font.BOLD));
    }//GEN-LAST:event_jLabel10MouseExited

    //method untuk membuat id secara acak
    private String genID(){
        Random rand = new Random();
        int x1 = rand.nextInt(10);
        int x2 = rand.nextInt(10);
        int x3 = rand.nextInt(10);
        return "TR"+x1+x2+x3;
    }
    private String genDetailID(){
        Random rand = new Random();
        int x1 = rand.nextInt(10);
        int x2 = rand.nextInt(10);
        int x3 = rand.nextInt(10);
        return "DT"+x1+x2+x3;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField InputID;
    private javax.swing.JTextField InputQuantity;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Warning1;
    private javax.swing.JLabel Warning2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private swing_new.PanelBorder panelBorder1;
    private swing_new.PanelBorder panelBorder2;
    private javax.swing.JScrollPane spTable;
    private swing_new.Table table;
    // End of variables declaration//GEN-END:variables
}



