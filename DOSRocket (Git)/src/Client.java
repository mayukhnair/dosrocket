/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mayukh Nair
 */

import com.darkprograms.speech.microphone.Microphone;
import com.darkprograms.speech.recognizer.GSpeechDuplex;
import com.darkprograms.speech.recognizer.GSpeechResponseListener;
import com.darkprograms.speech.recognizer.GoogleResponse;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javaFlacEncoder.FLACFileWriter;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import org.apache.commons.exec.*;



public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
       
        initComponents();
    }

    int xmouse,ymouse;
     Font isFocused=new Font("Segoe UI", Font.PLAIN,11);
     Font notfocused=new Font("Segoe UI", Font.ITALIC,11);
     public String filepat;
     public String filenam;
     Connection con;
     static Statement st;
     static ResultSet ras;
     GSpeechDuplex duplo=new GSpeechDuplex("AIzaSyCnl6MRydhw_5fLXIdASxkLJzcJh5iX0M4");
     Microphone micra;
     File audiofil;
     
            
            
            
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FrameWindowBar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        fdev = new javax.swing.JTextField();
        floc = new javax.swing.JTextField();
        browsebutton = new javax.swing.JButton();
        SaveConfigButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listerine = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DOSRocket");
        setUndecorated(true);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        FrameWindowBar.setBackground(new java.awt.Color(255, 255, 255));
        FrameWindowBar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        FrameWindowBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imglib/rocket 8bit.png"))); // NOI18N
        FrameWindowBar.setText("DOSRocket, the DOSBox front-end");
        FrameWindowBar.setToolTipText("DOSRocket-DOSBox Launcher");
        FrameWindowBar.setOpaque(true);
        FrameWindowBar.setPreferredSize(new java.awt.Dimension(60, 60));
        FrameWindowBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameWindowBarMouseDragged(evt);
            }
        });
        FrameWindowBar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FrameWindowBarFocusLost(evt);
            }
        });
        FrameWindowBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameWindowBarMousePressed(evt);
            }
        });
        FrameWindowBar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                FrameWindowBarComponentShown(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add a game", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11), new java.awt.Color(0, 153, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Developer");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("Executable File Path");

        fname.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        fname.setForeground(new java.awt.Color(204, 204, 204));
        fname.setText("The name of the game");
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });

        fdev.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        fdev.setForeground(new java.awt.Color(204, 204, 204));
        fdev.setText("The developer/creator of the game");
        fdev.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fdevFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fdevFocusLost(evt);
            }
        });

        floc.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        floc.setForeground(new java.awt.Color(204, 204, 204));
        floc.setText("Where is the main .exe file of the game stored?");
        floc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                flocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                flocFocusLost(evt);
            }
        });

        browsebutton.setBackground(new java.awt.Color(255, 255, 255));
        browsebutton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        browsebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imglib/folder_256.png"))); // NOI18N
        browsebutton.setText("Browse");
        browsebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebuttonActionPerformed(evt);
            }
        });

        SaveConfigButton.setBackground(new java.awt.Color(255, 255, 255));
        SaveConfigButton.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        SaveConfigButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imglib/spanner2.png"))); // NOI18N
        SaveConfigButton.setText("Save Configuration");
        SaveConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveConfigButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton2.setText("Run game");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SaveConfigButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(floc, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browsebutton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fdev)
                            .addComponent(fname)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fdev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(floc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(browsebutton))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SaveConfigButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imglib/no.png"))); // NOI18N
        jLabel5.setText("Close");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("DOSRocket Alpha build x86-64-mswindows © 2014 Mayukh Nair");

        listerine.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Game list", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11), new java.awt.Color(0, 102, 255))); // NOI18N
        listerine.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        listerine.setModel(new DefaultListModel());
        listerine.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listerine.setToolTipText("");
        jScrollPane1.setViewportView(listerine);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Game information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11), new java.awt.Color(0, 102, 255))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton3.setText("Voice control");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FrameWindowBar, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FrameWindowBar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jButton3))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void FrameWindowBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameWindowBarMouseDragged
        // TODO add your handling code here:
        int x,y;
        x=evt.getXOnScreen();
        y=evt.getYOnScreen();
        System.out.println(x+","+y);
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_FrameWindowBarMouseDragged

    private void FrameWindowBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameWindowBarMousePressed
        // TODO add your handling code here:
        xmouse=evt.getX();
        ymouse=evt.getY();
        
    }//GEN-LAST:event_FrameWindowBarMousePressed


  

    private void FrameWindowBarComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_FrameWindowBarComponentShown
        // TODO add your handling code here:
     
    }//GEN-LAST:event_FrameWindowBarComponentShown

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // Shit fails to do anything. Precisely why I hate Java-
        // it promises you something else and delivers something else.
        this.setLocation(330,162);
    }//GEN-LAST:event_formFocusGained

    private void fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusGained
        // TODO add your handling code here:
        fname.setForeground(Color.BLACK);
        fname.setFont(isFocused);
        String p1=fname.getText();
        if(p1.equals("The name of the game")){
           fname.setText(""); 
        }
        
    }//GEN-LAST:event_fnameFocusGained

    private void fdevFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fdevFocusGained
        // TODO add your handling code here:
         fdev.setForeground(Color.BLACK);
        fdev.setFont(isFocused);
        String p2=fdev.getText();
        if(p2.equals("The developer/creator of the game")){
           fdev.setText(""); 
        }
    }//GEN-LAST:event_fdevFocusGained

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_fnameFocusLost

    private void fdevFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fdevFocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_fdevFocusLost

    private void flocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_flocFocusGained
        // TODO add your handling code here:
        String p3=floc.getText();
        if(p3.equals("Where is the main .exe file of the game stored?")){
            floc.setText("");
        }
        floc.setForeground(Color.BLACK);
        floc.setFont(isFocused);
        
    }//GEN-LAST:event_flocFocusGained

    private void flocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_flocFocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_flocFocusLost

    private void FrameWindowBarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FrameWindowBarFocusLost
        // TODO add your handling code here:
        FrameWindowBar.setForeground(Color.LIGHT_GRAY);
        FrameWindowBar.setFont(notfocused);
        FrameWindowBar.setText("DOSRocket, the DOSBox front-end");
    }//GEN-LAST:event_FrameWindowBarFocusLost

    private void browsebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsebuttonActionPerformed
        // TODO add your handling code here:
        JFileChooser browze = new JFileChooser();
        int returnval=browze.showOpenDialog(this);
        if(returnval==JFileChooser.APPROVE_OPTION)
        {
        File target=browze.getSelectedFile();
            filepat=target.getParent();
            String yo=filepat.replace("\\","\\\\\\");
            filenam=target.getName();
             floc.setForeground(Color.BLACK);
             floc.setFont(isFocused);
             floc.setText(yo);
             
        }
        System.out.println(filepat);
    }//GEN-LAST:event_browsebuttonActionPerformed

    private void SaveConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveConfigButtonActionPerformed
        // Deals with the database I/O. Checks if a "dosrocket" database is
        // sitting in the "mysql" database that is on every MySQL installation.
        // If not, creates one for future use. Grabs user input from text fields
        // and records it to the database. The new entry is now loaded with the
        // existing entries in the list.
      Thread SaveConfigThread=new Thread(new Runnable()
      {
          public void run()
          {
              boolean k=true;
        try{
            Class.forName("java.sql.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
            st=con.createStatement();
        }
        catch (ClassNotFoundException | SQLException ex) {
            String errstring=null;    
            
       
           
            System.out.println("Error at point one: "+ex.getMessage()+" Aborting.\n");
                k=false;
            }
       
        if(k){
            System.out.println("Successfully connected to MySQL Server\nSearching for Database...\n");
                String query = "SELECT table_name FROM INFORMATION_SCHEMA.tables WHERE table_name='dosrocket';";
                try {
                    ras = st.executeQuery(query);
                
                if(ras.first()){
                        System.out.println("Database Found. Connecting...Connected Succcessfully.\n");
                    }
                else{
                    st.executeUpdate("create table dosrocket(name varchar(50) PRIMARY KEY,developer varchar(50), filepath varchar(5000),filename varchar(256))");
                }
               
        }
                catch(SQLException e){
                    System.out.println("Error at point 2: "+e.getMessage());
                }
       
        }
        try{
        String filename=fname.getText();
        String filedev=fdev.getText();
        String filelocn=floc.getText();
        con.createStatement();
        String query="insert into dosrocket values('"+filename+"','"+filedev+"','"+filelocn+"','"+filenam+"')";
        int yo=st.executeUpdate(query);
        
        }
        catch(SQLException e){
            System.out.println("Error at point 3");
            e.printStackTrace();
        }
        
          }
      }
      );
      SaveConfigThread.start();
      
      Thread ViewConfigThread=new Thread(new Runnable(){
          public void run(){
              try{
     String que="select name from dosrocket";
  
      ras = st.executeQuery(que);
        DefaultListModel dlm=(DefaultListModel)listerine.getModel();
        dlm.removeAllElements();
        while(ras.next()){
                
                
                dlm.addElement(ras.getString(1));
            }
        
        }
        catch(SQLException e){
            System.out.println("Error at point 4");
            e.printStackTrace();
        }
          }
      });
      ViewConfigThread.start();
    }//GEN-LAST:event_SaveConfigButtonActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // Of course, get rid of the program!
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // Set JFrame to given coordinates. Oh wait, why am I 
        // telling a JPanel to do this?
        this.setLocation(330,262);
    }//GEN-LAST:event_jPanel1FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // This thread grabs data for selected game from SQL Database and
        // passes it on to the Apache Commons Exec API to call DOSBox
        // and provide required parameters.
        Thread RunGameThread=new Thread(new Runnable()
        {
            public void run(){
                String selgame=listerine.getSelectedValue().toString();
        String qu="select filename,filepath from dosrocket where name="+"'"+selgame+"'";
        String gname=null,gpath=null;
        try{
                ras=st.executeQuery(qu);
                while(ras.next()){
                    gname=ras.getString(1);
                  
                    System.out.println(gname);
                gpath=ras.getString(2)+"\\";
                  String pop=gpath.replace("\\", "\\\\");
                System.out.println(pop);
                }
                
             String cdcommand="C:////Program Files////DOSBox-0.74////dosbox.exe";
              
             CommandLine cmdinstance=CommandLine.parse(cdcommand);
             
              cmdinstance.addArgument("-fullscreen");
              cmdinstance.addArgument("-c mount c: c:");
              cmdinstance.addArgument(gname);
        
        DefaultExecutor exac=new DefaultExecutor();
        
        int exitval2=exac.execute(cmdinstance);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            ras.close();    
            st.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
       
            }
        });
        RunGameThread.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Thread MicInputThread=new Thread(new Runnable(){
            public void run(){
                duplo.addResponseListener(new GSpeechResponseListener(){
                    public void OnResponse(GoogleResponse googres){
                        String parsedtext=googres.getResponse();
                        System.out.println(parsedtext);
                    }

                    @Override
                    public void onResponse(GoogleResponse gr) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                });
                micra=new Microphone(FLACFileWriter.FLAC);
                audiofil=new File("AudioTest.flac");
                while(true){
                    try{
                        micra.captureAudioToFile(audiofil);
                        Thread.sleep(5000);
                        micra.close();
                        byte[] data=Files.readAllBytes(micra.getAudioFile().toPath());
                        duplo.recognize(data, (int)micra.getAudioFormat().getSampleRate());
                        micra.getAudioFile().delete();
                    }
                    catch (Exception ex){
                        ex.printStackTrace();
                    }
                }
            }
        });
       MicInputThread.start();
    }//GEN-LAST:event_jButton3ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FrameWindowBar;
    private javax.swing.JButton SaveConfigButton;
    private javax.swing.JButton browsebutton;
    private javax.swing.JTextField fdev;
    private javax.swing.JTextField floc;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listerine;
    // End of variables declaration//GEN-END:variables
}
