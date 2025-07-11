package packs;

import java.awt.*;
import javax.swing.*;

public class RoundButtonforsongspanel extends JButton {

    private Image buttonImage;

    public RoundButtonforsongspanel() {
        Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.width, size.height);
        setPreferredSize(size);
        setContentAreaFilled(false);
    }

    public void setButtonImage(Image image) {
        this.buttonImage = image;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, getSize().width - 1, getSize().height - 1, 35, 35);

        if (buttonImage != null) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int buttonWidth = getWidth();
            int buttonHeight = getHeight();

            // Scaling the image to fit the button dimensions exactly
            g2d.drawImage(buttonImage, 0, 0, buttonWidth, buttonHeight, this);
        }

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
//        g.setColor(getForeground());
//        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 35, 35);
    }
}
