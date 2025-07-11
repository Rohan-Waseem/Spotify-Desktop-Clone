/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packs;


import java.awt.*;
import javax.swing.*;

public class fullroundbutton extends JButton
  {
          private Image buttonImage;

      public fullroundbutton()
      {
//          super(label);

         //Enlarge button to make a circle rather than an oval.
          Dimension size = getPreferredSize();
          size.width = size.height = Math.max(size.width, size.height);
          setPreferredSize(size);

          //This call causes the JButton *not* to paint the background
          //and allows us to paint a round background instead.
          setContentAreaFilled(false);
      }
      public void setButtonImage(Image image) {
        this.buttonImage = image;
        repaint();
    }
      //Paint the round background and label.
      protected void paintComponent(Graphics g)
      {
          if (getModel().isArmed())
              //You might want to make the highlight color
              //a property of the RoundButton class.
              g.setColor(Color.lightGray);
          else
              g.setColor(getBackground());
//          g.fillRoundRect(0, 0, getSize().width-1, getSize().height-1, 35, 35);
          g.fillOval(0, 0, getSize().width-1, getSize().height-1);
          //This call will paint label and focus rectangle.
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

      //Paint the border of the button using a simple stroke.
      protected void paintBorder(Graphics g)
      {
//          g.setColor(new Color(18, 18, 18, 255));
            g.setColor(getForeground());
//            g.drawRoundRect(0, 0, getSize().width-1, getSize().height-1, 35, 35);
          g.drawOval(0, 0, getSize().width-1, getSize().height-1);
      }
  }
