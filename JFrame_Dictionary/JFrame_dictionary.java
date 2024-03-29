/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import com.sun.speech.freetts.VoiceManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;


/**
 *
 * @author user56
 */
public class JFrame_dictionary extends javax.swing.JFrame {

    /**
     * Creates new form JFrame_dictionary
     */
    public JFrame_dictionary() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        phatAm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        list = new javax.swing.JScrollPane();
        list_word = new javax.swing.JList<>();
        in_dic = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        out_dic = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        delete = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        add = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));
        setMaximumSize(new java.awt.Dimension(455, 475));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ravie", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("E-V DICTIONARY");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 0, 440, 80);
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Dịch nghĩa");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 140, 130, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/loa.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(570, 90, 50, 40);

        phatAm.setEditable(false);
        phatAm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        phatAm.setForeground(new java.awt.Color(255, 0, 0));
        phatAm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phatAmActionPerformed(evt);
            }
        });
        jPanel1.add(phatAm);
        phatAm.setBounds(300, 90, 320, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Phát âm :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 90, 69, 50);

        list_word.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        list_word.setForeground(new java.awt.Color(0, 0, 204));
        list_word.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " ", " ", " ", " Đang tải dữ liệu ..............", " ", " ", " ", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list_word.setToolTipText("");
        list_word.setName(""); // NOI18N
        list_word.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_wordMouseClicked(evt);
            }
        });
        list_word.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                list_wordValueChanged(evt);
            }
        });
        list.setViewportView(list_word);

        jPanel1.add(list);
        list.setBounds(0, 130, 220, 450);

        in_dic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        in_dic.setText("Nhập tại đây............");
        in_dic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_dicActionPerformed(evt);
            }
        });
        in_dic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                in_dicKeyTyped(evt);
            }
        });
        jPanel1.add(in_dic);
        in_dic.setBounds(0, 90, 220, 35);

        out_dic.setEditable(false);
        out_dic.setColumns(20);
        out_dic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        out_dic.setRows(5);
        jScrollPane1.setViewportView(out_dic);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(230, 170, 390, 410);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dictionary/ok.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 620, 580);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(430, -30, 100, 100);

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 102));

        delete.setText("setup");
        delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Xóa từ ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        delete.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Thêm từ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        delete.add(jMenuItem2);
        delete.add(jSeparator1);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("sửa từ");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        delete.add(jMenuItem6);

        jMenuBar1.add(delete);

        add.setText("other");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Hướng dẫn");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        add.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Khởi động lại");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        add.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("số lượng từ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        add.add(jMenuItem5);

        jMenuBar1.add(add);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("jnjnjn");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void in_dicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_dicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_dicActionPerformed
    private DefaultListModel<String> data;
    private ArrayList<Word> arr;
  //  private ArrayList<Word> newarr;
    private int Index;
    private int a=1;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         DictionaryManagement nhapdulieu =new  DictionaryManagement();
        data =new DefaultListModel<>();
        list_word.setModel(data);
        
        nhapdulieu.insertFromFile();
        arr =nhapdulieu.getData();
        
        
        for(int i=0;i<arr.size();i++)
        {
            data.addElement(arr.get(i).getWord_target());
        }
// TODO add your handling code here:
 
    }//GEN-LAST:event_formWindowOpened

    private void in_dicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_in_dicKeyTyped
        
        if(a==1){
            a=0;
            in_dic.setText("");
            
        }
        String text = in_dic.getText().trim();
        text+=evt.getKeyChar();
        text=text.trim().toLowerCase();
        for(int i=0;i<data.size();i++)
        {
            String  chon=""+data.getElementAt(i);
            chon=chon.toLowerCase();
            if(chon.startsWith(text))
            {
                list_word.setSelectedIndex(i);
                
               JScrollBar keo=list.getVerticalScrollBar();
               keo.setValue(i*21-14);
                return;
            }
           
        }
        out_dic.setText("từ nhập không tồn tại hoặc từ điển chưa cập nhật");
        phatAm.setText("");
        list_word.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_in_dicKeyTyped

 


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         DictionaryManagement nhapdulieu =new  DictionaryManagement();
     int a =  JOptionPane.showConfirmDialog(null, "bạn có chắc muốn xóa "+data.getElementAt(Index));
     if(a==0){
         arr.remove(Index);
         String s =data.getElementAt(Index);
         data.remove(Index);
             try {
                 nhapdulieu.dictionaryExportToFile(arr);
             } catch (IOException e) {
             }
         out_dic.setText("BẠN ĐÃ XÓA THÀNH CÔNG "+ s);
         phatAm.setText("");
         in_dic.setText("");
     }
     
    
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void list_wordValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_list_wordValueChanged
        
        if(!list_word.isSelectionEmpty())
        {
            Index = list_word.getSelectedIndex();
            Word a = arr.get(Index);
           
            phatAm.setText((String) a.getWord_explain().get(0)+"\n");
            out_dic.setText((String) a.getWord_explain().get(1)+"\n");
            for(int i=2;i<a.word_explain.size();i++)
            {
                out_dic.append((String) a.getWord_explain().get(i)+"\n");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_list_wordValueChanged

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        setup a = new setup();
        a.setVisible(true);
        a.setArr(arr);
        a.setData(data);
        a.setIndex(Index);
        a.setSetUp(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Huongdan hp= new Huongdan();
        hp.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        JFrame_dictionary jf=new JFrame_dictionary();
         jf.setVisible(true);
  
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        int a= data.size();
         JOptionPane.showMessageDialog(null, "Số lượng từ la "+a+" từ");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void phatAmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phatAmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phatAmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VoiceManager voiceManager = VoiceManager.getInstance();
        com.sun.speech.freetts.Voice syntheticVoice = voiceManager.getVoice("kevin16");
        syntheticVoice.allocate();
        syntheticVoice.speak(data.getElementAt(Index));
        syntheticVoice.deallocate();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        setup a = new setup();
        a.setVisible(true);
        a.setTarget(data.getElementAt(Index));
        a.setExplain(arr.get(Index).getWord_explain());
        a.setArr(arr);
        a.setData(data);
        a.setIndex(Index);
        a.setSetUp(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void list_wordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_wordMouseClicked
        // TODO add your handling code here:
        in_dic.setText(arr.get(Index).getWord_target());
    }//GEN-LAST:event_list_wordMouseClicked

    public ArrayList<Word> getArr() {
        return arr;
    }

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
            java.util.logging.Logger.getLogger(JFrame_dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_dictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_dictionary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu add;
    private javax.swing.JMenu delete;
    private javax.swing.JTextField in_dic;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JScrollPane list;
    private javax.swing.JList<String> list_word;
    private javax.swing.JTextArea out_dic;
    private javax.swing.JTextField phatAm;
    // End of variables declaration//GEN-END:variables
}
