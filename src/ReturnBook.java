
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hasintha
 */
public class ReturnBook extends javax.swing.JInternalFrame {
    Connect con =new Connect();
    ResultSet rs;
    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
        initComponents();
       
    }

    
      public void ReturnUpdate(){
       try{
        String query="insert into returnbook(SRegno,BName,SName,BPublisher,BEdition,Bpages,Accno,BSection,SBatch,SDepartment,SEmail,STelNo,Issuedate,Returndate) values('"+jtxtSId.getText()
                +"','"+jtxtBName.getText()
                +"','"+jtxtSName.getText()
                +"','"+jtxtBPub.getText()
                +"','"+jtxtBEdi.getText()
                +"','"+jtxtBPages.getText()
                +"','"+jtxtBookId.getText()
                +"','"+jtxtBSection.getText()
                +"','"+jtxtSBatch.getText()
                +"','"+jtxtSDep.getText()
                +"','"+jtxtSEmail.getText()
                +"','"+ jtxtSContactno.getText()
                +"','"+jtxtIssue.getText()
                +"','"+((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText()
                +"') ";
          int genid=con.setQuery(query, "");
        
   
            JOptionPane.showMessageDialog(null,"The Book has beeb returned");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
  
    
     public void clear(){
        jtxtBookId.setText("");
        jtxtBName.setText("");
        jtxtBEdi.setText("");
        jtxtBPub.setText("");
        jtxtBSection.setText("");
        jtxtBPages.setText("");
        jtxtSId.setText("");
        jtxtSName.setText("");
         jtxtSEmail.setText("");
        jtxtSBatch.setText("");
        jtxtSDep.setText("");
        jtxtSContactno.setText("");
        jtxtIssue.setText("");
       
    }
    public void Delete(){
        String query="delete from issuebook where Accno='"+jtxtBookId.getText()+"' ";
        try{
            con.setQuery(query);
       
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Year4 = new javax.swing.JLabel();
        Year5 = new javax.swing.JLabel();
        Year6 = new javax.swing.JLabel();
        Year7 = new javax.swing.JLabel();
        jtxtSId = new javax.swing.JTextField();
        jtxtSName = new javax.swing.JTextField();
        jtxtSBatch = new javax.swing.JTextField();
        jtxtSDep = new javax.swing.JTextField();
        jtxtSEmail = new javax.swing.JTextField();
        jtxtSContactno = new javax.swing.JTextField();
        jtxtBookId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtBName = new javax.swing.JTextField();
        jtxtBEdi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtBPub = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtBSection = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxtBPages = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Year9 = new javax.swing.JLabel();
        jtxtIssue = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setResizable(true);
        setTitle("ReturnBook");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Student ID");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Name");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Batch");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 60, -1));

        Year4.setBackground(new java.awt.Color(204, 204, 204));
        Year4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Year4.setText("Department");
        jPanel4.add(Year4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, -1));

        Year5.setBackground(new java.awt.Color(204, 204, 204));
        Year5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Year5.setText("Email");
        jPanel4.add(Year5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 60, -1));

        Year6.setBackground(new java.awt.Color(204, 204, 204));
        Year6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Year6.setText("Contact No");
        jPanel4.add(Year6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 100, -1));

        Year7.setBackground(new java.awt.Color(204, 204, 204));
        Year7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Year7.setText("Date of Issued");
        jPanel4.add(Year7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 120, -1));

        jtxtSId.setEditable(false);
        jtxtSId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtSId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 210, -1));

        jtxtSName.setEditable(false);
        jtxtSName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtSName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, -1));

        jtxtSBatch.setEditable(false);
        jtxtSBatch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtSBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 210, -1));

        jtxtSDep.setEditable(false);
        jtxtSDep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtSDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 210, -1));

        jtxtSEmail.setEditable(false);
        jtxtSEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtSEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 210, -1));

        jtxtSContactno.setEditable(false);
        jtxtSContactno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtSContactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 210, -1));

        jtxtBookId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtBookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 180, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel9.setText("Acc. No");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel10.setText("Name");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jtxtBName.setEditable(false);
        jtxtBName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtBName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, -1));

        jtxtBEdi.setEditable(false);
        jtxtBEdi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtBEdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel11.setText("Edition");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel12.setText("Publisher");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jtxtBPub.setEditable(false);
        jtxtBPub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtBPub, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 210, -1));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel13.setText("Section");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jtxtBSection.setEditable(false);
        jtxtBSection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtBSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 210, -1));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel14.setText("Pages");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jtxtBPages.setEditable(false);
        jtxtBPages.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jtxtBPages, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 210, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Return ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 80, 30));

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/if_icon-101-folder-search_314467 (2).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 50, 30));

        Year9.setBackground(new java.awt.Color(204, 204, 204));
        Year9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Year9.setText("Return Date");
        jPanel4.add(Year9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 100, -1));

        jtxtIssue.setEditable(false);
        jtxtIssue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIssueActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 210, -1));

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 210, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 380, 520));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jtxtBookId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No Accession no to book return");
            return ;
        }
        ReturnUpdate();
        Delete();
        clear();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         // TODO add your handling code here:
        String query="select * from issuebook where Accno='"+jtxtBookId.getText()+"'";
        try{
            rs=con.getQuery(query);
            if(rs.next()){
                String add2=rs.getString("BName");
                jtxtBName.setText(add2);
                String add3=rs.getString("BEdition");
                jtxtBEdi.setText(add3);
                String add4=rs.getString("BPublisher");
                jtxtBPub.setText(add4);
                String add5=rs.getString("BSection");
                jtxtBSection.setText(add5);
                String add6=rs.getString("BPages");
                jtxtBPages.setText(add6);
                String add7=rs.getString("SRegno");
                jtxtSId.setText(add7);
                String add8=rs.getString("SName");
                jtxtSName.setText(add8);
                String add9=rs.getString("SBatch");
                jtxtSBatch.setText(add9);
                String add10=rs.getString("SDepartment");
                jtxtSDep.setText(add10);
                String add11=rs.getString("SEmail");
                jtxtSEmail.setText(add11);
                String add12=rs.getString("STelNo");
                jtxtSContactno.setText(add12);
                String add13=rs.getString("Issuedate");
                jtxtIssue.setText(add13);
                rs.close();
                
            }
            else{
                JOptionPane.showMessageDialog(null, "The book id not found");
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
               
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtxtIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIssueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Year4;
    private javax.swing.JLabel Year5;
    private javax.swing.JLabel Year6;
    private javax.swing.JLabel Year7;
    private javax.swing.JLabel Year9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jtxtBEdi;
    private javax.swing.JTextField jtxtBName;
    private javax.swing.JTextField jtxtBPages;
    private javax.swing.JTextField jtxtBPub;
    private javax.swing.JTextField jtxtBSection;
    private javax.swing.JTextField jtxtBookId;
    private javax.swing.JTextField jtxtIssue;
    private javax.swing.JTextField jtxtSBatch;
    private javax.swing.JTextField jtxtSContactno;
    private javax.swing.JTextField jtxtSDep;
    private javax.swing.JTextField jtxtSEmail;
    private javax.swing.JTextField jtxtSId;
    private javax.swing.JTextField jtxtSName;
    // End of variables declaration//GEN-END:variables
}
