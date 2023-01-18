package form;


import main.Connect;
import swing_new.ScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;


public class Form_Inventory extends javax.swing.JPanel {
    //object untuk memasukan query ke database
    private Connect con = Connect.getConnection();
    private int selected, id, vStock=0;
    
    public Form_Inventory() {
        initComponents();
        
        //ID
        ID.setEnabled(false);
        //set Waring Text menjadi null atau kosong
        Warning.setText(null);
        
        //kita ganti table scroll lama jadi yang baru
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

        //add button
        
        
        refresh();
    }
    public int getVstock(){
        return (vStock);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        panelBorder1 = new swing_new.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        InventoryTable = new swing_new.Table();
        panelBorder2 = new swing_new.PanelBorder();
        ID = new javax.swing.JTextField();
        Desc = new javax.swing.JTextField();
        Buy = new javax.swing.JTextField();
        Sell = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Warning = new javax.swing.JLabel();
        Add1 = new swing_new.Button();
        Update1 = new swing_new.Button();
        Remove1 = new swing_new.Button();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Inventory List");

        spTable.setBorder(null);

        InventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Description", "buying price", "Selling price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryTableMouseClicked(evt);
            }
        });
        spTable.setViewportView(InventoryTable);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(20, 208, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        ID.setBackground(new java.awt.Color(153, 0, 0));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        Desc.setBackground(new java.awt.Color(242, 242, 242));
        Desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescActionPerformed(evt);
            }
        });

        Buy.setBackground(new java.awt.Color(242, 242, 242));
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });

        Sell.setBackground(new java.awt.Color(242, 242, 242));
        Sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellActionPerformed(evt);
            }
        });

        Quantity.setBackground(new java.awt.Color(242, 242, 242));
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Description");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Buying Price");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Selling Price");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Quantity");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(127, 127, 127));
        jLabel7.setText("Inventory Menu");

        Warning.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Warning.setForeground(new java.awt.Color(255, 0, 51));
        Warning.setText("Warning Text !!!");

        Add1.setText("Add");
        Add1.setBorderColor(new java.awt.Color(153, 153, 255));
        Add1.setColorClick(new java.awt.Color(255, 255, 255));
        Add1.setColorOver(new java.awt.Color(153, 153, 255));
        Add1.setRadius(15);
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });

        Update1.setText("Update");
        Update1.setBorderColor(new java.awt.Color(153, 153, 255));
        Update1.setColorOver(new java.awt.Color(153, 153, 255));
        Update1.setRadius(15);
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });

        Remove1.setText("Remove");
        Remove1.setBorderColor(new java.awt.Color(153, 153, 255));
        Remove1.setColorOver(new java.awt.Color(153, 153, 255));
        Remove1.setRadius(15);
        Remove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Buy, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Sell)
                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(Warning, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Remove1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(63, 63, 63)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(Desc))
                .addGap(30, 30, 30)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sell, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Warning)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Remove1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescActionPerformed

    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyActionPerformed

    private void SellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void InventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryTableMouseClicked
        //jika table row di select maka semua textfield akan autofill informasi dari tabel
        selected = InventoryTable.getSelectedRow();
        
        ID.setText(InventoryTable.getValueAt(selected, 0).toString());
        Desc.setText(InventoryTable.getValueAt(selected, 1).toString());
        Buy.setText(InventoryTable.getValueAt(selected, 2).toString());
        Sell.setText(InventoryTable.getValueAt(selected, 3).toString());
        Quantity.setText(InventoryTable.getValueAt(selected, 4).toString());
    }//GEN-LAST:event_InventoryTableMouseClicked

    private void Remove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove1ActionPerformed
        //jika remove button dipencet
        
        //validasi apakah row ada yang diselect (id kosong)
        if(ID.getText().isEmpty()){
            Warning.setText("Please Select the Row!");
            return;
        }
        //jika validasi berhasil maka update stock card untuk di home form
        int price = Integer.parseInt(InventoryTable.getValueAt(selected, 2).toString());
        int quantity = Integer.parseInt(InventoryTable.getValueAt(selected, 4).toString());
        vStock-=(price*quantity);
        
        //remove dari table
        DefaultTableModel model = (DefaultTableModel) InventoryTable.getModel();
        model.removeRow(selected);
        InventoryTable.repaint();
        
       //remove from database
       String query = String.format("DELETE FROM `inventory` WHERE id=%s", Integer.parseInt(ID.getText()));
       con.executeUpdate(query);
        
       //jika berhasil maka semua textfield jadi kosong
        ID.setText(null);
        Desc.setText("");
        Buy.setText("");
        Sell.setText("");
        Quantity.setText("");
        Warning.setText(null);
    }//GEN-LAST:event_Remove1ActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
       //Generate ID
        int cnt = InventoryTable.getRowCount();
        
        if(cnt==0){
            id = 1;
        }else{
            id = 1 + (int) InventoryTable.getValueAt(cnt-1, 0);
        }
        
        //validate Desc (not numeric)
        if(Desc.getText().isEmpty()){
                Warning.setText("Description can't be Empty!");
                return;
        }
        try {
            int test = Integer.parseInt(Desc.getText());
            Warning.setText("Description must be a String!");
            return;
        } catch (Exception e) {
            
        }
        
        //validate Buy
        try {
            int test = Integer.parseInt(Buy.getText());
        } catch (Exception e) {
            Warning.setText("Buying Price must be Numeric!");
            return;
        }
        
        //validate Sell
        try {
            int test = Integer.parseInt(Sell.getText());
        } catch (Exception e) {
            Warning.setText("Selling Price must be Numeric!");
            return;
        }
        
        //validate Quantity
        try {
            int test = Integer.parseInt(Quantity.getText());
        } catch (Exception e) {
            Warning.setText("Quantity Price must be Numeric!");
            return;
        }
        
        
        //add ke table
        InventoryTable.addRow(new Object[]{id,Desc.getText(), Buy.getText(), Sell.getText(), Quantity.getText()});
       
        //add ke query
        int buying = Integer.parseInt(Buy.getText());
        int selling = Integer.parseInt(Sell.getText());
        int quantity = Integer.parseInt(Quantity.getText());
        String query=String.format("INSERT INTO inventory VALUES ('%s', '%s', '%s', '%s', '%s')", id, Desc.getText(), buying, selling, quantity);
        con.executeUpdate(query);
        
        //addnambahkan value stock care untuk di home home 
        int price = Integer.parseInt(Buy.getText());
        vStock += (price*quantity);
        
        //reset text field
        ID.setText(null);
        Desc.setText("");
        Buy.setText("");
        Sell.setText("");
        Quantity.setText("");
        Warning.setText(null);
    }//GEN-LAST:event_Add1ActionPerformed

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
          //validasi apakah row ada yang diselect (id kosong)
        if(ID.getText().isEmpty()){
            Warning.setText("Please Select the Row!");
            return;
        }
       
        //validate Desc (not numeric)
        try {
            int test = Integer.parseInt(Desc.getText());
            Warning.setText("Description must be a String!");
            return;
        } catch (Exception e) {
            if(Desc.getText().isEmpty()){
                Warning.setText("Description can't be Empty!");
            }
        }
        
        //validate Buy
        try {
            int test = Integer.parseInt(Buy.getText());
        } catch (Exception e) {
            Warning.setText("Buying Price must be Numeric!");
            return;
        }
        
        //validate Sell
        try {
            int test = Integer.parseInt(Sell.getText());
        } catch (Exception e) {
            Warning.setText("Selling Price must be Numeric!");
            return;
        }
        
        //validate Quantity
        try {
            int test = Integer.parseInt(Quantity.getText());
        } catch (Exception e) {
            Warning.setText("Quantity Price must be Numeric!");
            return;
        }
        
        //update database
        int buying = Integer.parseInt(Buy.getText());
        int selling = Integer.parseInt(Sell.getText());
        int quantity = Integer.parseInt(Quantity.getText());
        String query = String.format("UPDATE inventory SET id='%s', description='%s', buying_price='%s', selling_price='%s',quantity='%s' WHERE id='%s'", Integer.parseInt(ID.getText()), Desc.getText(), buying, selling, quantity, Integer.parseInt(ID.getText()));
        con.executeUpdate(query);
        
        //update stock value
        int oldPrice = Integer.parseInt(InventoryTable.getValueAt(selected, 2).toString());
        int oldQuantity = Integer.parseInt(InventoryTable.getValueAt(selected, 4).toString());
        
        int price = Integer.parseInt(Buy.getText());
        vStock = vStock - (oldQuantity*oldPrice) + (price*quantity);
        
        //update table
        InventoryTable.setValueAt(Desc.getText(), selected, 1);
        InventoryTable.setValueAt(Buy.getText(), selected, 2);
        InventoryTable.setValueAt(Sell.getText(), selected, 3);
        InventoryTable.setValueAt(Quantity.getText(), selected, 4);
        
        //reset text field
        ID.setText(null);
        Desc.setText("");
        Buy.setText("");
        Sell.setText("");
        Quantity.setText("");
        Warning.setText(null);
    }//GEN-LAST:event_Update1ActionPerformed

    public void refresh(){
        //merefresh tabel
        DefaultTableModel model = (DefaultTableModel) InventoryTable.getModel();
        model.setRowCount(0);
        vStock=0;
        
        //add data to table
        String query = "SELECT * FROM inventory";
        ResultSet rs = con.executeQuery(query);
        try {
            while(rs.next()){
                int id = rs.getInt(1);
                String desc= rs.getString(2);
                int buy = rs.getInt(3);
                int sell = rs.getInt(4);
                int quantity = rs.getInt(5);
                vStock += buy * quantity;
                InventoryTable.addRow(new Object[]{id, desc, buy, sell, quantity});
            }
        } catch (Exception e) {
            System.out.println("ERROR WOI!");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing_new.Button Add1;
    private javax.swing.JTextField Buy;
    private javax.swing.JTextField Desc;
    private javax.swing.JTextField ID;
    private swing_new.Table InventoryTable;
    private javax.swing.JTextField Quantity;
    private swing_new.Button Remove1;
    private javax.swing.JTextField Sell;
    private swing_new.Button Update1;
    private javax.swing.JLabel Warning;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane panel;
    private swing_new.PanelBorder panelBorder1;
    private swing_new.PanelBorder panelBorder2;
    private javax.swing.JScrollPane spTable;
    // End of variables declaration//GEN-END:variables
}
