/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class shadowpanel extends JPanel{
    public shadowpanel(){
        
        
        
    }
    private int round = 10;
    private Color shadowColor = new Color(170, 170, 170);
    private BufferedImage imageShadow;
    private final Insets shadowSize = new Insets(2, 5, 8, 5);
    
    
    private void createImageShadow() {
    int height = getHeight();
    int width = getWidth();
    if (width > 0 && height > 0) {
        imageShadow = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = imageShadow.createGraphics();
        BufferedImage img = createShadow();
        if (img != null) {
            g2.drawImage(img, shadowSize.left, shadowSize.top, null);
        }
        g2.dispose();
    }
}
         private BufferedImage createShadow() {
        int width = getWidth() - (shadowSize.left + shadowSize.right);
        int height = getHeight() - (shadowSize.top + shadowSize.bottom);
        if (width > 0 && height > 0) {
            BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = img.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.fill(new RoundRectangle2D.Double(0, 0, width, height, round, round));
            g2.dispose();
            return new ShadowRenderer(5, 0.3f, shadowColor).createShadow(img);
        } else {
            return null;
        }
    }
    @Override
    protected void paintComponent(Graphics grphcs) {
    super.paintComponent(grphcs);
    Graphics2D g2 = (Graphics2D) grphcs;
    
    // Draw the shadow image
    if (imageShadow != null) {
        g2.drawImage(imageShadow, 0, 0, this);
    }
    
    // Draw the main panel with rounded corners
    g2.setColor(getBackground());
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.fillRoundRect(shadowSize.left, shadowSize.top, getWidth() - shadowSize.left - shadowSize.right, 
                     getHeight() - shadowSize.top - shadowSize.bottom, round, round);
}
    @Override
public void setSize(int width, int height) {
    super.setSize(width, height);
    createImageShadow();
}

@Override
public void setBounds(int x, int y, int width, int height) {
    super.setBounds(x, y, width, height);
    createImageShadow();
}
}
