/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlbumDAO {

    public List<Album> getAllAlbums() {
        List<Album> albums = new ArrayList<>();
        String sql = "SELECT DISTINCT a.albumid, a.album_name, a.album_cover, ar.name\n" +
                     "FROM album a\n" +
                     "JOIN songs s ON a.albumid = s.albumid\n" +
                     "JOIN artist ar ON s.artistId = ar.artistid\n" +
                     "ORDER BY a.albumid;"; // Adjust the SQL as needed

        try (Connection conn = DB_conn.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

              while (rs.next()) {
                int albumId = rs.getInt("albumid");
                String albumName = rs.getString("album_name");
                String albumCover = rs.getString("album_cover");
                String artistName = rs.getString("name");
                albums.add(new Album(albumId, albumName, albumCover, artistName));  // Assuming constructor to handle artist name
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return albums;
    }
}