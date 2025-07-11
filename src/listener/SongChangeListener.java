/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listener;

import javafx.util.Duration;

/**
 *
 * @author HP
 */
public interface SongChangeListener {
    void onSongChange(String songName, String artistName, Duration totalDuration);
    void onPlaybackStateChanged(boolean isPlaying);
}
