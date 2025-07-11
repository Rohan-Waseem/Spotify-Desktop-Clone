/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JSlider;
import javax.swing.plaf.basic.BasicSliderUI;

/**
 *
 * @author HP
 */public class sliders extends javax.swing.JSlider{

    
    public sliders() {
       
        setOpaque(false);
        this.setUI(new BasicSliderUI(this) {
            @Override
            public void paintThumb(Graphics grphcs) {
                Graphics2D g2 = (Graphics2D) grphcs;
                g2.setColor(new Color(255, 255, 255));
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.fillOval(thumbRect.x, thumbRect.y + 5, 11, 11);
            }

        @Override
        public void paintTrack(Graphics grphcs) {
            Graphics2D g2 = (Graphics2D) grphcs.create();  // Create a copy of the Graphics object to safely apply changes
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int trackHeight = 3;  // Fixed height for the track
            int circleDiameter = trackHeight;  // Diameter of the circle at each end
            int trackY = getHeight() / 2 - trackHeight / 2;  // Center the track vertically

            // Set the color for the inactive part of the track
            g2.setColor(new Color(153, 153, 153));  // Light gray
            // Draw the inactive part
            g2.fillRect(circleDiameter / 2, trackY, getWidth() - circleDiameter, trackHeight);

            // Set the color for the active part of the track
            g2.setColor(new Color(30, 215, 96));  // Active color
            // Draw the active part
            g2.fillRect(circleDiameter / 2, trackY, thumbRect.x - circleDiameter / 2 + thumbRect.width / 2, trackHeight);

            // Draw circles at each end
            g2.fillOval(0, trackY, circleDiameter, circleDiameter);  // Left end
            g2.fillOval(getWidth() - circleDiameter, trackY, circleDiameter, circleDiameter);  // Right end

            g2.dispose();  // Dispose the graphics copy
        }

        @Override
        public void paintFocus(Graphics grphcs) {

            }
           

        });
    }

}
