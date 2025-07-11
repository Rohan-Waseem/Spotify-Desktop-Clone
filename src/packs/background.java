package packs;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class background extends JPanel {
    private Image backgroundImg;

    public background() {
        loadImage();
        setPreferredSize(new Dimension(800, 600)); // Set a preferred size if necessary
    }

    private void loadImage() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/Screenshot (175).jpg"));
        backgroundImg = icon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImg != null) {
            g.drawImage(backgroundImg, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
