package form;

import main.Connect;
import model.Model_Card;
import swing_new.ScrollBar;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Form_Home extends javax.swing.JPanel {
    private Integer vStock=0, vProfit=0; 
    private Connect con = Connect.getConnection();
    
    public Form_Home() {
        initComponents();
        //set "Click here to reset" ada underline
        Font font=jLabel2.getFont();
        Map att = font.getAttributes();
        att.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jLabel2.setFont(font.deriveFont(att));
        
        
        Stock.setData(new Model_Card(new ImageIcon(getClass().getResource("/images/stock.png")), "Total Stock", "Rp. 0"));
        Profit.setData(new Model_Card(new ImageIcon(getClass().getResource("/images/profit.png")), "Total Profit", "Rp. 0"));
        Transaction.setData(new Model_Card(new ImageIcon(getClass().getResource("/images/flag.png")), "Total Transaction", "0 Transactions"));
        
        //memasukan scrollbar tabel yang baru
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        refresh();
        
        
    }
    
    public void setVstock(int x){
        vStock = x;
        DecimalFormat df= new DecimalFormat("#,###");
        
        Stock.setValue("Rp. "+df.format(vStock)); 
        
    }
    public void setVprofit(int x){
        vProfit = x;DecimalFormat df= new DecimalFormat("#,###");
        
        if(x>=0){
           Profit.setValue("+ Rp. "+df.format(vProfit)); 
        }else{
           Profit.setValue("- Rp. "+df.format(vProfit)); 
        }
    }
    public void setVtransaction(int x){
        Transaction.setValue(x + " Transactions");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        Stock = new swing_new.Card();
        Transaction = new swing_new.Card();
        Profit = new swing_new.Card();
        panelBorder1 = new swing_new.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new swing_new.Table();
        jLabel2 = new javax.swing.JLabel();

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        Stock.setColor1(new java.awt.Color(241, 208, 62));
        Stock.setColor2(new java.awt.Color(221, 184, 61));
        panel.add(Stock);

        Transaction.setColor1(new java.awt.Color(186, 123, 247));
        Transaction.setColor2(new java.awt.Color(167, 94, 236));
        panel.add(Transaction);

        Profit.setColor1(new java.awt.Color(0, 255, 51));
        Profit.setColor2(new java.awt.Color(0, 153, 0));
        panel.add(Profit);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Transaction History");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Detail ID", "Transaction Value", "Profit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Click Here to Reset..");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //jika click here to reset dipencet
        
        //clear table
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        //reset card value
        setVprofit(0);
        setVtransaction(0);
        
        //clear database
        String query = "DELETE FROM `sales`";
        con.executeUpdate(query);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        //jika mouse berada di text "Click here to reset" maka akan jadi bold
        Font f = jLabel2.getFont();
        jLabel2.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        Font f = jLabel2.getFont();
        jLabel2.setFont(f.deriveFont(f.getStyle() & ~ Font.BOLD));
    }//GEN-LAST:event_jLabel2MouseExited

    public void refresh(){
        //refresh tampilan form
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        int TotalProfit=0;
        //add data to table
        String query = "SELECT * FROM sales";
        
        ResultSet rs = con.executeQuery(query);
        
        try {
            while(rs.next()){
                String id = rs.getString(1);
                String detail= rs.getString(2);
                int value = rs.getInt(3);
                int profit = rs.getInt(4);
                TotalProfit += profit;
                
                table.addRow(new Object[]{id, detail, value, profit});
            }
        } catch (Exception e) {
            System.out.println("ERROR WOI!");
        }
        
        //set card value
        setVprofit(TotalProfit);
        setVtransaction(table.getRowCount());
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public swing_new.Card Profit;
    public swing_new.Card Stock;
    public swing_new.Card Transaction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane panel;
    private swing_new.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    public swing_new.Table table;
    // End of variables declaration//GEN-END:variables

    public void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
