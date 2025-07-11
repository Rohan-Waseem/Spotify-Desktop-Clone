package media_player;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import java.io.File;

public class MediaPlayerManager {
    private MediaPlayer mediaPlayer;
    private boolean isPaused;
    private String currentFilePath;
    private Runnable onEndOfMediaCallback;

    // Initialize JavaFX
    static {
        new JFXPanel();
    }

    public void play(String filePath) {
        stop();
        currentFilePath = filePath;
        Media media = new Media(new File(filePath).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        isPaused = false;

        mediaPlayer.setOnEndOfMedia(() -> {
            if (onEndOfMediaCallback != null) {
                onEndOfMediaCallback.run();
            }
        });
    }

    public void stop() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public void togglePlayback() {
        if (mediaPlayer != null) {
            if (isPaused) {
                mediaPlayer.play();
                isPaused = false;
            } else {
                mediaPlayer.pause();
                isPaused = true;
            }
        }
    }

    public Duration getCurrentTime() {
        return mediaPlayer != null ? mediaPlayer.getCurrentTime() : Duration.ZERO;
    }

    public Duration getTotalDuration() {
        return mediaPlayer != null ? mediaPlayer.getTotalDuration() : Duration.ZERO;
    }

    public void seek(Duration duration) {
        if (mediaPlayer != null) {
            mediaPlayer.seek(duration);
        }
    }

    public boolean isPlaying() {
        return mediaPlayer != null && !isPaused;
    }

    public void setVolume(double volume) {
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(volume);
        }
    }

    public void toggleMute() {
        if (mediaPlayer != null) {
            mediaPlayer.setMute(!mediaPlayer.isMute());
        }
    }

    public void setOnEndOfMediaCallback(Runnable callback) {
        this.onEndOfMediaCallback = callback;
    }
    public MediaPlayer getMediaPlayer() {
    return mediaPlayer;
}
}
