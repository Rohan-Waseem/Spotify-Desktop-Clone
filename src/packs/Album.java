/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packs;

/**
 *
 * @author HP
 */
public class Album {
    private int albumId;
    private String albumName;
    private String albumCover; // This could be a URL or a file path
    private String artistName; // This could be a URL or a file path

    // Constructor
    public Album(int albumId, String albumName, String albumCover, String artistName) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.albumCover = albumCover;
        this.artistName = artistName;
    }

    // Getters
    public int getAlbumId() {
        return albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getAlbumCover() {
        return albumCover;
    }
      public String getArtistName() {
        return artistName;
    }

    // Setters
    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setAlbumCover(String albumCover) {
        this.albumCover = albumCover;
    }
     public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}