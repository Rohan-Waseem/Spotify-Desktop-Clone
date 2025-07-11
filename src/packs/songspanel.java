/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package packs;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.util.Duration;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import listener.SongChangeListener;
import media_player.MediaPlayerManager;

public class songspanel extends javax.swing.JPanel {

    private MediaPlayerManager mediaPlayerManager;
    private List<String> filePaths;
    private int currentSongIndex = 0;
    private SongChangeListener songChangeListener;
    private ImageIcon playIcon;
    private ImageIcon pauseIcon;
    public songspanel() {
        initComponents();
        setOpaque(false);
        mediaPlayerManager = new MediaPlayerManager();
        filePaths = new ArrayList<>(); 
        mediaPlayerManager.setOnEndOfMediaCallback(this::playNextSong);
//        cardLayout = (CardLayout)(mainPanelinnerInvisible4.getLayout());
        
        dropdown2.setVisible(false);  // Ensure the panel is initially hidden
        setupMouseListener();  
        playIcon = new ImageIcon("src/images/play_icon.png");
        pauseIcon = new ImageIcon("src/images/pause_icon.png");
        
        var fontStyle1 = new File("src/resources/CircularSpotifyText-Medium.otf");
        var fontStyle2 = new File("src/resources/CircularSpotifyText-Bold.otf");
        System.out.println("Font file exists: " + fontStyle1.exists());  
        System.out.println("Font file exists: " + fontStyle2.exists());
         
        try { 
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(50f);
            Font font2 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(20f);
            Font font3;
            font3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle1).deriveFont(14f);
            jLabel1.setFont(font3);
            jLabel2.setFont(font1);            
            jLabel3.setFont(font3);
            

            jLabel4.setFont(font2);

            
            jButton25.setFont(font3);
            jButton26.setFont(font3);
            jButton27.setFont(font3);
            jButton28.setFont(font3);
            jButton29.setFont(font3);
            jButton30.setFont(font3);
            jButton31.setFont(font3);
//            jLabel5.setFont(font3)
        }
        catch (FontFormatException | IOException e) {
        e.printStackTrace();
        }
        
        
    }
     
    
     public void updateSongsPanel(String albumName, String artistName, Object[][] songsData, List<String> paths, String albumCoverPath) {
        jLabel2.setText(albumName);
        jLabel3.setText(artistName);
        filePaths.clear();
        filePaths.addAll(paths);  // Add file paths to the list

        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0); // Clear existing data
        for (Object[] row : songsData) {
            model.addRow(row);
        }
        currentSongIndex = 0;
        
        setAlbumCoverImage(albumCoverPath);
    }
    
    private void setAlbumCoverImage(String albumCoverPath) {
     try {
            System.out.println("Loading image from path: " + albumCoverPath);
            ImageIcon albumCoverIcon = new ImageIcon(albumCoverPath);
            Image img = albumCoverIcon.getImage();

            if (img == null) {
                System.out.println("Failed to load image from path: " + albumCoverPath);
                return;
            }

            roundButton1.setButtonImage(img);
            System.out.println("Image set to button.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void togglePlayback() {
        mediaPlayerManager.togglePlayback();
        updatePlayPauseIcon();
        boolean isPlaying = mediaPlayerManager.isPlaying();
        if (songChangeListener != null) {
            songChangeListener.onPlaybackStateChanged(isPlaying);
        }
        
    }
    public void setVolume(double volume) {
        mediaPlayerManager.setVolume(volume);
    }
   public void toggleMute() {
        mediaPlayerManager.toggleMute();
    }
    private void playSongAtCurrentIndex() {
        if (!filePaths.isEmpty()) {
            String filePath = filePaths.get(currentSongIndex);
            mediaPlayerManager.play(filePath);
            table1.setRowSelectionInterval(currentSongIndex, currentSongIndex);
            
             mediaPlayerManager.getMediaPlayer().setOnReady(() -> {
            notifySongChange();
        });
             updatePlayPauseIcon();
            boolean isPlaying = mediaPlayerManager.isPlaying();
            if (songChangeListener != null) {
                songChangeListener.onPlaybackStateChanged(isPlaying);
            }
        }
    }
    private void notifySongChange() {
        if (songChangeListener != null) {          
            songChangeListener.onSongChange(getCurrentSongName(), getCurrentArtistName(),getTotalDuration());
        }
    }

    public String getCurrentSongName() {
        return table1.getValueAt(currentSongIndex, 1).toString();
    }

    public String getCurrentArtistName() {
        return table1.getValueAt(currentSongIndex, 2).toString();
    }
    public void setSongChangeListener(SongChangeListener listener) {
        this.songChangeListener = listener;
    }
    
    
    
    public void playNextSong() {
        if (!filePaths.isEmpty()) {
            currentSongIndex = (currentSongIndex + 1) % filePaths.size();
            playSongAtCurrentIndex();
        }
    }

    public void playPreviousSong() {
        if (!filePaths.isEmpty()) {
            currentSongIndex = (currentSongIndex - 1 + filePaths.size()) % filePaths.size();
            playSongAtCurrentIndex();
        }
    }
    public void seek(Duration duration) {
        mediaPlayerManager.seek(duration);
    }

    public Duration getCurrentTime() {
        return mediaPlayerManager.getCurrentTime();
    }

    public Duration getTotalDuration() {
        return mediaPlayerManager.getTotalDuration();
        
    }

    public boolean isPlaying() {
        return mediaPlayerManager.isPlaying();
    }
    public void stopMediaPlayer() {
        mediaPlayerManager.stop();
        if (songChangeListener != null) {
            songChangeListener.onPlaybackStateChanged(false);  // Notify that playback has stopped
        }
    }
    
    private void updatePlayPauseIcon() {
        if (mediaPlayerManager.isPlaying()) {
            fullroundbutton1.setIcon(pauseIcon);
        } else {
            fullroundbutton1.setIcon(playIcon);
        }
    }
    private void setupMouseListener() {
                this.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        if (!dropdown2.getBounds().contains(evt.getPoint()) && dropdown2.isVisible()) {
                            dropdown2.setVisible(false);
                        }
                    }
                });}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollBar1 = new tablefiles.ScrollBar();
        scrollBar2 = new tablefiles.ScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanelinnerInvisible3 = new packs.MainPanelinnerInvisible();
        profilepanelcolor1 = new packs.profilepanelcolor();
        mainPanelinnerInvisible1 = new packs.MainPanelinnerInvisible();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        roundButton1 = new packs.RoundButtonforsongspanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        mainPanelinnerInvisible2 = new packs.MainPanelinnerInvisible();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        fullroundbutton1 = new packs.fullroundbutton();
        mainPanelinnerInvisible4 = new packs.MainPanelinnerInvisible();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new tablefiles.Table();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dropdown2 = new packs.sidepanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(943, 600));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBar(scrollBar1);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Album");

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Playlist Name");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Artisits Name");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelinnerInvisible1Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible1);
        mainPanelinnerInvisible1.setLayout(mainPanelinnerInvisible1Layout);
        mainPanelinnerInvisible1Layout.setHorizontalGroup(
            mainPanelinnerInvisible1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelinnerInvisible1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(631, 631, 631))
        );
        mainPanelinnerInvisible1Layout.setVerticalGroup(
            mainPanelinnerInvisible1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        roundButton1.setBorder(null);
        roundButton1.setPreferredSize(new java.awt.Dimension(201, 208));

        javax.swing.GroupLayout profilepanelcolor1Layout = new javax.swing.GroupLayout(profilepanelcolor1);
        profilepanelcolor1.setLayout(profilepanelcolor1Layout);
        profilepanelcolor1Layout.setHorizontalGroup(
            profilepanelcolor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanelcolor1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPanelinnerInvisible1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profilepanelcolor1Layout.setVerticalGroup(
            profilepanelcolor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanelcolor1Layout.createSequentialGroup()
                .addGroup(profilepanelcolor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilepanelcolor1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(mainPanelinnerInvisible1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(profilepanelcolor1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        mainPanelinnerInvisible2.setBackground(new java.awt.Color(18, 18, 18));
        mainPanelinnerInvisible2.setOpaque(true);

        jPanel2.setOpaque(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-three-dots-15.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-shuffle-24.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-20.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fullroundbutton1.setBackground(new java.awt.Color(30, 215, 96));
        fullroundbutton1.setBorder(null);
        fullroundbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play_icon.png"))); // NOI18N
        fullroundbutton1.setPreferredSize(new java.awt.Dimension(40, 40));
        fullroundbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullroundbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(fullroundbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fullroundbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setVerticalScrollBar(scrollBar2);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "Title", "Album", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.getTableHeader().setReorderingAllowed(false);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        javax.swing.GroupLayout mainPanelinnerInvisible4Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible4);
        mainPanelinnerInvisible4.setLayout(mainPanelinnerInvisible4Layout);
        mainPanelinnerInvisible4Layout.setHorizontalGroup(
            mainPanelinnerInvisible4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18))
        );
        mainPanelinnerInvisible4Layout.setVerticalGroup(
            mainPanelinnerInvisible4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );

        jPanel1.setOpaque(false);

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("You might also like");

        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AlbumDAO albumDAO = new AlbumDAO();
        List<Album> albums = albumDAO.getAllAlbums();
        for (Album album : albums) {
            album_panel panel1 = new album_panel();
            panel1.setAlbumName(album.getAlbumName());
            panel1.setArtistName(album.getArtistName());
            panel1.setAlbumCover(album.getAlbumCover());
            panel1.setAlbumId(album.getAlbumId());
            jPanel3.add(panel1);
        }

        javax.swing.GroupLayout mainPanelinnerInvisible2Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible2);
        mainPanelinnerInvisible2.setLayout(mainPanelinnerInvisible2Layout);
        mainPanelinnerInvisible2Layout.setHorizontalGroup(
            mainPanelinnerInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelinnerInvisible2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainPanelinnerInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelinnerInvisible2Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(720, 720, 720))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelinnerInvisible2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        mainPanelinnerInvisible2Layout.setVerticalGroup(
            mainPanelinnerInvisible2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelinnerInvisible2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanelinnerInvisible4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );

        dropdown2.setBackground(new java.awt.Color(36, 36, 36));
        dropdown2.setMaximumSize(new java.awt.Dimension(195, 250));
        dropdown2.setPreferredSize(new java.awt.Dimension(195, 250));

        jButton25.setForeground(new java.awt.Color(200, 200, 200));
        jButton25.setText("<html>  <p style=\"margin-left:10px\">Add to Your Library</p> </html> ");
        jButton25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton25.setPreferredSize(new java.awt.Dimension(177, 40));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setForeground(new java.awt.Color(200, 200, 200));
        jButton26.setText("<html>  <p style=\"margin-left:10px\">Add to other playlist </p> </html>");
        jButton26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton26.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setForeground(new java.awt.Color(200, 200, 200));
        jButton27.setText("<html>  <p style=\"margin-left:10px\">Exclude from your taste profile</p> </html> ");
        jButton27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton27.setPreferredSize(new java.awt.Dimension(177, 40));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setForeground(new java.awt.Color(200, 200, 200));
        jButton28.setText("<html>  <p style=\"margin-left:10px\">Share</p> </html>");
        jButton28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton28.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setForeground(new java.awt.Color(200, 200, 200));
        jButton29.setText("<html>  <p style=\"margin-left:10px\">Add to folder</p> </html> ");
        jButton29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);
        jButton29.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton29.setPreferredSize(new java.awt.Dimension(177, 40));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setForeground(new java.awt.Color(200, 200, 200));
        jButton30.setText("<html>  <p style=\"margin-left:10px\">Add to queue</p> </html> ");
        jButton30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton30.setPreferredSize(new java.awt.Dimension(177, 40));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setForeground(new java.awt.Color(200, 200, 200));
        jButton31.setText("<html>  <p style=\"margin-left:10px\">About recomendations </p> </html>");
        jButton31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton31.setPreferredSize(new java.awt.Dimension(0, 40));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dropdown2Layout = new javax.swing.GroupLayout(dropdown2);
        dropdown2.setLayout(dropdown2Layout);
        dropdown2Layout.setHorizontalGroup(
            dropdown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropdown2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dropdown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dropdown2Layout.createSequentialGroup()
                        .addGroup(dropdown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        dropdown2Layout.setVerticalGroup(
            dropdown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dropdown2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.setLayer(mainPanelinnerInvisible2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(dropdown2, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(dropdown2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(732, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanelinnerInvisible2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(dropdown2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout mainPanelinnerInvisible3Layout = new javax.swing.GroupLayout(mainPanelinnerInvisible3);
        mainPanelinnerInvisible3.setLayout(mainPanelinnerInvisible3Layout);
        mainPanelinnerInvisible3Layout.setHorizontalGroup(
            mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelinnerInvisible3Layout.createSequentialGroup()
                .addGroup(mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profilepanelcolor1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1))
                .addGap(0, 0, 0))
        );
        mainPanelinnerInvisible3Layout.setVerticalGroup(
            mainPanelinnerInvisible3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelinnerInvisible3Layout.createSequentialGroup()
                .addComponent(profilepanelcolor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1)
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(mainPanelinnerInvisible3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean isVisible = dropdown2.isVisible();
        dropdown2.setVisible(!isVisible);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
   
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
                int row = table1.getSelectedRow();
                currentSongIndex = row;
                playSongAtCurrentIndex();
    }//GEN-LAST:event_table1MouseClicked

    private void fullroundbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullroundbutton1ActionPerformed
        currentSongIndex = 0;
        playSongAtCurrentIndex();
        updatePlayPauseIcon();
    }//GEN-LAST:event_fullroundbutton1ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private packs.sidepanel dropdown2;
    private packs.fullroundbutton fullroundbutton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible1;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible2;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible3;
    private packs.MainPanelinnerInvisible mainPanelinnerInvisible4;
    private packs.profilepanelcolor profilepanelcolor1;
    private packs.RoundButtonforsongspanel roundButton1;
    private tablefiles.ScrollBar scrollBar1;
    private tablefiles.ScrollBar scrollBar2;
    tablefiles.Table table1;
    // End of variables declaration//GEN-END:variables
}
