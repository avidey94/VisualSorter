
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

/**
 *
 * @author Avi
 */
public class ArrayComponent extends JComponent
{

   private Double[] values;
   private Double marked1;
   private Double marked2;

   public void paintComponent(Graphics g)
   {
      if (values == null)
      {
         return;
      }
      Graphics2D g2 = (Graphics2D) g;
      int width = getWidth() / values.length;
      for (int i = 0; i < values.length; i++)
      {
         Double v = values[i];
         Rectangle2D bar = new Rectangle2D.Double(width * i, 0, width, v);
         if (v == marked1 || v == marked2)
         {
             g2.setColor(Color.red);
            g2.fill(bar);
         } else
         {
            g2.draw(bar);
         }
      }

   }
   
   public synchronized void setValues(Double[] values, Double marked1, Double marked2)
   {
      this.values = (Double[]) values.clone();
      this.marked1 = marked1;
      this.marked2 = marked2;
      repaint();
   }
}

