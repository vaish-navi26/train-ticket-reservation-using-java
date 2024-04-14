/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.mysql.cj.xdevapi.Statement;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author JAY
 */
public class BookFile extends javax.swing.JFrame {

    /**
     * Creates new form BookFile
     */
    public BookFile() {
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

        bgpanel = new javax.swing.JPanel();
        formpanel = new javax.swing.JPanel();
        firstname = new javax.swing.JLabel();
        firstnamein = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        lastnamein = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        agein = new javax.swing.JTextField();
        pickup = new javax.swing.JLabel();
        pickupin = new javax.swing.JTextField();
        destination = new javax.swing.JLabel();
        destinationin = new javax.swing.JTextField();
        book = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        destination1 = new javax.swing.JLabel();
        titlebgpanel = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgpanel.setBackground(new java.awt.Color(255, 255, 255));

        formpanel.setBackground(new java.awt.Color(51, 51, 51));
        formpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        firstname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        firstname.setText("First Name :");

        firstnamein.setBackground(new java.awt.Color(51, 51, 51));
        firstnamein.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        firstnamein.setForeground(new java.awt.Color(255, 255, 255));
        firstnamein.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 102, 0)));
        firstnamein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameinActionPerformed(evt);
            }
        });

        lastname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lastname.setForeground(new java.awt.Color(255, 255, 255));
        lastname.setText("Last Name :");

        lastnamein.setBackground(new java.awt.Color(51, 51, 51));
        lastnamein.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lastnamein.setForeground(new java.awt.Color(255, 255, 255));
        lastnamein.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 102, 0)));
        lastnamein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameinActionPerformed(evt);
            }
        });

        age.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setText("Age            :");

        agein.setBackground(new java.awt.Color(51, 51, 51));
        agein.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agein.setForeground(new java.awt.Color(255, 255, 255));
        agein.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 102, 0)));
        agein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageinActionPerformed(evt);
            }
        });

        pickup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pickup.setForeground(new java.awt.Color(255, 255, 255));
        pickup.setText("From          :");

        pickupin.setBackground(new java.awt.Color(51, 51, 51));
        pickupin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pickupin.setForeground(new java.awt.Color(255, 255, 255));
        pickupin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 102, 0)));
        pickupin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupinActionPerformed(evt);
            }
        });

        destination.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        destination.setForeground(new java.awt.Color(255, 255, 255));
        destination.setText(" To             :");

        destinationin.setBackground(new java.awt.Color(51, 51, 51));
        destinationin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        destinationin.setForeground(new java.awt.Color(255, 255, 255));
        destinationin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 102, 0)));
        destinationin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationinActionPerformed(evt);
            }
        });

        book.setBackground(new java.awt.Color(255, 153, 0));
        book.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        book.setForeground(new java.awt.Color(255, 255, 255));
        book.setText("Book");
        book.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Booking a Ticket");

        back.setBackground(new java.awt.Color(255, 153, 0));
        back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        date.setBackground(new java.awt.Color(51, 51, 51));
        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        date.setForeground(new java.awt.Color(51, 51, 51));

        destination1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        destination1.setForeground(new java.awt.Color(255, 255, 255));
        destination1.setText(" Date         :");

        javax.swing.GroupLayout formpanelLayout = new javax.swing.GroupLayout(formpanel);
        formpanel.setLayout(formpanelLayout);
        formpanelLayout.setHorizontalGroup(
            formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formpanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formpanelLayout.createSequentialGroup()
                        .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstnamein, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formpanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destination)
                            .addComponent(destination1)
                            .addComponent(pickup, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age)
                            .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agein, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastnamein)
                            .addComponent(pickupin, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(destinationin)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 153, Short.MAX_VALUE))
            .addGroup(formpanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(back)
                .addGap(75, 75, 75)
                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        formpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {back, book});

        formpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {agein, destinationin, firstnamein, pickupin});

        formpanelLayout.setVerticalGroup(
            formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnamein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnamein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(agein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pickup, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pickupin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(destination1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(formpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(book))
                .addGap(43, 43, 43))
        );

        formpanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {back, book});

        titlebgpanel.setBackground(new java.awt.Color(255, 153, 0));

        title1.setBackground(new java.awt.Color(255, 255, 255));
        title1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("भारतीय रेल");

        javax.swing.GroupLayout titlebgpanelLayout = new javax.swing.GroupLayout(titlebgpanel);
        titlebgpanel.setLayout(titlebgpanelLayout);
        titlebgpanelLayout.setHorizontalGroup(
            titlebgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlebgpanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91))
        );
        titlebgpanelLayout.setVerticalGroup(
            titlebgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlebgpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N

        javax.swing.GroupLayout bgpanelLayout = new javax.swing.GroupLayout(bgpanel);
        bgpanel.setLayout(bgpanelLayout);
        bgpanelLayout.setHorizontalGroup(
            bgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlebgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        bgpanelLayout.setVerticalGroup(
            bgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgpanelLayout.createSequentialGroup()
                .addComponent(titlebgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 927, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameinActionPerformed

    private void lastnameinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameinActionPerformed

    private void ageinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageinActionPerformed

    private void pickupinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pickupinActionPerformed

    private void destinationinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationinActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
    String firstname = firstnamein.getText();
    String lastname = lastnamein.getText();
    String ageStr = agein.getText();
    String pickup = pickupin.getText();
    String destination = destinationin.getText();
    
    // Get the selected date from JDateChooser
    Date selectedDate = date.getDate();
    
    // Validate input fields
    if (firstname.isEmpty() || lastname.isEmpty() || ageStr.isEmpty() ||
        pickup.isEmpty() || destination.isEmpty() || selectedDate == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        return;
    }

    try {
        int age = Integer.parseInt(ageStr);

        // Establish a connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/train", "root", "vaishnavi");

        // The SQL query to insert data into the ticket table
        String query = "INSERT INTO ticket (id, firstname, lastname, age, pickup, destination, date) VALUES (LPAD(FLOOR(RAND() * 99999), 5, '0'), ?, ?, ?, ?, ?, ?)";

        // Create a PreparedStatement to avoid SQL injection and to retrieve generated keys
        PreparedStatement pstmt = con.prepareStatement(query, new String[]{"id"});
        pstmt.setString(1, firstname);
        pstmt.setString(2, lastname);
        pstmt.setInt(3, age);
        pstmt.setString(4, pickup);
        pstmt.setString(5, destination);
        
        // Convert Java Date to SQL Date
        java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());
        pstmt.setDate(6, sqlDate);

        // Execute the query
        pstmt.executeUpdate();

        // Get the generated ID
        ResultSet rs = pstmt.getGeneratedKeys();
        if (rs.next()) {
            int generatedId = rs.getInt(1);
            javax.swing.JOptionPane.showMessageDialog(this, "Booking successful! Ticket ID: " + generatedId);
        }

        // Close resources
        rs.close();
        pstmt.close();
        con.close();

        // Clear input fields after successful booking
        firstnamein.setText("");
        lastnamein.setText("");
        agein.setText("");
        pickupin.setText("");
        destinationin.setText("");
        date.setDate(null); // Clear the JDateChooser
        
        // Show or dispose HomeFrame as needed
        HomeFrame homeFrame = new HomeFrame();
        homeFrame.setVisible(true);
        this.dispose();
    } catch (SQLException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "An error occurred. Please try again.");
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid age.");
    }

    }//GEN-LAST:event_bookActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
         // Check if a HomeFrame instance already exists
    HomeFrame homeFrame = null;
    for (Frame frame : Frame.getFrames()) {
        if (frame instanceof HomeFrame) {
            homeFrame = (HomeFrame) frame;
            break;
        }
    }

    // If HomeFrame exists, make it visible and dispose of the current BookFile frame
    if (homeFrame != null) {
        homeFrame.setVisible(true);
        this.dispose();  // Dispose of the current BookFile frame
    } else {
        homeFrame = new HomeFrame();
        homeFrame.setVisible(true);
        this.dispose();  // Dispose of the current BookFile frame
    }
    }//GEN-LAST:event_backActionPerformed
    

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
            java.util.logging.Logger.getLogger(BookFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JTextField agein;
    private javax.swing.JButton back;
    private javax.swing.JPanel bgpanel;
    private javax.swing.JButton book;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel destination;
    private javax.swing.JLabel destination1;
    private javax.swing.JTextField destinationin;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField firstnamein;
    private javax.swing.JPanel formpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField lastnamein;
    private javax.swing.JLabel pickup;
    private javax.swing.JTextField pickupin;
    private javax.swing.JLabel title1;
    private javax.swing.JPanel titlebgpanel;
    // End of variables declaration//GEN-END:variables
}
