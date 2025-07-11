/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package packs;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class album_panel extends javax.swing.JPanel {

    private int albumId;

    public album_panel() {
        
        initComponents();
        container1.setBackground(new Color(18,18,18,0));
        var fontStyle1 = new File("src/resources/CircularSpotifyText-Medium.otf");
        var fontStyle2 = new File("src/resources/CircularSpotifyText-Bold.otf");
        System.out.println("Font file exists: " + fontStyle1.exists());  
        System.out.println("Font file exists: " + fontStyle2.exists());
         
        try { 
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle2).deriveFont(24f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(14f);
            Font font3;
            font3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(12f);
            setAlbumName.setFont(font2);      
            setArtistName.setFont(font3);       
    }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container1 = new packs.container();
        albumcover = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        setAlbumName = new javax.swing.JLabel();
        setArtistName = new javax.swing.JLabel();

        setOpaque(false);

        container1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                container1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                container1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                container1MouseExited(evt);
            }
        });

        albumcover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        albumcover.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        albumcover.setIconTextGap(10);
        albumcover.setPreferredSize(new java.awt.Dimension(166, 159));
        albumcover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel1.setOpaque(false);

        setAlbumName.setBackground(new java.awt.Color(204, 204, 204));
        setAlbumName.setForeground(new java.awt.Color(204, 204, 204));
        setAlbumName.setText("LEO");
        setAlbumName.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        setArtistName.setBackground(new java.awt.Color(153, 153, 153));
        setArtistName.setForeground(new java.awt.Color(153, 153, 153));
        setArtistName.setText("Shubh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(setAlbumName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setArtistName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setAlbumName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setArtistName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout container1Layout = new javax.swing.GroupLayout(container1);
        container1.setLayout(container1Layout);
        container1Layout.setHorizontalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(albumcover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        container1Layout.setVerticalGroup(
            container1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(albumcover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void container1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseClicked
       Container parent = SwingUtilities.getAncestorOfClass(Mainframe.class, this);
    if (parent != null) {
        Mainframe mainFramePanel = (Mainframe) parent;
        CardLayout cardLayout = (CardLayout) mainFramePanel.Cardspanel.getLayout();

        // Retrieve songspanel by iterating through components or by keeping a reference in Mainframe
        songspanel songsPanel = null;
        for (Component comp : mainFramePanel.Cardspanel.getComponents()) {
            if (comp instanceof songspanel) {
                songsPanel = (songspanel) comp;
                break;
            }
        }

        if (songsPanel != null) {
            // Update the songspanel
            List<String> filePaths = new ArrayList<>();
            Object[][] result = getSongsForAlbum(albumId, filePaths);
            Object[][] songsData = (Object[][]) result[0][0];
            String albumCoverPath = (String) result[0][1];
            songsPanel.updateSongsPanel(setAlbumName.getText(), setArtistName.getText(), songsData, filePaths, albumCoverPath);

            // Switch to the songspanel
            cardLayout.show(mainFramePanel.Cardspanel, "card6");
            mainFramePanel.revalidate();
            mainFramePanel.repaint();
        } else {
            System.out.println("Songspanel not found.");
        }
    } else {
        System.out.println("Parent with CardLayout not found.");
    }
    }//GEN-LAST:event_container1MouseClicked

    private void container1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseEntered
        container1.setBackground(new Color(40,40,40,255));
    }//GEN-LAST:event_container1MouseEntered

    private void container1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_container1MouseExited
        container1.setBackground(new Color(18,18,18,0));
    }//GEN-LAST:event_container1MouseExited
    private Object[][] getSongsForAlbum(int albumId, List<String> filePaths) {
    String query = "SELECT s.title, a.album_name, s.length, s.file_path, a.album_cover " +
                   "FROM songs s " +
                   "JOIN album a ON s.albumid = a.albumid " +
                   "WHERE s.albumid = ?";
    try (Connection conn = DB_conn.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setInt(1, albumId);
        try (ResultSet rs = stmt.executeQuery()) {
            List<Object[]> songsList = new ArrayList<>();
            int songNumber = 1; // Initialize the song number
            String albumCoverPath = null;
            while (rs.next()) {
                Object[] song = {
                    songNumber++, // Increment the song number
                    rs.getString("title"),
                    rs.getString("album_name"),
                    rs.getString("length")
                };
                songsList.add(song);
                filePaths.add(rs.getString("file_path"));  // Add the file path to the list
                if (albumCoverPath == null) {
                    albumCoverPath = rs.getString("album_cover"); // Get the album cover path
                }
            }
            if (songsList.isEmpty()) {
                return new Object[0][];
            } else {
                return new Object[][] { { songsList.toArray(new Object[0][]), albumCoverPath } };
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        return new Object[0][];
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel albumcover;
    private packs.container container1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel setAlbumName;
    private javax.swing.JLabel setArtistName;
    // End of variables declaration//GEN-END:variables

    void setAlbumName(String albumName) {
        setAlbumName.setText(albumName);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    void setArtistName(String artistName) {
        setArtistName.setText(artistName);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    void setAlbumCover(String AlbumCover){
        ImageIcon Album_Cover = new ImageIcon(AlbumCover);
        albumcover.setIcon(Album_Cover);
        System.out.println("Loading image from path: " + Album_Cover);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
}
